package de.ars.samples.lambda.domain;

import java.time.LocalDate;
import java.util.UUID;

public class RoomReservationService {

    public UUID doReservation(String roomNumber, LocalDate date)
            throws RoomReservationUnavailableException, RoomReservationInvalidException {

        // validation -> we could include Jakarta Bean Validation here
        if (roomNumber == null || date == null || date.isBefore(LocalDate.now())) {
            throw new RoomReservationInvalidException();
        }
        // just a simple random implementation
        if (Math.random() < 0.5) {
            return UUID.randomUUID();
        } else {
            throw new RoomReservationUnavailableException();
        }

    }

}
