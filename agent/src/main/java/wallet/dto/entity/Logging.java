package wallet.dto.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Logging{
        private Long id;
        private Date timestamp;
        private String eventName;
        private String serviceName;

}