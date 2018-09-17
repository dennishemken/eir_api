package net.ravenstorm.eir_api.Entities;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Patients")
public class Patient {
  @Id
  private String patientId;

  private Date newMemberSince;
  private String firstName;
  private String lastName;
  private String preferredName;
  private Date dateOfBirth;
  private String addressLineOne;
  private String addressLineTwo;
  private String addressCity;
  private String addressState;
  private String zipcode;
  private String referralSource;
  private String email;
  private String phoneMobile;
  private String phoneHome;
  private String phoneWork;
  private Boolean messageOkMobile;
  private Boolean messageOkHome;
  private Boolean messageOkWork;
  private Boolean messageOkEmail;
  private Boolean healthMessageOkEmail;
  private String employer;
  private String employmentStartDate;
  private String Occupation;
  private Integer hoursWorkedPerWeek;
  private String emergencyContactFirstName;
  private String emergencyContactLastName;
  private String emergencyContactRelationship;
  private String emergencyContactPhoneMobile;
  private Boolean healthInsurance;
  private String insuranceCarrierName;
  private String insurancePolicyHolderFirstName;
  private String insurancePolicyHolderLastName;
  private Date insurancePolicyHolderDateOfBirth;
  private String insurancePolicyHolderPhone;
  private String insurancePolicyHolderAddress;
  private String insurancePolicyHolderCity;
  private String insurancePolicyHolderState;
  private String insurancePolicyHolderZipcode;
  private String insurancePolicyHolderRelationToPatient;
  private String insurancePolicyIdNumber;
  private String insurancePolicyGroupNumber;
  private Double insuranceCoPayAmount;
  private String insuranceCompanyPhone;
  private String insuranceCompanyAddress;
}
