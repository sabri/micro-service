package com.example.moviecatlogapi.ressorces;

import com.example.moviecatlogapi.model.CatlogMovie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatlog {

    @RequestMapping("/{userId}")
public List<CatlogMovie> getcalog(@PathVariable String userId){
//singletonList return immutable List serializable
    return Collections.singletonList(new CatlogMovie("titanic", "test", 4));
}
}
