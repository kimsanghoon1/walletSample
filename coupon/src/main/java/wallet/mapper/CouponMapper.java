package wallet.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import wallet.dto.entity.Coupon;

@Mapper
public interface CouponMapper{
    public List<Coupon> findList();

    public Coupon findOneById(Long id);

    public void save(Coupon coupon);

    public void update(Coupon coupon);

    public void deleteById(Long id);
} 