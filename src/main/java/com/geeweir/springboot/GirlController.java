package com.geeweir.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Geeweir on 2016/12/26.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping("/girls")
    public List<Girl> getGirls() {
        return girlRepository.findAll();
    }
}
