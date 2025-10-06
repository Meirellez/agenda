package br.ifrn.agenda.controller.Rotas;

import br.ifrn.agenda.controller.Rotas.rotaContatos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public interface rotasBase {
    String FORM = "/form";
    String LIST = "/list";
    String ADD = "/add";
    String EDIT = "/edit";
    String DELETE = "/delete";
}
