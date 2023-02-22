package com.Pablo.Daniel.parkingmanagerdemo.user.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Pablo.Daniel.parkingmanagerdemo.user.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}