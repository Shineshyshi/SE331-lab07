package camt.se331.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dto on 2/22/2015.
 */
<<<<<<< HEAD

=======
@CrossOrigin
>>>>>>> aa8609b5e0b1ef3d8bb4d245ac46d0e572ca00f4
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }

}
