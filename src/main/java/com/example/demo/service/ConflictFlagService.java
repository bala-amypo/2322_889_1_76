import java.util.List;
import com.example.demo.model.*;
public interface ConflictFlagService {
    ConflictFlag addFlag(ConflictFlag flag);
    List<ConflictFlag> getFlagsByCase(Long caseId);
    ConflictFlag getFlagById(Long id);
    List<ConflictFlag> getAllFlags();
}