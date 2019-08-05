package com.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Model.Floor;
import com.Model.Room;
import com.Repository.FloorRepository;
import com.Repository.RoomRepository;
import com.Service.FloorService;

@Service
@Transactional
public class FloorServiceImp implements FloorService{

	@Autowired
	FloorRepository floorrepository;
	
	
	public Floor createFloor(Floor floor) {
		return floorrepository.save(floor);
	}


	
	
	public List<Floor> getAllFloors() {
		// TODO Auto-generated method stub
		
		
		return (List<Floor>) floorrepository.findAll();
	}
	
	

}
