package br.com.romariodev.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.romariodev.api.entity.Usuario;
import br.com.romariodev.api.model.UsuarioService;

@RestController
@RequestMapping(path = "/pd")
public class Controle extends AbstractController {
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/cadastrarlider")
	public @ResponseBody int cadastrarUsuario(@RequestBody Usuario usuario) {
		return this.usuarioService.cadastrarUsuario(usuario);
	}

	@GetMapping(path = "/usuario")
	public @ResponseBody Usuario usuario() {
		//Responde um json do obj USUARIO
		return null;
	}
}
