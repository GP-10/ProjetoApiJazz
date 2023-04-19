package com.jazztech.apicadastro.applicationservice.clientsService;

import com.jazztech.apicadastro.applicationservice.domain.entity.Clients;
import com.jazztech.apicadastro.infrastructure.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SearchClients {
    private final ClientRepository clientRepository;

    public List<Clients> listAll(){
        return clientRepository.findAll();
    }

    public Optional<Clients> findById(Long id){
        return clientRepository.findById(id);
    }
}