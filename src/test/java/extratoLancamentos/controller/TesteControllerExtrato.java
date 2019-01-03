package extratoLancamentos.controller;


import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import br.com.gft.extrato.controller.TotalControleLancamentoController;
import extratoLancamentos.ApplicationTests;

public class TesteControllerExtrato extends ApplicationTests {

	private MockMvc mockMvc;
	
	@Autowired
	private TotalControleLancamentoController totalControleLancamentoController;  
	
	@Before
	public void setUp() {
		
		this.mockMvc = MockMvcBuilders.standaloneSetup(totalControleLancamentoController).build();
	}
	
	@Test
	public void TestGetExtrato() throws Exception {
		
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/extrato")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
