package br.com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.model.CheckInModel;

public interface CheckInRepository extends JpaRepository<CheckInModel, Integer>{
	

}
