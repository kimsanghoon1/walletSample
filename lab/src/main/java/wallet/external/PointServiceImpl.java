package wallet.external;

import org.springframework.stereotype.Service;

@Service
public class PointServiceImpl implements PointService {


    /**
     * Fallback
     */
    public Point getPoint(Long id) {
        Point point = new Point();
        return point;
    }

}

