package br.com.gft.extrato.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.gft.extrato.model.TotalControleLancamento;

@Service
public class TotalControleLancamentoService  {
	
	String arquivoBase = "lancamento-conta-legado.json";
	List<TotalControleLancamento> lt = null;

	public List<TotalControleLancamento> listar() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException {
		
		lt = new 	ArrayList<TotalControleLancamento>();
		
		ObjectMapper objectMapper = new ObjectMapper();
		Map<?, ?> empMap = objectMapper.readValue(new FileInputStream(arquivoBase), Map.class);

		lt = new ArrayList(empMap.values());
		
		return lt;
	}
}
