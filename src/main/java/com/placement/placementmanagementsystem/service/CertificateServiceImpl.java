package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.Certificate;
import com.placement.placementmanagementsystem.repository.ICertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateServiceImpl implements ICertificateService {

    @Autowired
    private ICertificateRepository certificateRepository;

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate searchCertificate(Long id) {
        Optional<Certificate> certificateOptional = certificateRepository.findById(id);
        return certificateOptional.orElseThrow(() -> new RuntimeException("Certificate not found with id: " + id));
    }

    @Override
    public void deleteCertificate(Long id) {
        certificateRepository.deleteById(id);
    }

    @Override
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

        // In CertificateServiceImpl.java
    @Override
    public Certificate updateCertificate(Long id, Certificate certificateDetails) {
        // First, find the existing certificate by its ID
        Certificate existingCertificate = certificateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Certificate not found with id: " + id));

        // Update the fields of the existing certificate with the new details
        existingCertificate.setCertificateName(certificateDetails.getCertificateName());
        existingCertificate.setYear(certificateDetails.getYear());
        existingCertificate.setCollege(certificateDetails.getCollege());

        // Save the updated certificate back to the database
        return certificateRepository.save(existingCertificate);
    }
}