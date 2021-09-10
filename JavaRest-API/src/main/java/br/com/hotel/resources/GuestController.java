package br.com.hotel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hotel.model.CheckInModel;
import br.com.hotel.model.GuestModel;
import br.com.hotel.repository.CheckInRepository;
import br.com.hotel.repository.GuestRepository;

@RestController
@RequestMapping(value = "/api")
public class GuestController {


	@Autowired
	GuestRepository repository;

	@Autowired
	CheckInRepository checkin;

	@GetMapping("/find")
	public List<GuestModel> findAll() {
		return repository.findAll();
	}

	@GetMapping("/hotel/find/{id}")
	public List<GuestModel> findById(@PathVariable(value = "id") Long id) {
		List<GuestModel> guestList = new ArrayList<GuestModel>();
		for (GuestModel guest : findAll()) {
			if (guest.getDocument() == id) {
				guestList.add(guest);
			}
		}
		return guestList;
	}

	@GetMapping("/hotel/find/{phone}")
	public List<GuestModel> findByPhone(@PathVariable(value = "phone") String id) {
		List<GuestModel> guestList = new ArrayList<GuestModel>();
		for (GuestModel guest : findAll()) {
			if (guest.getPhone().equals(id)) {
				guestList.add(guest);
			}
		}
		return guestList;
	}

	@GetMapping("/find/{name}")
	public List<GuestModel> findByName(@PathVariable(value = "name") String name) {
		List<GuestModel> guestList = new ArrayList<GuestModel>();
		for (GuestModel guest : findAll()) {
			try {
				if (guest.getGuestName().contains(name)) {
					guestList.add(guest);
				}
			} catch (Exception e) {
				System.out.println("Nome nao encontrado");
			}
		}
		return guestList;
	}

	@PostMapping("/save")
	public GuestModel save(@RequestBody GuestModel guest) {
		return repository.save(guest);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody GuestModel guest) {
		repository.delete(guest);
	}

	@PutMapping("/update")
	public GuestModel update(@RequestBody GuestModel guest) {
		return repository.save(guest);
	}

	@GetMapping("/checkin/find")
	public List<CheckInModel> findCheckinAll() {
		return checkin.findAll();
	}

	
	@PostMapping("/checkin/save")
	public CheckInModel saveCheckIn(@RequestBody CheckInModel check) {
		return checkin.save(check);
	}
	
	@PutMapping("/checkin/update")
	public CheckInModel updateCheckin(@RequestBody CheckInModel check) {
		return checkin.save(check);
	}

}