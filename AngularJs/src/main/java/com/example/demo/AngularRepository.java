package com.example.demo;

import org.springframework.data.repository.CrudRepository;



public interface AngularRepository extends CrudRepository<Model, Long> {
	Model save(NgService ngService);
}
