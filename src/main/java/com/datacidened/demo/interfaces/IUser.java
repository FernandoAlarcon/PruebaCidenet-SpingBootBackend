package com.datacidened.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.datacidened.demo.model.User;

@Repository
public interface IUser extends CrudRepository<User, Integer> {

    // default User findById(int id) {
    //     return findById(id);
    // }

}
