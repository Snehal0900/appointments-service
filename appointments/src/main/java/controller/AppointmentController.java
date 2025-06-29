package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.AppointmentRequestDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import model.Appointment;
import service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping
	public Appointment bookAppointment(@RequestBody AppointmentRequestDTO request) {
		return appointmentService.bookAppointment(request);
    }
}
