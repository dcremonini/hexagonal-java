package com.ingcremonini.infrastructure.example.mapper

-ingcremonini.infraestructure.example.mapper;

-ingcremonini.domain.example.model.ExampleModel;
import com-ingcremonini.infraestructure.example.entity.ExampleEntity;
import com.ingcremonini.domain.example.model.ExampleModel;
import com.ingcremonini.infrastructure.example.entity.ExampleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExampleEntityMapper {

    ExampleModel mapFromEntity(ExampleEntity source);

    ExampleEntity mapToEntity(ExampleModel source);
}
