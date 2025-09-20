package com.placement.placementmanagementsystem.controller;

import com.placement.placementmanagementsystem.entity.Certificate;
import com.placement.placementmanagementsystem.service.ICertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certificates") // Base URL for all certificate endpoints
public class CertificateController {

    @Autowired
    private ICertificateService certificateService;

    // POST - Create a new certificate
    @PostMapping("/")
    public ResponseEntity<Certificate> addCertificate(@RequestBody Certificate certificate) {
        Certificate newCertificate = certificateService.addCertificate(certificate);
        return new ResponseEntity<>(newCertificate, HttpStatus.CREATED);
    }

    // GET - Get all certificates
    @GetMapping("/")
    public ResponseEntity<List<Certificate>> getAllCertificates() {
        List<Certificate> certificates = certificateService.getAllCertificates();
        return new ResponseEntity<>(certificates, HttpStatus.OK);
    }

    // GET - Get a single certificate by ID
    @GetMapping("/{id}")
    public ResponseEntity<Certificate> getCertificateById(@PathVariable Long id) {
        Certificate certificate = certificateService.searchCertificate(id);
        return new ResponseEntity<>(certificate, HttpStatus.OK);
    }

    // DELETE - Delete a certificate
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCertificate(@PathVariable Long id) {
        certificateService.deleteCertificate(id);
        return new ResponseEntity<>("Certificate with ID " + id + " has been deleted.", HttpStatus.OK);
    }

    // PUT - Update an existing certificate
    @PutMapping("/{id}")
        public ResponseEntity<Certificate> updateCertificate(@PathVariable Long id, @RequestBody Certificate certificateDetails) {
            Certificate updatedCertificate = certificateService.updateCertificate(id, certificateDetails);
            return new ResponseEntity<>(updatedCertificate, HttpStatus.OK);
        }
    
}