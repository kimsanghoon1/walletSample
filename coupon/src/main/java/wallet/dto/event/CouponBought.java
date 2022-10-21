package wallet.dto.event;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CouponBought extends AbstractEvent {

    private Long id;

    public CouponBought(){
        super();
    }
}