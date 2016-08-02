package com.prado.gestao_festas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prado.gestao_festa.reposytory.Convidados;
import com.prado.gestao_festas.model.Convidado;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	
	 Convidados convidados = new Convidados();
	
	
	@RequestMapping
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados", convidados.todos());
		mv.addObject(new Convidado());
		return mv;
		
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public String salvar(Convidado convidado){
		this.convidados.adicionar(convidado);
		return "redirect:/convidados";
		
	}
	
}
