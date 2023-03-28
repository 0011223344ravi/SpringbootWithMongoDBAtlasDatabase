package com.example.mongodbcloudspringboot.entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="abc")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Test {

    @Id
    private int id ;
    private String name ;
}
