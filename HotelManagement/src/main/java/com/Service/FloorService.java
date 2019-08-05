package com.Service;


import java.util.List;

import com.Model.Floor;



public interface FloorService {
	
	public Floor createFloor(Floor floor);
	public List<Floor> getAllFloors();
	

}
