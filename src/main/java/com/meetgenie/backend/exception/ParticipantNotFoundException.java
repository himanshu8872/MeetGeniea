package com.meetgenie.backend.exception;

public class ParticipantNotFoundException extends RuntimeException {

    public ParticipantNotFoundException() {
        super("You are not a participant of this meeting.");
    }
}