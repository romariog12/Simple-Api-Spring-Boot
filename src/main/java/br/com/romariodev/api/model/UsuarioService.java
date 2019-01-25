package br.com.romariodev.api.model;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import br.com.romariodev.api.entity.Usuario;
import br.com.romariodev.api.repository.UsuarioRepository;
import br.com.romariodev.api.util.CodigoMensagem;

@Service
@RestController
public class UsuarioService extends AbstractService {

	UsuarioService(UsuarioRepository ur) {
		super(ur);
	}

	public int cadastrarUsuario(Usuario usuario) {
		try {
			this.ur.save(usuario);
			return CodigoMensagem.SUCESSO;
		} catch (Exception e) {
			return CodigoMensagem.ERRO;
		}
	}

}
