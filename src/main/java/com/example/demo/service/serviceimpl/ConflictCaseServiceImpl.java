import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConflictCaseServiceImpl implements ConflictCaseService {

    private final ConflictCaseRepository repository;

    public ConflictCaseServiceImpl(ConflictCaseRepository repository) {
        this.repository = repository;
    }

    public ConflictCase createCase(ConflictCase conflictCase) {
        return repository.save(conflictCase);
    }

    public ConflictCase updateCaseStatus(Long id, String status) {
        ConflictCase c = repository.findById(id).orElse(null);
        if (c != null) {
            c.setStatus(status);
            return repository.save(c);
        }
        return null;
    }

    public List<ConflictCase> getCasesByPerson(Long personId) {
        return repository.findByPersonId(personId);
    }

    public ConflictCase getCaseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<ConflictCase> getAllCases() {
        return repository.findAll();
    }
}