package com.meetgenie.backend.exception;

public class AlreadyJoinedMeetingException extends RuntimeException {

    public AlreadyJoinedMeetingException() {
        super("User has already joined this meeting.");
    }
}