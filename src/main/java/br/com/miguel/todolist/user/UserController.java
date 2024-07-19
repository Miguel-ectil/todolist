package br.com.miguel.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /**
     * string (texto)
     * Integer (int) Números inteiros
     * Double (double) Números 0.0000
     * Float (float) Números 0.000
     * char (A C)
     * Date (data)
     * void
     */
    /*
     * Body
     */
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
      var user = this.userRepository.findByUsername(userModel.getUsername());
      
      // Verifica se o usuário já existe
      if (user != null) {
        System.out.println("Usuário já existe");
        return null;
      }

      var userCreated = this.userRepository.save(userModel);
      return userCreated;
    }
}
