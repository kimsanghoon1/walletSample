
package wallet.controller;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wallet.dto.Logging;
import wallet.service.LoggingService;

@RestController
@RequestMapping(value="/loggings")
public class LoggingController{

    @Autowired
    LoggingService loggingService;

    @RequestMapping(value="", method=RequestMethod.GET)
    public ResponseEntity<?> getList(){
        HashMap<String, Object> result = new HashMap<>();

        result.put("data", loggingService.getList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Logging getById(@PathVariable(value="id") Long id){
        Logging logging = loggingService.getById(id);

        return logging;
    }

    
}