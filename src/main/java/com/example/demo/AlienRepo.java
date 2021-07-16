package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

	Alien getOne(int aid);

	

}
