package com.tdd.tdd.src.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PostPointRes {

    private Long userIdx;
    private int point;
}
