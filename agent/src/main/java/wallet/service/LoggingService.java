
package wallet.service;

import java.util.List;
import wallet.dto.entity.Logging;

public interface LoggingService{
    public List<Logging> getList();

    public Logging getById(Long id);

}