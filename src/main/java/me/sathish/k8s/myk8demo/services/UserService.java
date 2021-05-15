package me.sathish.k8s.myk8demo.services;

import me.sathish.k8s.myk8demo.data.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers(){
        User user1 = new User("Sathish", "Kumar", BigDecimal.valueOf(1L), "user1", "secret");
        User user2 = new User("Bittu", "singh", BigDecimal.valueOf(2L), "user2", "supersecret");
        List<User> myList = new ArrayList<User>();
        myList.add(user1);
        myList.add(user2);
        return myList;
    }
}
