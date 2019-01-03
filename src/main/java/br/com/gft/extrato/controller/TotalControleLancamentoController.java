package br.com.gft.extrato.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gft.extrato.model.TotalControleLancamento;
import br.com.gft.extrato.services.TotalControleLancamentoService;

@RestController
@RequestMapping("/api/extrato")
public class TotalControleLancamentoController {

	@Autowired
	private TotalControleLancamentoService extratoService;

	@GetMapping
	public ResponseEntity<List<TotalControleLancamento>> listar() throws IOException {
		List<TotalControleLancamento> extrato = extratoService.listar();
		return ResponseEntity.status(HttpStatus.OK).body(extrato);
	}

}