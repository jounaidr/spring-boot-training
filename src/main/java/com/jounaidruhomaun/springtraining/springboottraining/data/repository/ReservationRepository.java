package com.jounaidruhomaun.springtraining.springboottraining.data.repository;

import java.sql.Date;


import com.jounaidruhomaun.springtraining.springboottraining.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
