package wallet.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wallet.dto.entity.Logging;
import wallet.mapper.LoggingMapper;

@Service
public class LoggingServiceImpl implements LoggingService{
    @Autowired
    LoggingMapper loggingMapper;
    
    @Override
    public List<Logging> getList(){
        List<Logging> loggingList = loggingMapper.findList();

        return loggingList;
    }

    @Override
    public Logging getById(Long id){
        Logging logging = loggingMapper.findOneById(id);

        return logging;
    }
}

