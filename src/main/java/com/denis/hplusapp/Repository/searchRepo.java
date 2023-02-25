package com.denis.hplusapp.Repository;

import com.denis.hplusapp.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface searchRepo extends JpaRepository<Products, Integer> {

    @Query("select p from Products p where p.name like %:name%")
    List<Products> searchByName(@Param("name") String name);

}
