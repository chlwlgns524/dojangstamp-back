package com.aiden.dojangstampback.domain.mapper;

import com.aiden.dojangstampback.domain.dto.StampDto;
import com.aiden.dojangstampback.domain.entity.Stamp;

public class StampDtoMapper {

    public static StampDto mapToDto(Stamp stamp) {
        return new StampDto(
                stamp.getId(),
                stamp.getModelName(),
                stamp.getWidth(),
                stamp.getHeight(),
                stamp.getPrice()
        );
    }

}
