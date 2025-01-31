package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsms")
	public List<String> listaBSM() {
		return List.of(
			"Mentalidade de Crescimento",
			"Proatividade",
			"Persistência",
			"Comunicação Assertiva",
			"Orientação aos Detalhes",
			"Responsabilidade Pessoal"
		);
	}
	
	@GetMapping("/objetivos")
	public List<String> objetivos() {
		return List.of(
			"Aprender Spring e aprimorar meus conhecimentos no back-end",
			"Aprender novos conceitos de front-end com React",
			"Passar por novas experiências"
		);
	}
}
