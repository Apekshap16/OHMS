package com.receptionist.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.receptionist.model.Reservation;
import com.receptionist.repository.ReservationRepo;

@Service
public class ReservationServiceImpl {

//	@Autowired
//	private ReservationRepo repos;
//	@Autowired
//	private RestTemplate restTmp;
//
//	@Override
//	public String addReservation(Reservation book) {
//		Room room = restTmp.getForObject("http://localhost:8084/rooms/findById/" + book.getRoomId(), Room.class);
//		if (room.isRoomAvl()) {
//			repos.insert(book);
//			room.setRoomAvl(false);
//			restTmp.put("http://localhost:8084/rooms/updateRoom", room);
//			return "Room Number " + room.getRoomId() + " booked for Guest : ";
//		} else {
//			return "Room Already Booked";
//		}
//
//	}
//
////	public Reservation addReservation(Reservation book) {
////	return repos.save(book);
////
////
////	}
//
//	@Override
//	public Reservation updateReservation(Reservation book) {
//		return repos.save(book);
//	}
//
//	@Override
////	public  void delete(Long bookingId) {
////		repos.deleteById(bookingId);
////
////	}
//	public String deleteReservation(long parseLong) {
//		Optional<Reservation> res = repos.findById(parseLong);
//		Reservation res1 = res.get();
//		Room room = restTmp.getForObject("http://localhost:8084/rooms/delete/" + res1.getRoomId(), Room.class);
//		room.setRoomAvl(true);
//		restTmp.put("http://localhost:8084/rooms/updateRoom", room);
//		repos.deleteById(parseLong);
//		return "Deleted Reservation ID : " + parseLong;
//	}
//
//	@Override
//	public List<Reservation> getResList() {
//		return repos.findAll();
//	}
//
//	@Override
//	public Optional<Reservation> getReservation(long parseLong) {
//		return repos.findById(parseLong);
//	}
//
//	
//
//	
//
//}




	@Autowired
	private ReservationRepo Repo;




	public List<Reservation> getAllReservation()
	{
	List<Reservation> Rsvn=new ArrayList<>();
	Repo.findAll()
	.forEach(Rsvn::add);
	return Rsvn;
	}



	public void addReservation(Reservation Rsvn) {
	Repo.save(Rsvn);




	}




	
	public void delete(Long bookingId) {
	Repo.deleteById(bookingId);



	}



	public List<Reservation> getResList() {
	// TODO Auto-generated method stub
	return Repo.findAll();
	}


	



	public void updateReservation(Reservation rsvn) {
		// TODO Auto-generated method stub
		Repo.save(rsvn);
		
	}


	
	}




	

