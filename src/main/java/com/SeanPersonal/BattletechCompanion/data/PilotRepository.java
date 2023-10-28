package com.SeanPersonal.BattletechCompanion.data;

import com.SeanPersonal.BattletechCompanion.models.Pilot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotRepository extends CrudRepository<Pilot, Integer> {
}
