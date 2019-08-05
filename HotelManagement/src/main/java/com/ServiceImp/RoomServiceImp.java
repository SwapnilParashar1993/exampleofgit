package com.ServiceImp;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Model.Floor;
import com.Model.Room;
import com.Repository.FloorRepository;
import com.Repository.RoomRepository;
import com.Service.RoomService;

@Service
@Transactional
public class RoomServiceImp implements RoomService {
	
	@Autowired
	RoomRepository roomrepository;
    public Room createRoom(Room room) {
		
		return roomrepository.save(room);
	}
	
	public List<Room> getAllRooms() {
		
		return    (List<Room>) roomrepository.findAll();
	}

	
	public Optional<Room> getRoomById(long id) {
		
		return roomrepository.findById(id);
		
	}

	
	

	
}
