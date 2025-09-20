package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.Certificate;
import java.util.List;

public interface ICertificateService {
    Certificate addCertificate(Certificate certificate);
    Certificate searchCertificate(Long id);
    void deleteCertificate(Long id);
    List<Certificate> getAllCertificates();
    // In ICertificateService.java
    Certificate updateCertificate(Long id, Certificate certificate);
}