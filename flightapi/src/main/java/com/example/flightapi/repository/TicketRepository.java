package com.example.flightapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightapi.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}