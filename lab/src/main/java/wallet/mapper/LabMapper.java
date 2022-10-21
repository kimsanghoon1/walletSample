package wallet.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import wallet.dto.entity.Lab;

@Mapper
public interface LabMapper{
    public List<Lab> findList();

    public Lab findOneById(Long id);

    public void save(Lab lab);

    public void update(Lab lab);

    public void deleteById(Long id);
} 