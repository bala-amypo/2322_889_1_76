import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RestController
@RequestMapping("/api/engagements")
@Tag(name = "Vendor Engagement")
public class VendorEngagementController {

    private final VendorEngagementService service;

    public VendorEngagementController(VendorEngagementService service) {
        this.service = service;
    }

    @PostMapping
    public VendorEngagementRecord add(
            @RequestBody VendorEngagementRecord record) {
        return service.addEngagement(record);
    }

    @GetMapping("/employee/{employeeId}")
    public List<VendorEngagementRecord> getByEmployee(
            @PathVariable Long employeeId) {
        return service.getEngagementsByEmployee(employeeId);
    }

    @GetMapping("/vendor/{vendorId}")
    public List<VendorEngagementRecord> getByVendor(
            @PathVariable Long vendorId) {
        return service.getEngagementsByVendor(vendorId);
    }

    @GetMapping
    public List<VendorEngagementRecord> getAll() {
        return service.getAllEngagements();
    }
}