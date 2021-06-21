package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceGit;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/v1/git")
public class DemoGit {

	@Autowired
	ServiceGit service;

	// Busca o horário do sistema
	@GetMapping(path="/horario")
	public String buscaHorário() {
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return agora.format(formatado);
	}

	@GetMapping(path="/tabuada")
	public List<Integer> imprimir() {
		return service.imprimirTabuada(11);
	}

}
