package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer room;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy"); // para imprimir a data formatada como desejado.
	// colocamos o objeto como estático para que não seja instaciado um novo formato de dado para cada instância do objeto Reservation
	public Reservation(Integer room, Date checkin, Date checkout) throws DomainException {
		if (!checkOut.after(checkIn)) {
			throw new DomainException ("Error in reservation: Check-Out date must be after Check-In date") ;
		}
		this.room = room;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public void UpdateDates (Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException ("Error in Reservation: Check-In and Check-Out dates must be in the future") ;
			
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException ("Error in reservation: Check-Out date must be after Check-In date") ;
		}
			this.checkIn = checkIn;
			this.checkOut = checkOut; 
		
	}
	
	@Override
	public String toString() {
		return "Room "
			  + room
			  + ", check-in: "
			  + sdf.format(checkIn)
			  + ", check-out "
			  +sdf.format(checkOut)
			  +","
			  +duration()
			  +" nights";
			  
		
			  
	}
	
}
