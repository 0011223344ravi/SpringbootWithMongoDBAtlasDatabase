package com.example.mongodbcloudspringboot;

import com.example.mongodbcloudspringboot.entity.Test;
import com.example.mongodbcloudspringboot.entity.TestRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class MongodbCloudSpringbootApplication {

    @Autowired
    private TestRepo testRepo;
@GetMapping("/all")
public List<Test> getTestList(){
    return  testRepo.findAll();
}
    @PostMapping("/insert")
    public Test add(@RequestBody Test test){
        return  testRepo.save(test);
    }
    public static void main(String[] args) {
        SpringApplication.run(MongodbCloudSpringbootApplication.class, args);
    }

}
