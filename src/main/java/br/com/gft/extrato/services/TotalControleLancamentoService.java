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

@Service
public class TotalControleLancamentoService  {
	
	String arquivoBase = "lancamento-conta-legado.json";

	public List<Object> listar() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Map<?, ?> empMap = objectMapper.readValue(new FileInputStream(arquivoBase), Map.class);

		List<Object> lt = new ArrayList<Object>(empMap.values());
		
		System.out.println(lt);
		
		return lt;
	}
}