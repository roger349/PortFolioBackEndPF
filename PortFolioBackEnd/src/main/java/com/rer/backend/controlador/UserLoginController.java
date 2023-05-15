package com.rer.backend.controlador;

import com.rer.backend.modelos.UserLogin;
import com.rer.backend.repositorios.UserLoginRepositorio;
import com.rer.backend.servicios.IUserLoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userLogin")
@CrossOrigin(origins = "http://localhost:4200")
public class UserLoginController {
    @Autowired
    private IUserLoginService IULServ;
    @Autowired
    private UserLoginRepositorio ULrepo;
    
    @GetMapping("/verdatosUserLogin")
    @ResponseBody
    public List<UserLogin> verDatosUserLogin(){
        return IULServ.verDatosUserLogin();
    }
    @PostMapping("/login")
    public ResponseEntity<UserLogin> loginUser(@RequestBody UserLogin userData){
    UserLogin userlogin = ULrepo.findByUsuario(userData.getUsuario());  
    if (userData.getPassword().equals(userlogin.getPassword()))
        return ResponseEntity.ok(userlogin);
    return (ResponseEntity<UserLogin>) ResponseEntity.internalServerError();  
   }
}
