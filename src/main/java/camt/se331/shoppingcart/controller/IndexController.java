package camt.se331.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dto on 2/22/2015.
 */
@CrossOrigin
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }

}
