package br.com.academiadev.thunderpets.dto;

import br.com.academiadev.thunderpets.enums.*;
import br.com.academiadev.thunderpets.model.Foto;
import br.com.academiadev.thunderpets.model.Localizacao;
import br.com.academiadev.thunderpets.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PetDTO {

    private UUID id;
    private String nome;
    private String descricao;
    private LocalDate dataAchado;
    private Especie especie;
    private Porte porte;
    private Sexo sexo;
    private Status status;
    private Idade idade;
    private UUID usuarioId;
    private Localizacao localizacao;
    private boolean ativo;
    private List<byte[]> fotos;
    private BigDecimal distancia;
}
