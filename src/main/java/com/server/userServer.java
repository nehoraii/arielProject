package com.server;

import com.entity.UsersEntity;
import com.entity.userEntityNehoraii;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userServer {
    @Autowired
    private UserRepository userRepository;
    public String getUserByUserName(String userName){
        Optional<userEntityNehoraii> usersEntity;
        //קריאה לשאילתה ושליחת הפרמטרים
        usersEntity=userRepository.getByUserName(userName);
        //בדיקה אם המשתמש קיים
        if(!usersEntity.isEmpty()){
            return "no exist";
        }
        return usersEntity.get().getName();
    }
}
