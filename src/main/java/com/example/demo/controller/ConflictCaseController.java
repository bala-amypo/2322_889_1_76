import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import com.example.demo.model.*;
@RestController
@RequestMapping("/api/conflict-cases")
@Tag(name = "Conflict Case")
public class ConflictCaseController {

    private final ConflictCaseService service;

    public ConflictCaseController(ConflictCaseService service) {
        this.service = service;
    }

    @PostMapping
    public ConflictCase create(@RequestBody ConflictCase conflictCase) {
        return service.createCase(conflictCase);
    }

    @PutMapping("/{id}/status")
    public ConflictCase updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return service.updateCaseStatus(id, status);
    }

    @GetMapping("/person/{personId}")
    public List<ConflictCase> getByPerson(
            @PathVariable Long personId) {
        return service.getCasesByPerson(personId);
    }

    @GetMapping("/{id}")
    public ConflictCase getById(@PathVariable Long id) {
        return service.getCaseById(id);
    }

    @GetMapping
    public List<ConflictCase> getAll() {
        return service.getAllCases();
    }
}