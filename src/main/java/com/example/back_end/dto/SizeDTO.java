package com.example.back_end.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SizeDTO {
    private String name_size;
    private long quantity_available;

}
