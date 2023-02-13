package com.ingcremonini.usecase.example.service;


import com.ingcremonini.domain.example.model.ExampleModel;
import com.ingcremonini.domain.example.repository.ExampleRepository;
import com.ingcremonini.domain.example.usecase.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExampleServiceImp implements ExampleService {

    private final ExampleRepository exampleRepository;

    @Override
    public ExampleModel getExampleModelExample() {
        return exampleRepository.getExampleModelExample();
    }
}
