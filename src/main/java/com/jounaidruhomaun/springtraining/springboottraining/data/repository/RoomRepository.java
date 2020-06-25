package com.jounaidruhomaun.springtraining.springboottraining.data.repository;

import com.jounaidruhomaun.springtraining.springboottraining.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
