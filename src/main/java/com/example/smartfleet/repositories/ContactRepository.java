package com.example.smartfleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.smartfleet.models.Country;

@Repository
public interface ContactRepository extends JpaRepository<Country, Integer> {

}
