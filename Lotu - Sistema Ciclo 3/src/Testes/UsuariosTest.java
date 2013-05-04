package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Usuarios;
import org.junit.Assert;

public class UsuariosTest {

        /*
         * 
         * @author Lucas Ribeiro
         * 
         * 
         */


	@Test
	public final void testGetCPF() {
		Usuarios usu = new Usuarios();
		Assert.assertEquals("111.111.111-11",usu.getCPF());
	}

	public final void testGetRG() {
		Usuarios usu = new Usuarios();
		assertEquals("8102592543",usu.getRG());
	}

	@Test
	public final void testGetNome() {
		Usuarios usu = new Usuarios();
		assertEquals("Rafael",usu.getNome());
	}

	@Test
	public final void testGetCidade() {
		Usuarios usu = new Usuarios();
		assertEquals("Porto Alegre",usu.getCidade());
	}

	@Test
	public final void testGetUF() {
		Usuarios usu = new Usuarios();
		assertEquals("RS",usu.getUF());
	}


	@Test
	public final void testGetCEP() {
		Usuarios usu = new Usuarios();
		Assert.assertEquals("91250450",usu.getCEP());
	}

	@Test
	public final void testGetPais() {
		Usuarios usu = new Usuarios();
		assertEquals("Brasil",usu.getPais());
	}

	@Test
	public final void testGetNome_Mae() {
		Usuarios usu = new Usuarios();
		assertEquals("Minha mae",usu.getNome_Mae());
	}

	@Test
	public final void testGetBairro() {
		Usuarios usu = new Usuarios();
		assertEquals("Cidade Baixa",usu.getBairro());
	}

	@Test
	public final void testGetRua() {
		Usuarios usu = new Usuarios();
		assertEquals("Av. Coronel Genu�no",usu.getRua());
	}

	@Test
	public final void testGetEmail() {
		Usuarios usu = new Usuarios();
		assertEquals("atendimento@lotuintegracao.com.br",usu.getEmail());
	}

	@Test
	public final void testGetSenha() {
		Usuarios usu = new Usuarios();
		assertEquals("lotu",usu.getSenha());
	}

}
