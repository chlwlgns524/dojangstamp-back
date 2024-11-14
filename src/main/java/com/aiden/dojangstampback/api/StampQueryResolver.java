package com.aiden.dojangstampback.api;

import com.aiden.dojangstampback.domain.dto.StampDto;
import com.aiden.dojangstampback.domain.service.StampService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class StampQueryResolver {

    private final StampService stampService;

    @QueryMapping
    public List<StampDto> stampList() {
        return stampService.findAllStamps();
    }

}
