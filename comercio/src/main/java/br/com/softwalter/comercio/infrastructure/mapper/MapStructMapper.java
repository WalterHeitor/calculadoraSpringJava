package br.com.softwalter.comercio.infrastructure.mapper;

import br.com.softwalter.comercio.domain.entities.Client;
import br.com.softwalter.comercio.infrastructure.http.dto.ClientRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    Client clientToClientReponse(ClientRequest clientRequest);
}
