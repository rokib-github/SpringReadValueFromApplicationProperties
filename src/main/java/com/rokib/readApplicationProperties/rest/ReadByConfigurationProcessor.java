package com.rokib.readApplicationProperties.rest;

import com.rokib.readApplicationProperties.constants.PropertiesConstants;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/rest/readByConfigurationProcessor")
public class ReadByConfigurationProcessor {

    @Autowired
    private PropertiesConstants propertiesConstants;


    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request Successful")
    })
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/getConfig")
    public ResponseEntity<?> getAppConfig() {
        HashMap<String, Object> appConfig = new HashMap<>();
        appConfig.put("appId", propertiesConstants.getAppId());
        appConfig.put("appKey", propertiesConstants.getAppKey());
        appConfig.put("clientId", propertiesConstants.getClientId());
        appConfig.put("clientKey", propertiesConstants.getClientKey());
        return ResponseEntity.ok(appConfig);
    }
}
