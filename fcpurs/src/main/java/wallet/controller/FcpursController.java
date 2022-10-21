
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

import wallet.service.FcpursService;
import wallet.dto.entity.Fcpurs;

@RestController
@RequestMapping(value="/fcpurs")
public class FcpursController{

    @Autowired
    FcpursService fcpursService;



    @RequestMapping(value="", method=RequestMethod.GET)
    public ResponseEntity<?> getList() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("data", fcpursService.getList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Fcpurs getById(@PathVariable(value="id") Long id){
        Fcpurs fcpurs = fcpursService.getById(id);

        return fcpurs;
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public Fcpurs post(@RequestBody Fcpurs fcpurs){
        fcpursService.save(fcpurs);
        
        return fcpurs;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public void put(@PathVariable(value="id") Long id, @RequestBody Fcpurs fcpurs){
        fcpurs.setId(id);
        fcpursService.update(fcpurs);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<?> deletebyId(@PathVariable(value="id") Long id){
        fcpursService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}