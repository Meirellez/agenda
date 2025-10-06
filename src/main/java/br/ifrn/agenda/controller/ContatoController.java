package br.ifrn.agenda.controller;

import br.ifrn.agenda.controller.Rotas.rotaContatos;
import br.ifrn.agenda.controller.Rotas.rotasBase;
import br.ifrn.agenda.model.dto.ContatoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (rotaContatos.root)
public class ContatoController {

    @GetMapping(rotasBase.LIST)
    public ResponseEntity<String> getContacts(){
        ContatoDTO contatoDTO = ContatoDTO.builder()
                .nome("gabriel")
                .telefone("(84) 99412 0123")
                .build();

        return ResponseEntity.ok(contatoDTO.toString());
    }

}
