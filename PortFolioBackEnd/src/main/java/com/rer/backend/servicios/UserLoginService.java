package com.rer.backend.servicios;

import com.rer.backend.modelos.UserLogin;
import com.rer.backend.repositorios.UserLoginRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService implements IUserLoginService {
    @Autowired
    public UserLoginRepositorio UserLRep;
    @Override
    public List<UserLogin> verDatosUserLogin() {
    return UserLRep.findAll();   
    }
}
