package com.stepan.services.admin.repository;

import com.stepan.services.admin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Michal on 17.12.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
