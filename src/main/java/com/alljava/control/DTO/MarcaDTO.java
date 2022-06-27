package com.alljava.control.DTO;

import com.alljava.control.entities.Marca;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarcaDTO {
    private long id;
    private String descricao;
    private List<ModeloDTO> modelos;

    public MarcaDTO(Marca marca) {
        id = marca.getId();
        descricao = marca.getDescricao();
    }

}
