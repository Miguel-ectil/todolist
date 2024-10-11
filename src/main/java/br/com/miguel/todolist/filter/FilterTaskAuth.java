package br.com.miguel.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.util.Base64;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
    throws ServletException, IOException {

    // Pegar a autenticação (usuário e senha)
    var authorization = request.getHeader("Authorization");
    
    var authEncoded = authorization.substring("Basic".length()).trim();

    byte[] authDecode = Base64.getDecoder().decode(authEncoded);

    System.out.println("Authorization");
    System.out.println(authDecode);

    // Validar usuário
    // Validar senha

    filterChain.doFilter(request, response);
  }

    
}
