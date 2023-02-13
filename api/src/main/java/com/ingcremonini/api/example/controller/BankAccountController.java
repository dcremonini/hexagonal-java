package com.ingcremonini.api.example.controller;

import com.ingcremonini.api.example.mapper.ExampleDtoMapper;
import com.ingcremonini.domain.example.model.ExampleModel;
import com.ingcremonini.domain.example.usecase.ExampleService;
import lombok.AllArgsConstructor;
//import org.openapitools.api.ExampleApi;
//import org.openapitools.model.ExampleModelDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/bankaccount")
public class BankAccountController {
//public class ExampleController implements ExampleApi {

    private final ExampleService exampleService;

    private final ExampleDtoMapper exampleDtoMapper;

    @Override
    public Flux<ExampleModelDto> getExampleFlux(ServerWebExchange exchange) {
        ExampleModel exampleModel = exampleService.getExampleModelExample();
        return Flux.just(exampleDtoMapper.mapToDto(exampleModel));
    }

    @Override
    public Mono<ExampleModelDto> getExampleMono(ServerWebExchange exchange) {
        ExampleModel exampleModel = exampleService.getExampleModelExample();
        return Mono.just(exampleDtoMapper.mapToDto(exampleModel));
    }
}
