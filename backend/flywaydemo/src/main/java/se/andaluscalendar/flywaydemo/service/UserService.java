package se.andaluscalendar.flywaydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.andaluscalendar.flywaydemo.model.AppUser;
import se.andaluscalendar.flywaydemo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public AppUser create(String name){
        AppUser user = new AppUser();
        user.setName(name);
        return userRepository.save(user);
    }
}
