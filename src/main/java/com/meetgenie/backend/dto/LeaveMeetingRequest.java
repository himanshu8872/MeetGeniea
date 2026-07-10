package com.meetgenie.backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaveMeetingRequest {

    @NotBlank(message = "Meeting code is required")
    private String meetingCode;
}