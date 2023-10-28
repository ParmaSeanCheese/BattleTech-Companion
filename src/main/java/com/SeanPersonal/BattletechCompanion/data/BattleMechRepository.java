package com.SeanPersonal.BattletechCompanion.data;

import com.SeanPersonal.BattletechCompanion.models.BattleMech;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleMechRepository extends CrudRepository<BattleMech, Integer> {
}
