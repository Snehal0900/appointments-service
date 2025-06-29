package service;

import dto.AppointmentRequestDTO;
import model.Appointment;

public interface AppointmentService {

	public Appointment bookAppointment(AppointmentRequestDTO request);

}
