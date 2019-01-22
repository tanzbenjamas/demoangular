package com.example.demo.repository;
import com.example.demo.entity.CarInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface CarInformationRepository extends JpaRepository<CarInformation, Long> {
    CarInformation findBycarInformation (String carinformation);

	}