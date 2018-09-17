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

  public Patient(Date newMemberSince, String firstName, String lastName,
      String preferredName, Date dateOfBirth, String addressLineOne, String addressLineTwo,
      String addressCity, String addressState, String zipcode, String referralSource,
      String email, String phoneMobile, String phoneHome, String phoneWork,
      Boolean messageOkMobile, Boolean messageOkHome, Boolean messageOkWork,
      Boolean messageOkEmail, Boolean healthMessageOkEmail, String employer,
      String employmentStartDate, String occupation, Integer hoursWorkedPerWeek,
      String emergencyContactFirstName, String emergencyContactLastName,
      String emergencyContactRelationship, String emergencyContactPhoneMobile,
      Boolean healthInsurance, String insuranceCarrierName,
      String insurancePolicyHolderFirstName, String insurancePolicyHolderLastName,
      Date insurancePolicyHolderDateOfBirth, String insurancePolicyHolderPhone,
      String insurancePolicyHolderAddress, String insurancePolicyHolderCity,
      String insurancePolicyHolderState, String insurancePolicyHolderZipcode,
      String insurancePolicyHolderRelationToPatient, String insurancePolicyIdNumber,
      String insurancePolicyGroupNumber, Double insuranceCoPayAmount,
      String insuranceCompanyPhone, String insuranceCompanyAddress) {
    this.newMemberSince = newMemberSince;
    this.firstName = firstName;
    this.lastName = lastName;
    this.preferredName = preferredName;
    this.dateOfBirth = dateOfBirth;
    this.addressLineOne = addressLineOne;
    this.addressLineTwo = addressLineTwo;
    this.addressCity = addressCity;
    this.addressState = addressState;
    this.zipcode = zipcode;
    this.referralSource = referralSource;
    this.email = email;
    this.phoneMobile = phoneMobile;
    this.phoneHome = phoneHome;
    this.phoneWork = phoneWork;
    this.messageOkMobile = messageOkMobile;
    this.messageOkHome = messageOkHome;
    this.messageOkWork = messageOkWork;
    this.messageOkEmail = messageOkEmail;
    this.healthMessageOkEmail = healthMessageOkEmail;
    this.employer = employer;
    this.employmentStartDate = employmentStartDate;
    Occupation = occupation;
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    this.emergencyContactFirstName = emergencyContactFirstName;
    this.emergencyContactLastName = emergencyContactLastName;
    this.emergencyContactRelationship = emergencyContactRelationship;
    this.emergencyContactPhoneMobile = emergencyContactPhoneMobile;
    this.healthInsurance = healthInsurance;
    this.insuranceCarrierName = insuranceCarrierName;
    this.insurancePolicyHolderFirstName = insurancePolicyHolderFirstName;
    this.insurancePolicyHolderLastName = insurancePolicyHolderLastName;
    this.insurancePolicyHolderDateOfBirth = insurancePolicyHolderDateOfBirth;
    this.insurancePolicyHolderPhone = insurancePolicyHolderPhone;
    this.insurancePolicyHolderAddress = insurancePolicyHolderAddress;
    this.insurancePolicyHolderCity = insurancePolicyHolderCity;
    this.insurancePolicyHolderState = insurancePolicyHolderState;
    this.insurancePolicyHolderZipcode = insurancePolicyHolderZipcode;
    this.insurancePolicyHolderRelationToPatient = insurancePolicyHolderRelationToPatient;
    this.insurancePolicyIdNumber = insurancePolicyIdNumber;
    this.insurancePolicyGroupNumber = insurancePolicyGroupNumber;
    this.insuranceCoPayAmount = insuranceCoPayAmount;
    this.insuranceCompanyPhone = insuranceCompanyPhone;
    this.insuranceCompanyAddress = insuranceCompanyAddress;
  }

  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public Date getNewMemberSince() {
    return newMemberSince;
  }

  public void setNewMemberSince(Date newMemberSince) {
    this.newMemberSince = newMemberSince;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getAddressLineOne() {
    return addressLineOne;
  }

  public void setAddressLineOne(String addressLineOne) {
    this.addressLineOne = addressLineOne;
  }

  public String getAddressLineTwo() {
    return addressLineTwo;
  }

  public void setAddressLineTwo(String addressLineTwo) {
    this.addressLineTwo = addressLineTwo;
  }

  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getReferralSource() {
    return referralSource;
  }

  public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }

  public String getPhoneHome() {
    return phoneHome;
  }

  public void setPhoneHome(String phoneHome) {
    this.phoneHome = phoneHome;
  }

  public String getPhoneWork() {
    return phoneWork;
  }

  public void setPhoneWork(String phoneWork) {
    this.phoneWork = phoneWork;
  }

  public Boolean getMessageOkMobile() {
    return messageOkMobile;
  }

  public void setMessageOkMobile(Boolean messageOkMobile) {
    this.messageOkMobile = messageOkMobile;
  }

  public Boolean getMessageOkHome() {
    return messageOkHome;
  }

  public void setMessageOkHome(Boolean messageOkHome) {
    this.messageOkHome = messageOkHome;
  }

  public Boolean getMessageOkWork() {
    return messageOkWork;
  }

  public void setMessageOkWork(Boolean messageOkWork) {
    this.messageOkWork = messageOkWork;
  }

  public Boolean getMessageOkEmail() {
    return messageOkEmail;
  }

  public void setMessageOkEmail(Boolean messageOkEmail) {
    this.messageOkEmail = messageOkEmail;
  }

  public Boolean getHealthMessageOkEmail() {
    return healthMessageOkEmail;
  }

  public void setHealthMessageOkEmail(Boolean healthMessageOkEmail) {
    this.healthMessageOkEmail = healthMessageOkEmail;
  }

  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public String getEmploymentStartDate() {
    return employmentStartDate;
  }

  public void setEmploymentStartDate(String employmentStartDate) {
    this.employmentStartDate = employmentStartDate;
  }

  public String getOccupation() {
    return Occupation;
  }

  public void setOccupation(String occupation) {
    Occupation = occupation;
  }

  public Integer getHoursWorkedPerWeek() {
    return hoursWorkedPerWeek;
  }

  public void setHoursWorkedPerWeek(Integer hoursWorkedPerWeek) {
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public String getEmergencyContactFirstName() {
    return emergencyContactFirstName;
  }

  public void setEmergencyContactFirstName(String emergencyContactFirstName) {
    this.emergencyContactFirstName = emergencyContactFirstName;
  }

  public String getEmergencyContactLastName() {
    return emergencyContactLastName;
  }

  public void setEmergencyContactLastName(String emergencyContactLastName) {
    this.emergencyContactLastName = emergencyContactLastName;
  }

  public String getEmergencyContactRelationship() {
    return emergencyContactRelationship;
  }

  public void setEmergencyContactRelationship(String emergencyContactRelationship) {
    this.emergencyContactRelationship = emergencyContactRelationship;
  }

  public String getEmergencyContactPhoneMobile() {
    return emergencyContactPhoneMobile;
  }

  public void setEmergencyContactPhoneMobile(String emergencyContactPhoneMobile) {
    this.emergencyContactPhoneMobile = emergencyContactPhoneMobile;
  }

  public Boolean getHealthInsurance() {
    return healthInsurance;
  }

  public void setHealthInsurance(Boolean healthInsurance) {
    this.healthInsurance = healthInsurance;
  }

  public String getInsuranceCarrierName() {
    return insuranceCarrierName;
  }

  public void setInsuranceCarrierName(String insuranceCarrierName) {
    this.insuranceCarrierName = insuranceCarrierName;
  }

  public String getInsurancePolicyHolderFirstName() {
    return insurancePolicyHolderFirstName;
  }

  public void setInsurancePolicyHolderFirstName(String insurancePolicyHolderFirstName) {
    this.insurancePolicyHolderFirstName = insurancePolicyHolderFirstName;
  }

  public String getInsurancePolicyHolderLastName() {
    return insurancePolicyHolderLastName;
  }

  public void setInsurancePolicyHolderLastName(String insurancePolicyHolderLastName) {
    this.insurancePolicyHolderLastName = insurancePolicyHolderLastName;
  }

  public Date getInsurancePolicyHolderDateOfBirth() {
    return insurancePolicyHolderDateOfBirth;
  }

  public void setInsurancePolicyHolderDateOfBirth(Date insurancePolicyHolderDateOfBirth) {
    this.insurancePolicyHolderDateOfBirth = insurancePolicyHolderDateOfBirth;
  }

  public String getInsurancePolicyHolderPhone() {
    return insurancePolicyHolderPhone;
  }

  public void setInsurancePolicyHolderPhone(String insurancePolicyHolderPhone) {
    this.insurancePolicyHolderPhone = insurancePolicyHolderPhone;
  }

  public String getInsurancePolicyHolderAddress() {
    return insurancePolicyHolderAddress;
  }

  public void setInsurancePolicyHolderAddress(String insurancePolicyHolderAddress) {
    this.insurancePolicyHolderAddress = insurancePolicyHolderAddress;
  }

  public String getInsurancePolicyHolderCity() {
    return insurancePolicyHolderCity;
  }

  public void setInsurancePolicyHolderCity(String insurancePolicyHolderCity) {
    this.insurancePolicyHolderCity = insurancePolicyHolderCity;
  }

  public String getInsurancePolicyHolderState() {
    return insurancePolicyHolderState;
  }

  public void setInsurancePolicyHolderState(String insurancePolicyHolderState) {
    this.insurancePolicyHolderState = insurancePolicyHolderState;
  }

  public String getInsurancePolicyHolderZipcode() {
    return insurancePolicyHolderZipcode;
  }

  public void setInsurancePolicyHolderZipcode(String insurancePolicyHolderZipcode) {
    this.insurancePolicyHolderZipcode = insurancePolicyHolderZipcode;
  }

  public String getInsurancePolicyHolderRelationToPatient() {
    return insurancePolicyHolderRelationToPatient;
  }

  public void setInsurancePolicyHolderRelationToPatient(
      String insurancePolicyHolderRelationToPatient) {
    this.insurancePolicyHolderRelationToPatient = insurancePolicyHolderRelationToPatient;
  }

  public String getInsurancePolicyIdNumber() {
    return insurancePolicyIdNumber;
  }

  public void setInsurancePolicyIdNumber(String insurancePolicyIdNumber) {
    this.insurancePolicyIdNumber = insurancePolicyIdNumber;
  }

  public String getInsurancePolicyGroupNumber() {
    return insurancePolicyGroupNumber;
  }

  public void setInsurancePolicyGroupNumber(String insurancePolicyGroupNumber) {
    this.insurancePolicyGroupNumber = insurancePolicyGroupNumber;
  }

  public Double getInsuranceCoPayAmount() {
    return insuranceCoPayAmount;
  }

  public void setInsuranceCoPayAmount(Double insuranceCoPayAmount) {
    this.insuranceCoPayAmount = insuranceCoPayAmount;
  }

  public String getInsuranceCompanyPhone() {
    return insuranceCompanyPhone;
  }

  public void setInsuranceCompanyPhone(String insuranceCompanyPhone) {
    this.insuranceCompanyPhone = insuranceCompanyPhone;
  }

  public String getInsuranceCompanyAddress() {
    return insuranceCompanyAddress;
  }

  public void setInsuranceCompanyAddress(String insuranceCompanyAddress) {
    this.insuranceCompanyAddress = insuranceCompanyAddress;
  }
}
