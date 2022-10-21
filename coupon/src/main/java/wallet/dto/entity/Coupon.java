package wallet.dto.entity;

import java.util.Date;
import lombok.Data;
@Data
public class Coupon{
    private Long id;
    private String couponName;
    private Integer couponQty;
    private String userName;

    
}