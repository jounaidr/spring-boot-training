package com.jounaidruhomaun.springtraining.springboottraining.data.repository;


import com.jounaidruhomaun.springtraining.springboottraining.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
