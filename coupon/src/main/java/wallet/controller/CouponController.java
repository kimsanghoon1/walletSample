
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

import wallet.service.CouponService;
import wallet.dto.entity.Coupon;

@RestController
@RequestMapping(value="/coupons")
public class CouponController{

    @Autowired
    CouponService couponService;



    @RequestMapping(value="", method=RequestMethod.GET)
    public ResponseEntity<?> getList() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("data", couponService.getList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Coupon getById(@PathVariable(value="id") Long id){
        Coupon coupon = couponService.getById(id);

        return coupon;
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public Coupon post(@RequestBody Coupon coupon){
        couponService.save(coupon);
        
        return coupon;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public void put(@PathVariable(value="id") Long id, @RequestBody Coupon coupon){
        coupon.setId(id);
        couponService.update(coupon);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<?> deletebyId(@PathVariable(value="id") Long id){
        couponService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}