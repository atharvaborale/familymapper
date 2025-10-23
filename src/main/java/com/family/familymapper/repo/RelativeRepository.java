package com.family.familymapper.repo;

import com.family.familymapper.entity.Relative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RelativeRepository extends JpaRepository <Relative, Long> {
}
