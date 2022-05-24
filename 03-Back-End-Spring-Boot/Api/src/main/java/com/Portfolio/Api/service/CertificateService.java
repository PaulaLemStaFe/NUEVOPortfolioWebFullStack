package com.Portfolio.Api.service;

import com.Portfolio.Api.model.Certificate;
import com.Portfolio.Api.repository.CertificateRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CertificateService {
    
    @Autowired
    CertificateRepository certificateRepo;
    
    public List<Certificate> findCertificate() {
        return certificateRepo.findAll();
    }
    
    public Optional<Certificate> getIdCertificate(Long idCertificate) {
        return certificateRepo.findById(idCertificate);
    }
    
    public void addCertificate(Certificate certificate) {
        certificateRepo.save(certificate);
    }
    
    public void deleteCertificate(Long idCertificate){
        certificateRepo.deleteById(idCertificate);
    }
    
    public Certificate editCertificate(Certificate certificat){
        return certificateRepo.save(certificat);
    }
    
}
