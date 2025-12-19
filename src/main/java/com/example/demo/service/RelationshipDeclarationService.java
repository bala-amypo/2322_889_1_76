import java.util.List;
import com.example.demo.model.*;
public interface RelationshipDeclarationService {
    RelationshipDeclaration declareRelationship(RelationshipDeclaration declaration);
    List<RelationshipDeclaration> getDeclarationsByPerson(Long personId);
    RelationshipDeclaration verifyDeclaration(Long declarationId, boolean verified);
    List<RelationshipDeclaration> getAllDeclarations();
}