package br.com.softwalter.comercio.infrastructure.mapper.impl;

import br.com.softwalter.comercio.domain.entities.Client;
import br.com.softwalter.comercio.infrastructure.http.dto.ClientRequest;
import br.com.softwalter.comercio.infrastructure.mapper.MapStructMapper;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-03-11T19:21:44+0100",
        comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {
    @Override
    public Client clientToClientReponse(ClientRequest clientRequest) {
        return null;
    }
}
