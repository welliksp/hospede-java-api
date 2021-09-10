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
public class CheckInController {


}