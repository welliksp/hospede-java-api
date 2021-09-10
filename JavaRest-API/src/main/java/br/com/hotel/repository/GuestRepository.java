package br.com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.model.GuestModel;

public interface GuestRepository extends JpaRepository<GuestModel, Integer>{
	

}
