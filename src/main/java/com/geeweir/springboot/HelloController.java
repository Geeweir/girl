package com.geeweir.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Geeweir on 2016/12/26.
 */
@RestController
public class HelloController {

    /*@Value("${cupSize}")
    private String cupSize;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;*/
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String say() {
        return girlProperties.getCupSize() + " " + girlProperties.getAge();
    }
}
