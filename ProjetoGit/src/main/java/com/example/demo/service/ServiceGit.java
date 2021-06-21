package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceGit {

	public List<Integer> imprimirTabuada(Integer numero) {
		List<Integer> retorno = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			int valor = numero * i;
			retorno.add(valor);
		}
		return retorno;
	}

}
