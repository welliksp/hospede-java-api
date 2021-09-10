package br.com.hotel.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_hotel_check_in")
public class CheckInModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotel_check_in_id")
	private int checkInId;
	@Column(name = "hotel_check_in_aditional")
	private boolean aditional;

	private GuestModel guestModel;
	@Column(name = "hotel_check_in_data_start")
	private LocalDateTime dateStart;
	@Column(name = "hotel_check_in_data_end")
	private LocalDateTime dateEnd;

	public CheckInModel() {
		this.dateStart = LocalDateTime.now();
		
	}
	

	public LocalDateTime getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDateTime dateStart) {
		this.dateStart = dateStart;
	}

	public LocalDateTime getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDateTime dateEnd) {
		this.dateEnd = dateEnd;
	}

	public int getCheckInId() {
		return checkInId;
	}

	public void setCheckInId(int checkInId) {
		this.checkInId = checkInId;
	}

	public GuestModel getGuestModel() {
		return guestModel;
	}

	public void setGuestModel(GuestModel guestModel) {
		this.guestModel = guestModel;
	}
	

	public boolean isAditional() {
		return aditional;
	}

	public void setAditional(boolean aditional) {
		this.aditional = aditional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}







}
