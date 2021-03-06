package br.com.academiadev.thunderpets.service.impl;

import br.com.academiadev.thunderpets.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    public JavaMailSender javaMailSender;

    @Override
    public String enviaMensagemSimples(String para, String assunto, String conteudo) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo(para);
            simpleMailMessage.setSubject(assunto);
            simpleMailMessage.setText(conteudo);
            javaMailSender.send(simpleMailMessage);
            return "E-mail enviado com sucesso.";
        } catch (MailException e) {
            return "Erro ao enviar e-mail: " + e.getMessage();

        }
    }
}
