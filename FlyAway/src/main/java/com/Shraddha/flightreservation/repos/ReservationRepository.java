package com.Shraddha.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shraddha.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
