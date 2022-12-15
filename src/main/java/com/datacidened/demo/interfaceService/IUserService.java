package com.datacidened.demo.interfaceService;

import java.util.List;
//import java.util.Optional;

import com.datacidened.demo.model.User;

public interface IUserService {
 

    public List<User> listar();
    public List<User> findAll();

    public User findById(int id);

    public void save(User user);

    public void deleteById(int id);
    
    public void delete(int id);
    //public Optional<User>listarId(int id);
}
