package com.vinnovatelabz.airbooking.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="reservations")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="res_date_time")
	private Timestamp resDateTime = Timestamp.valueOf(LocalDateTime.now());

	@Column(name="journey_date")
	private Date journeyDate;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="pnr")
	private Ticket ticket;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="payment_id")
	private Payment payment;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="reservation_id")
	private List<Passenger> passengers;

	public Reservation(Ticket ticket, Date journeyDate, Payment payment) {
		this.ticket = ticket;
		this.journeyDate = journeyDate;
		this.payment = payment;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Reservation() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getResDateTime() {
		return resDateTime;
	}

	public void setResDateTime(Timestamp resDateTime) {
		this.resDateTime = resDateTime;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void add(Passenger passenger){
		passengers.add(passenger);
	}
}
