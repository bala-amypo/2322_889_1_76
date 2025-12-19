import java.util.List;
import com.example.demo.model.*;
public interface ConflictCaseService {
    ConflictCase createCase(ConflictCase conflictCase);
    ConflictCase updateCaseStatus(Long caseId, String status);
    List<ConflictCase> getCasesByPerson(Long personId);
    ConflictCase getCaseById(Long id);
    List<ConflictCase> getAllCases();
}