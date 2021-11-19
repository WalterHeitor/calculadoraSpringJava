package br.com.softwalter.calculadora.infrastructure.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ClientRequest {

    @JsonProperty("id_client")
    private UUID idClient;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

}
