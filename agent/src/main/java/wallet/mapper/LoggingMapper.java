package wallet.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import wallet.dto.entity.Logging;

@Mapper
public interface LoggingMapper{
    public List<Logging> findList();

    public Logging findOneById(Long id);
} 