package com.slamarti.hlw.aanmelden.service;

import com.slamarti.hlw.aanmelden.model.LeerlingGegevens;
import com.slamarti.hlw.aanmelden.repository.LeerlingGegevensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeerlingService {

    private LeerlingGegevensRepository leerlingGegevensRepository;

    @Autowired
    public LeerlingService(LeerlingGegevensRepository leerlingGegevensRepository) {
        this.leerlingGegevensRepository = leerlingGegevensRepository;
    }

    public boolean storeLeerlingGegevens(LeerlingGegevens leerlingGegevens) {
        try {
            leerlingGegevensRepository.save(leerlingGegevens);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
