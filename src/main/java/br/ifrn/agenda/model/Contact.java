package br.ifrn.agenda.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.regex.Pattern;

@Getter
public class Contact {

    private Long id;
    private String nome;
    private String email;
    private List<Telefone> telefone;

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\(\\d{2}\\)\\s\\d{5}-\\d{4}$");
   


    @Builder
    private Contact(Long id, String nome, String email, List<Telefone> telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        validateInternalState();
    }

    private void validateInternalState() {
        // Validação de informações nulas ou em branco
        if (!StringUtils.hasText(this.nome)) {
            throw new IllegalArgumentException("O nome do contato não pode ser nulo ou vazio.");
        }
        if (this.telefone.isEmpty()) {
            throw new IllegalArgumentException("O telefone do contato não pode ser nulo ou vazio.");
        }
        if (!StringUtils.hasText(this.email)) {
            throw new IllegalArgumentException("O e-mail do contato não pode ser nulo ou vazio.");
        }

        // Validação do formato do e-mail
        if (!EMAIL_PATTERN.matcher(this.email).matches()) {
            throw new IllegalArgumentException("O formato do e-mail é inválido.");
        }

        for(Telefone telefone : this.telefone){
        if (!PHONE_PATTERN.matcher(telefone.getNumero()).matches()) {
            throw new IllegalArgumentException("O formato do telefone é inválido. Use o formato (99) 99999-9999.");
        }
        }
    }
}
