package com.greentech.greenconnect2.dao;

import com.greentech.greenconnect2.entities.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
