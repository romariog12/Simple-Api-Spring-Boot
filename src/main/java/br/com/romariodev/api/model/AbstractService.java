package br.com.romariodev.api.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import br.com.romariodev.api.repository.UsuarioRepository;

@Service
@RestController
public class AbstractService {
	protected UsuarioRepository ur;

	@Autowired
	AbstractService(UsuarioRepository ur2) {
		this.ur = ur2;
	}
}
