package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
