package potato.tea_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import potato.tea_api.model.Tea;

public interface TeaRepository extends JpaRepository<Tea, Integer> {
}