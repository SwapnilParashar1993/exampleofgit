package com.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.Model.Floor;
import com.Model.Room;

public interface RoomService {

	
	public Room createRoom(Room room);

	public List<Room> getAllRooms();

	public Optional<Room> getRoomById(long id);



	
}
