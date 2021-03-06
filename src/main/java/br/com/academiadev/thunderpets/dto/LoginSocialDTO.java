package br.com.academiadev.thunderpets.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginSocialDTO {

    private String code;
    private String redirectUri;
}
