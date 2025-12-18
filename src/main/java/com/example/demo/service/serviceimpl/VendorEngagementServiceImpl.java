import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VendorEngagementServiceImpl
        implements VendorEngagementService {

    private final VendorEngagementRepository repository;

    public VendorEngagementServiceImpl(VendorEngagementRepository repository) {
        this.repository = repository;
    }

    public VendorEngagementRecord addEngagement(VendorEngagementRecord record) {
        return repository.save(record);
    }

    public List<VendorEngagementRecord> getEngagementsByEmployee(Long employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    public List<VendorEngagementRecord> getEngagementsByVendor(Long vendorId) {
        return repository.findByVendorId(vendorId);
    }

    public List<VendorEngagementRecord> getAllEngagements() {
        return repository.findAll();
    }
}