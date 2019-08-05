package com.HotelController;



import java.util.List;
import java.util.Optional;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.Model.Floor;
import com.Model.Room;
import com.Service.FloorService;
import com.Service.RoomService;



@RestController
public class HotelController {
	@Autowired
	FloorService floorService;
	
	@Autowired
	RoomService roomService;
	 @RequestMapping(value="/floor", method = RequestMethod.POST)
	 public Floor createFloor(@RequestBody Floor floor) {
		return floorService.createFloor(floor);
		 
	 }
	 
	 @RequestMapping(value="/room", method = RequestMethod.POST)
	 public Room createRoom(@RequestBody Room room) {
			return roomService.createRoom(room);
			 
		 }
	 
	 @RequestMapping(value="/rooms", method = RequestMethod.GET)
	 public List<Room> getAllRooms() {
			return roomService.getAllRooms();
			 
		 }
	 @RequestMapping(value="/room/{id}", method = RequestMethod.GET)
  public Optional<Room> getRoomById(@PathVariable @NotNull @DecimalMin("0") long id) {
		 return roomService.getRoomById(id);
	 }
	 
	 @RequestMapping(value="/floors", method = RequestMethod.GET)
	 public List<Floor> getAllFloors() {
			return floorService.getAllFloors();
			 
		 }
	 
	 
}
