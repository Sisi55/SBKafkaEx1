package com.example.springbootkafka;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SimpleModel implements Serializable {

    private String field1;
    private String field2;
}
