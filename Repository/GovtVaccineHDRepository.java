package net.javaguides.GovtVaccinneHD.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import net.javaguides.GovtVaccinneHD.model.Govtvaccinehd;

@Repository
public interface GovtVaccineHDRepository extends JpaRepository<Govtvaccinehd,Long>{

}
