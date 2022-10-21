
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

import wallet.service.LabService;
import wallet.dto.entity.Lab;

@RestController
@RequestMapping(value="/labs")
public class LabController{

    @Autowired
    LabService labService;


    @RequestMapping(value="", method=RequestMethod.GET)
    public ResponseEntity<?> getList() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("data", labService.getList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Lab getById(@PathVariable(value="id") Long id){
        Lab lab = labService.getById(id);

        return lab;
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public Lab post(@RequestBody Lab lab){
        labService.save(lab);
        
        return lab;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public void put(@PathVariable(value="id") Long id, @RequestBody Lab lab){
        lab.setId(id);
        labService.update(lab);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<?> deletebyId(@PathVariable(value="id") Long id){
        labService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}