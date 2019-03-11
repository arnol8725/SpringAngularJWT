package com.bolsadeideas.springboot.backend.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;
import com.bolsadeideas.springboot.backend.apirest.models.services.IUsuarioService;
import com.bolsadeideas.springboot.backend.apirest.models.services.UsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	IUsuarioService usuarioService; 

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		// TODO Auto-generated method stub
		
		String user= authentication.getName();
		Usuario usuario = usuarioService.findByUsername(user);
		logger.info("Valor de usuario "+usuario.getId() +" " + usuario.getUsername());
			
		Map<String, Object> info = new HashMap<>();
		info.put("info adicional", "Hola  que tal: ".concat(usuario.getUsername()));
		info.put("nombre_usuario", "".concat(usuario.getId().toString()).concat("-").concat(usuario.getUsername()));
		info.put("nombre", usuario.getNombre());
		info.put("apellido", usuario.getApellido());
		info.put("email", usuario.getEmail());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
