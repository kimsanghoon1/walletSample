
package wallet.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wallet.dto.entity.Point;
import wallet.mapper.PointMapper;
import wallet.service.PointService;

@Transactional
@Service
public class PointServiceImpl implements PointService{
    @Autowired
    PointMapper pointMapper;
    
    @Override
    public List<Point> getList(){
        List<Point> pointList = pointMapper.findList();

        return pointList;
    }

    @Override
    public void save(Point point){
        
        pointMapper.save(point); 

        
        // PUB/SUB
        // if trigger is set as Post~, this line should go below save method
        // Charged charged = new Charged();
        // BeanUtils.copyProperties(point, charged);
        // charged.publish(charged.getId());

        
        
        
        // PUB/SUB
        // if trigger is set as Post~, this line should go below save method
        // Used used = new Used();
        // BeanUtils.copyProperties(point, used);
        // used.publish(used.getId());

        
        
        
    }

    @Override
    public Point getById(Long id){
        Point point = pointMapper.findOneById(id);

        return point;
    }

    @Override
    public void delete(Long id){
        
        pointMapper.deleteById(id); 


    }

    @Override
    public void update(Point point){

        pointMapper.update(point); 



    }
}
