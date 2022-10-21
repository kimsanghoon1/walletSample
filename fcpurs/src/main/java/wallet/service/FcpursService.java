
package wallet.service;

import java.util.List;
import wallet.dto.entity.Fcpurs;

public interface FcpursService{
    public List<Fcpurs> getList();

    public void save(Fcpurs fcpurs);

    public Fcpurs getById(Long id);

    public void delete(Long id);

    public void update(Fcpurs fcpurs);
}