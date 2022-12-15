package com.datacidened.demo.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datacidened.demo.interfaceService.IUserService;
import com.datacidened.demo.interfaces.IUser;
import com.datacidened.demo.model.User;

@Service 
public class UserService implements IUserService {
    
    public IUser dataUser;
    @Autowired(required = false)
    
    @Override
    public List<User> listar() {
        return (List<User>)dataUser.findAll();
    }
 
    //@Override
    // public User findById(int id) {
    //     return dataUser.findById(id);
    // }

    @Override
    public void save(User u) {
        
        return;
    }
 
    @Override
    public List<User> findAll() {
        
        return null;
    }
 
    @Override
    public void deleteById(int id) {
                
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }



}
