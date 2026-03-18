package com.eveup.tickets.services;

import com.eveup.tickets.domain.CreateEventRequest;
import com.eveup.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
