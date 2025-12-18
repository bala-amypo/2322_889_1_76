import java.util.List;

public interface RelationshipDeclarationService {
    RelationshipDeclaration declareRelationship(RelationshipDeclaration declaration);
    List<RelationshipDeclaration> getDeclarationsByPerson(Long personId);
    RelationshipDeclaration verifyDeclaration(Long declarationId, boolean verified);
    List<RelationshipDeclaration> getAllDeclarations();
}