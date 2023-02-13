package com.ingcremonini.infrastructure.example.repository;

import com.ingcremonini.domain.example.model.ExampleModel;
import com.ingcremonini.domain.example.repository.ExampleRepository;
import com.ingcremonini.infrastructure.example.entity.ExampleEntity;
import com.ingcremonini.infrastructure.example.mapper.ExampleEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ExampleRepositoryImp implements ExampleRepository {

    private final ExampleEntityMapper exampleEntityMapper;

    @Override
    public ExampleModel getExampleModelExample() {
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.setExampleId(1);
        exampleEntity.setExampleName("Example 1");
        return exampleEntityMapper.mapFromEntity(exampleEntity);
    }
}
