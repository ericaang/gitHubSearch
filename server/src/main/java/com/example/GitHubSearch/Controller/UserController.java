package com.example.GitHubSearch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.GitHubSearch.Repository.UserData;
import com.example.GitHubSearch.Model.UserModel;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserData userData;

    //Http Get method to get the student list in JSON format
    @GetMapping(path="/{query}", produces = "application/json")
    public List<UserModel> getUserList(@PathVariable String query) throws Exception
    {
        userData.getData(query);
        return userData.getAllUsers();
    }

}
