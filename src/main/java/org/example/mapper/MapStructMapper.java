package org.example.mapper;

import org.example.dto.DestinationDTO;
import org.example.dto.SourceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper {
    MapStructMapper MAPPER = Mappers.getMapper(MapStructMapper.class);

    @Mapping(source = "modified", target = "modifiedDateTime")
    DestinationDTO convert(SourceDTO sourceOrder);

}