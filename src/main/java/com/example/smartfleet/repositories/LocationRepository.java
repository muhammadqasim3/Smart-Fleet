package com.example.smartfleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.smartfleet.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
