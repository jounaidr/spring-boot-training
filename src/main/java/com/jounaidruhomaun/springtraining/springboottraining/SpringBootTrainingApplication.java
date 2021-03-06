package com.jounaidruhomaun.springtraining.springboottraining;

import com.jounaidruhomaun.springtraining.springboottraining.data.entity.Guest;
import com.jounaidruhomaun.springtraining.springboottraining.data.entity.Reservation;
import com.jounaidruhomaun.springtraining.springboottraining.data.entity.Room;
import com.jounaidruhomaun.springtraining.springboottraining.data.repository.GuestRepository;
import com.jounaidruhomaun.springtraining.springboottraining.data.repository.ReservationRepository;
import com.jounaidruhomaun.springtraining.springboottraining.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}

}
