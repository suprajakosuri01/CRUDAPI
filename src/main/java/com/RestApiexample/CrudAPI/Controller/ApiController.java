package com.RestApiexample.CrudAPI.Controller;

import com.RestApiexample.CrudAPI.Model.User;
import com.RestApiexample.CrudAPI.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
@Autowired
   private UserRepo userRepo;
    @GetMapping("/getAnswer")
    public String getAnswer(){
        return "hello sai ";
    }
    @GetMapping("/getUser")
    public List<User> getUser(){
        return userRepo.findAll();
    }
    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
  userRepo.save(user);
  return "data saved";
    }

@PutMapping("/updateUser/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
User updateUser= userRepo.findById(id).get();
    updateUser.setfName(user.getfName());
    updateUser.setlName(user.getlName());
    updateUser.setAge(user.getAge());
    updateUser.setOccupation(user.getOccupation());
    userRepo.save(updateUser);
    return "user details updated";

    }
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable long id){
  User deleteUser=userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "user deleted";
    }

}
