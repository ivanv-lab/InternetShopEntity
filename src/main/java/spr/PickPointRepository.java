package spr;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PickPointRepository extends CrudRepository<PickPoint, Integer> {
    List<PickPoint> findByAddress(String address);
    PickPoint findById(int id);
}
