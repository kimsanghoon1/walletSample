package wallet.dto.event;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Charged extends AbstractEvent {

    private Long id;

    public Charged(){
        super();
    }
}