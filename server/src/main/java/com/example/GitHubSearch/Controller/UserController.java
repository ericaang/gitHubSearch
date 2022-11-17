package com.example.GitHubSearch.Controller;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
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
    //public UserModel getUserList(@PathVariable String query) throws Exception
    public List<UserModel> getUserList(@PathVariable String query) throws Exception
    {
        userData.getData(query);
        return userData.getAllUsers();
    }

    //Http Post method to add the student in the student list
   // @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
 /*   public ResponseEntity<Object> addStudent(@RequestBody StudentPOJO student)
    {
        Integer id = userDto.getAllUsers().getUserList().size() + 1;
        user.setId(id);

        studentDAO.addStudent(student);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(student.getId())
                .toUri();

        return ResponseEntity.created(location).build(); }
*/
}
