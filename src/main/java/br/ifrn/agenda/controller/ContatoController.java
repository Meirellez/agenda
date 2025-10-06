package br.ifrn.agenda.controller;

import br.ifrn.agenda.model.dto.ContatoDTO;
import br.ifrn.agenda.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contatos")
@RequiredArgsConstructor
public class ContatoController {

    private final ContactRepository contactRepository;

    @GetMapping
    public ResponseEntity<List<ContatoDTO>> listarTodos() {
        List<ContatoDTO> contatos = contactRepository.findAll();
        return ResponseEntity.ok(contatos);
    }
}