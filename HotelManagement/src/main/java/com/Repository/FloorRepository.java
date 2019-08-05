package com.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Model.Floor;


@Repository
public interface FloorRepository extends CrudRepository<Floor, Long>{

}
