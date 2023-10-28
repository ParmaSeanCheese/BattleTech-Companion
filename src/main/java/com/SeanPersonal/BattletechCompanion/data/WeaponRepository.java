package com.SeanPersonal.BattletechCompanion.data;

import com.SeanPersonal.BattletechCompanion.models.Weapon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends CrudRepository<Weapon, Integer> {
}
