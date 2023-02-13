package com.ingcremonini.domain.example.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ExampleModel {

    private final Integer exampleId;

    private final String exampleName;
}
