package com.oceane.echoapp.echoapp.api;

import com.oceane.echoapp.echoapp.api.dto.StatusDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(path = "/api/v1/status")
public class StatusController {

    @GetMapping(path = "/", produces = "application/json")
    @Operation(description = "Get the status", summary = "getStatus")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", 
          content = { @Content(mediaType = "application/json", 
            schema = @Schema(implementation = StatusDto.class)) }),
        @ApiResponse(responseCode = "500", description = "Server error", 
          content = @Content) })
    public StatusDto getStatus() {
        StatusDto status = new StatusDto();
        status.setStatus(1);
        status.setMessage("hello world");
        return status;
    }
    
}

