package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping(method = RequestMethod.GET, path = "")
    public String list() {
        return "Hi Admin list Test";
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public String detail() {
        return "Hi Admin detail Test";
    }
}
