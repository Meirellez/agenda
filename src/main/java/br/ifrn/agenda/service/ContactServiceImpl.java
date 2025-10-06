package br.ifrn.agenda.service;

import br.ifrn.agenda.model.dto.ContatoDTO;
import br.ifrn.agenda.repository.ContactJpaRepository;
import org.springframework.stereotype.Service;

import  java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<ContatoDTO> getAll() {

        List<ContatoDTO> contatosDTOS = contactRepository.findAll();

        return contatosDTOS;



    }
}
