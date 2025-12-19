import java.util.List;
import com.example.demo.model.*;
public interface VendorEngagementService {
    VendorEngagementRecord addEngagement(VendorEngagementRecord record);
    List<VendorEngagementRecord> getEngagementsByEmployee(Long employeeId);
    List<VendorEngagementRecord> getEngagementsByVendor(Long vendorId);
    List<VendorEngagementRecord> getAllEngagements();
}