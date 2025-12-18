import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RestController
@RequestMapping("/api/relationships")
@Tag(name = "Relationship Declaration")
public class RelationshipDeclarationController {

    private final RelationshipDeclarationService service;

    public RelationshipDeclarationController(RelationshipDeclarationService service) {
        this.service = service;
    }

    @PostMapping
    public RelationshipDeclaration declare(
            @RequestBody RelationshipDeclaration declaration) {
        return service.declareRelationship(declaration);
    }

    @GetMapping("/person/{personId}")
    public List<RelationshipDeclaration> getByPerson(
            @PathVariable Long personId) {
        return service.getDeclarationsByPerson(personId);
    }

    @PutMapping("/{id}/verify")
    public RelationshipDeclaration verify(
            @PathVariable Long id,
            @RequestParam boolean verified) {
        return service.verifyDeclaration(id, verified);
    }

    @GetMapping
    public List<RelationshipDeclaration> getAll() {
        return service.getAllDeclarations();
    }
}