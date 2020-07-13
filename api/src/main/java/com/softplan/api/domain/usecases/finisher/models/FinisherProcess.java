package com.softplan.api.domain.usecases.finisher.models;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class FinisherProcess implements IFinisherProcess {
    private Integer id;
    private String description;
    private Integer userId;
}
