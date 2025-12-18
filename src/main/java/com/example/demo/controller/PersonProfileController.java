import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RestController
@RequestMapping("/api/persons")
@Tag(name = "Person Profile")
public class PersonProfileController {

    private final PersonProfileService service;

    public PersonProfileController(PersonProfileService service) {
        this.service = service;
    }

    @PostMapping
    public PersonProfile create(@RequestBody PersonProfile person) {
        return service.createPerson(person);
    }

    @GetMapping("/{id}")
    public PersonProfile getById(@PathVariable Long id) {
        return service.getPersonById(id);
    }

    @GetMapping
    public List<PersonProfile> getAll() {
        return service.getAllPersons();
    }

    @PutMapping("/{id}/relationship-declared")
    public PersonProfile updateRelationshipDeclared(
            @PathVariable Long id,
            @RequestParam boolean declared) {
        return service.updateRelationshipDeclared(id, declared);
    }

    @GetMapping("/lookup/{referenceId}")
    public PersonProfile getByReferenceId(@PathVariable String referenceId) {
        return service.findByReferenceId(referenceId);
    }
}