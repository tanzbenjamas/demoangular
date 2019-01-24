package com.example.demo.repository;
import com.example.demo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface CarRepository extends JpaRepository<Car, Long> {
    Car findByCarId(String car);

	}