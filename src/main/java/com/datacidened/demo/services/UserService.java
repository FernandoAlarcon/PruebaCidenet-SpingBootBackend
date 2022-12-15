package com.datacidened.demo.services;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datacidened.demo.interfaceService.IUserService;
import com.datacidened.demo.interfaces.IUser;
import com.datacidened.demo.model.User;

@Service 
public class UserService implements IUserService {
    
    public IUser data;
    @Autowired(required = false)
    
    @Override
    @ResponseBody
    public List<User> listar() {
        return (List<User>)data.findAll();
    }
 
    //@Override
    // public User findById(int id) {
    //     return data.findById(id);
    // }

    @Override
    public void save(User u) {
        
        return;
    }

    @Override
    public void delete(int id) { 
        
    }

    // @Override
    // public List<User> findAll() {
        
    //     return null;
    // }
 
    @Override
    public void deleteById(int id) {
                
    }

    @Override
    public List<User> findAll() {
        return (List<User>)data.findAll();
    }

    @Override
    public User findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }



}
