package com.Shraddha.flightreservation.services;

import com.Shraddha.flightreservation.dto.ReservationRequest;
import com.Shraddha.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
