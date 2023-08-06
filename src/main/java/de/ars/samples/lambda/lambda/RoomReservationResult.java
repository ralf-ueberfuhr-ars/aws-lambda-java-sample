package de.ars.samples.lambda.lambda;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder(access = AccessLevel.PRIVATE)
@Getter
public class RoomReservationResult {

    private RoomReservationStatus status;
    private UUID uuid;

    public static RoomReservationResult ok(UUID uuid) {
        return RoomReservationResult
                .builder()
                .status(RoomReservationStatus.SUCCESSFUL)
                .uuid(uuid)
                .build();
    }

    public static RoomReservationResult unavailable() {
        return RoomReservationResult
                .builder()
                .status(RoomReservationStatus.UNAVAILABLE)
                .build();
    }

    public static RoomReservationResult invalid() {
        return RoomReservationResult
                .builder()
                .status(RoomReservationStatus.INVALID)
                .build();
    }

}
