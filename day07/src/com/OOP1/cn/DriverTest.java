package com.OOP1.cn;

public class DriverTest {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.name = "12秒88";
        Doctor doctor = new Doctor();
        doctor.name = "Dr.王";
        doctor.patient = patient;
        patient.seeDoctor();
        doctor.Prescription();
    }
}
