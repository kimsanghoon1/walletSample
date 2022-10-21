
package wallet.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wallet.dto.entity.Fcpurs;
import wallet.mapper.FcpursMapper;
import wallet.service.FcpursService;

@Transactional
@Service
public class FcpursServiceImpl implements FcpursService{
    @Autowired
    FcpursMapper fcpursMapper;
    
    @Override
    public List<Fcpurs> getList(){
        List<Fcpurs> fcpursList = fcpursMapper.findList();

        return fcpursList;
    }

    @Override
    public void save(Fcpurs fcpurs){
        
        fcpursMapper.save(fcpurs); 

        
        // PUB/SUB
        // if trigger is set as Post~, this line should go below save method
        // Exchanged exchanged = new Exchanged();
        // BeanUtils.copyProperties(fcpurs, exchanged);
        // exchanged.publish(exchanged.getId());

        
        
        
    }

    @Override
    public Fcpurs getById(Long id){
        Fcpurs fcpurs = fcpursMapper.findOneById(id);

        return fcpurs;
    }

    @Override
    public void delete(Long id){
        
        fcpursMapper.deleteById(id); 


    }

    @Override
    public void update(Fcpurs fcpurs){

        fcpursMapper.update(fcpurs); 



    }
}
