package com.rer.backend.controlador;

import com.rer.backend.modelos.UserLogin;
import com.rer.backend.servicios.IUserLoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userLogin")
public class UserLoginController {
    @Autowired
    private IUserLoginService IULServ;
    
    @GetMapping("/verdatosUserLogin")
    @ResponseBody
    public List<UserLogin> verDatosUserLogin(){
        return IULServ.verDatosUserLogin();
    }
}
