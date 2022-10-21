package wallet.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import wallet.dto.entity.Fcpurs;

@Mapper
public interface FcpursMapper{
    public List<Fcpurs> findList();

    public Fcpurs findOneById(Long id);

    public void save(Fcpurs fcpurs);

    public void update(Fcpurs fcpurs);

    public void deleteById(Long id);
} 