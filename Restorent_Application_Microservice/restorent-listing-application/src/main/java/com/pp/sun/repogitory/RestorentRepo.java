package com.pp.sun.repogitory;

import com.pp.sun.entity.RestorentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestorentRepo extends JpaRepository <RestorentEntity,String> {
}
