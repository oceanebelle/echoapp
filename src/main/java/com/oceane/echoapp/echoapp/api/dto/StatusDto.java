package com.oceane.echoapp.echoapp.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Holds the Status", name = "Status", requiredProperties = {"status", "message"})
@Data
@NoArgsConstructor
public class StatusDto {
    @Schema(description = "Status code")
    private int status;

    @Schema(description = "Status message")
    private String message;
}