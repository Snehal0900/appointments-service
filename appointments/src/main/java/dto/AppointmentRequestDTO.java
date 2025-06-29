package dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AppointmentRequestDTO {

	@NotBlank(message = "patientId is required")
	private int patientId;
	
	@NotBlank(message = "doctorId is required")
    private int doctorId;
	
	@NotBlank(message = "slotId is required")
    private int slotId;
    
    @NotBlank(message = "Reason is required")
    @Size(min = 1, max = 1000)
    private String reason;
}
