import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RelationshipDeclarationServiceImpl
        implements RelationshipDeclarationService {

    private final RelationshipDeclarationRepository repository;

    public RelationshipDeclarationServiceImpl(RelationshipDeclarationRepository repository) {
        this.repository = repository;
    }

    public RelationshipDeclaration declareRelationship(RelationshipDeclaration declaration) {
        return repository.save(declaration);
    }

    public List<RelationshipDeclaration> getDeclarationsByPerson(Long personId) {
        return repository.findByPersonId(personId);
    }

    public RelationshipDeclaration verifyDeclaration(Long id, boolean verified) {
        RelationshipDeclaration d = repository.findById(id).orElse(null);
        if (d != null) {
            d.setVerified(verified);
            return repository.save(d);
        }
        return null;
    }

    public List<RelationshipDeclaration> getAllDeclarations() {
        return repository.findAll();
    }
}