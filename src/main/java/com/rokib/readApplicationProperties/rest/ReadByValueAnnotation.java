package com.rokib.readApplicationProperties.rest;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/rest/readByValueAnnotation")
public class ReadByValueAnnotation {

    @Value("${name}")
    private String name;
    @Value("${app.constants.appId}")
    private String appId;
    @Value("${app.constants.appKey}")
    private String appKey;
    @Value("${app.constants.clientId}")
    private String clientId;
    @Value("${app.constants.clientKey}")
    private String clientKey;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successful")
    })
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/getConfig")
    public ResponseEntity<?> getAppConfig() {
        HashMap<String, Object> appConfig = new HashMap<>();
        appConfig.put("name", name);
        appConfig.put("appId", appId);
        appConfig.put("appKey", appKey);
        appConfig.put("clientId", clientId);
        appConfig.put("clientKey", clientKey);
        return ResponseEntity.ok(appConfig);
    }
}
