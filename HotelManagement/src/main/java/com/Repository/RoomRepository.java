package com.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

}
