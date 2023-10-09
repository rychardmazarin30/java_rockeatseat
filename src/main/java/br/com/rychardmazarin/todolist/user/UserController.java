package br.com.rychardmazarin.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MODIFICADORES NO JAVA
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {
    
    /**
     * String (texto)
     * Integer (int) Números inteiros
     * Float ou Double - números com casas décimais
     * char (A C)
     * Date (utlizando datas)
     * Void - quando nada é retornado daquilo que estamos criando
     */

    /**
     * Body da requisição
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.username);
    }
}
