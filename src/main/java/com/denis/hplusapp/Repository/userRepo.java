package com.denis.hplusapp.Repository;

import com.denis.hplusapp.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<Users, Integer> {

}
