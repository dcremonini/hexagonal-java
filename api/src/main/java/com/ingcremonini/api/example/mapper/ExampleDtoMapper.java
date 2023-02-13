package com.ingcremonini.api.example.mapper;

import com.ingcremonini.domain.example.model.ExampleModel;
import org.mapstruct.Mapper;
import org.openapitools.model.ExampleModelDto;

@Mapper(componentModel = "spring")
public interface ExampleDtoMapper {

    ExampleModelDto mapToDto(ExampleModel source);

    ExampleModel mapToDomain(ExampleModelDto source);
}
