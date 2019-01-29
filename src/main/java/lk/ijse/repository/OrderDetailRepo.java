package lk.ijse.repository;

import lk.ijse.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepo extends JpaRepository<OrderDetails,Integer> {
}
