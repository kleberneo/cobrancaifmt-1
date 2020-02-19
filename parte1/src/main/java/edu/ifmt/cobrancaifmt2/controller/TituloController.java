package edu.ifmt.cobrancaifmt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //anotação controller do Spring
class TituloController {
	
	
	@RequestMapping("/titulos/novo")//mapeamento da url
	public String novo() {//método que retorna uma String com o nome da view
		return "CadastroTitulo";
		
	}

}


