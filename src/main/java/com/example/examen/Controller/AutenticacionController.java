package com.example.examen.Controller;



import com.example.examen.Bean.UsuariosEntity;
import com.example.examen.Bean.jwtRequest;
import com.example.examen.Bean.jwtResponse;
import com.example.examen.Config.JwtUtilies;
import com.example.examen.Service.Implement.UserDetailsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autenticacion")
public class AutenticacionController {

    @Autowired
    private UserDetailsServicesImpl userDetail;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtilies jwtUtiles;

    @GetMapping("/userloggin")
    public UsuariosEntity obtenerUsuario (){
        return (UsuariosEntity) userDetail.loadUserByUsername("");
    }

    @PostMapping("/generartoken")
    public ResponseEntity<?> generarToken (@RequestBody jwtRequest jwtR) throws Exception{
        try {
            this.autenticar(jwtR.getUsername(),jwtR.getPassword());
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception ("Usuario mal registrado");
        }

        UserDetails userDetails = userDetail.loadUserByUsername(jwtR.getUsername());
        String token = jwtUtiles.generateToken(userDetails);

        return ResponseEntity.ok(new jwtResponse(token));
    }

    public void autenticar (String username,String password) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        }catch (DisabledException e){
            throw new Exception("Usuario Desabilitado" + e.getMessage());
        }catch (BadCredentialsException be){
            throw new Exception("Credencial Erronea" + be.getMessage());
        }
    }


}
