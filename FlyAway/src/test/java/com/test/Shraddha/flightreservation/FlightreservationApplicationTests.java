package com.test.Shraddha.flightreservation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Shraddha.flightreservation.entities.Reservation;
import com.Shraddha.flightreservation.repos.FlightRepository;
import com.Shraddha.flightreservation.repos.PassengerRepository;
import com.Shraddha.flightreservation.repos.ReservationRepository;
import com.Shraddha.flightreservation.util.EmailUtil;
import com.Shraddha.flightreservation.util.PDFGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightreservationApplicationTests {

	@Autowired
	PassengerRepository repo;

	@Autowired
	FlightRepository flightRepo;

	@Autowired
	ReservationRepository reservationRepo;

	@Autowired
	PDFGenerator pdfGenerator;

	@Autowired
	EmailUtil emailUtil;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGenerateItenarary() {
		Reservation reservation = reservationRepo.findOne(1L);
		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		pdfGenerator.generateItinerary(reservation, filePath);
	}

	@Test
	public void testEmail() {
		Reservation reservation = reservationRepo.findOne(1L);
		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		emailUtil.sendItinerary("thippireddy.bharath@gmail.com", filePath);
	}

}
