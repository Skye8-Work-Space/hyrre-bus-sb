package com.skye8.elroykanye.hyrrebus.repository;

import com.skye8.elroykanye.hyrrebus.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {

    Optional<Agency> findByAgencyName(String agencyName);

    void deleteByAgencyName(String agencyName);
}
