
package wallet.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wallet.dto.entity.Coupon;
import wallet.mapper.CouponMapper;
import wallet.service.CouponService;

@Transactional
@Service
public class CouponServiceImpl implements CouponService{
    @Autowired
    CouponMapper couponMapper;
    
    @Override
    public List<Coupon> getList(){
        List<Coupon> couponList = couponMapper.findList();

        return couponList;
    }

    @Override
    public void save(Coupon coupon){
        
        couponMapper.save(coupon); 

        
        // PUB/SUB
        // if trigger is set as Post~, this line should go below save method
        // CouponBought couponBought = new CouponBought();
        // BeanUtils.copyProperties(coupon, couponBought);
        // couponBought.publish(couponBought.getId());

        
        // Req/Res
        // Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        wallet.external.Point point = new wallet.external.Point();
        // mappings goes here
        Application.applicationContext.getBean(wallet.external.PointService.class)
            .use(point);

        
        
    }

    @Override
    public Coupon getById(Long id){
        Coupon coupon = couponMapper.findOneById(id);

        return coupon;
    }

    @Override
    public void delete(Long id){
        
        couponMapper.deleteById(id); 


    }

    @Override
    public void update(Coupon coupon){

        couponMapper.update(coupon); 



    }
}
