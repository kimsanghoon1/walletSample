
package wallet.service;

import java.util.List;
import wallet.dto.entity.Coupon;

public interface CouponService{
    public List<Coupon> getList();

    public void save(Coupon coupon);

    public Coupon getById(Long id);

    public void delete(Long id);

    public void update(Coupon coupon);
}