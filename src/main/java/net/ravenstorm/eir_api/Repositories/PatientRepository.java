package net.ravenstorm.eir_api.Repositories;

import net.ravenstorm.eir_api.Entities.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.*;
import java.util.List;

public interface PatientRepository extends MongoRepository<Patient, String> {
  public Patient findByPatientId(String patientId);
  public List<Patient> findByPatientLastName(String patientLastName);
}
