
package wallet.service;

import java.util.List;
import wallet.dto.entity.Lab;

public interface LabService{
    public List<Lab> getList();

    public void save(Lab lab);

    public Lab getById(Long id);

    public void delete(Long id);

    public void update(Lab lab);
}