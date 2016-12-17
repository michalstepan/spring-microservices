package com.stepan.services.admin.controller;

import com.stepan.services.admin.model.User;
import com.stepan.services.admin.model.dto.ReceiptDTO;
import com.stepan.services.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Michal on 17.12.2016.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable(value = "id") Integer userId) {
        return userService.getById(userId);
    }

    @ResponseBody
    @RequestMapping(value = "/user/sim", method = RequestMethod.GET)
    public User simNewUser() {
        return userService.simNewUser();
    }

    @ResponseBody
    @RequestMapping(value = "/user/{id}/receipt", method = RequestMethod.GET)
    public List<ReceiptDTO> getReceiptsForUser(@PathVariable(value = "id") Integer userId) {
        return userService.getReceiptsForUser(userId);
    }
}
