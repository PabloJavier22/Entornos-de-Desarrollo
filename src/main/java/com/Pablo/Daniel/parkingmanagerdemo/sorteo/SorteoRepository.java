package com.Pablo.Daniel.parkingmanagerdemo.sorteo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SorteoRepository extends CrudRepository<Sorteo,Integer>{

}