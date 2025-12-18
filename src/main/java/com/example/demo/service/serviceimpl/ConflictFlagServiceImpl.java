import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConflictFlagServiceImpl implements ConflictFlagService {

    private final ConflictFlagRepository repository;

    public ConflictFlagServiceImpl(ConflictFlagRepository repository) {
        this.repository = repository;
    }

    public ConflictFlag addFlag(ConflictFlag flag) {
        return repository.save(flag);
    }

    public List<ConflictFlag> getFlagsByCase(Long caseId) {
        return repository.findByCaseId(caseId);
    }

    public ConflictFlag getFlagById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<ConflictFlag> getAllFlags() {
        return repository.findAll();
    }
}