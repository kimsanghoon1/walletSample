
package wallet.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wallet.dto.entity.Lab;
import wallet.mapper.LabMapper;
import wallet.service.LabService;

@Transactional
@Service
public class LabServiceImpl implements LabService{
    @Autowired
    LabMapper labMapper;
    
    @Override
    public List<Lab> getList(){
        List<Lab> labList = labMapper.findList();

        return labList;
    }

    @Override
    public void save(Lab lab){
        
        labMapper.save(lab); 

        
        // PUB/SUB
        // if trigger is set as Post~, this line should go below save method
        // PointCreated pointCreated = new PointCreated();
        // BeanUtils.copyProperties(lab, pointCreated);
        // pointCreated.publish(pointCreated.getId());

        
        // Req/Res
        // Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        wallet.external.Point point = new wallet.external.Point();
        // mappings goes here
        Application.applicationContext.getBean(wallet.external.PointService.class)
            .charge(point);

        
        
    }

    @Override
    public Lab getById(Long id){
        Lab lab = labMapper.findOneById(id);

        return lab;
    }

    @Override
    public void delete(Long id){
        
        labMapper.deleteById(id); 


    }

    @Override
    public void update(Lab lab){

        labMapper.update(lab); 



    }
}
