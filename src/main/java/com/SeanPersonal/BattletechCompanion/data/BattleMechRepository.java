package com.SeanPersonal.BattletechCompanion.data;

import com.SeanPersonal.BattletechCompanion.models.BattleMech;
import org.springframework.data.repository.CrudRepository;

public interface BattleMechRepository extends CrudRepository<BattleMech, Integer> {
}
