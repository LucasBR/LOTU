package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Cartao;

public class CartaoTest {

	@Test
	public final void testGetValidade() {
		Cartao card = new Cartao();
		assertEquals("05/04/2013",card.getValidade());
	}

	@Test
	public final void testGetUF() {
		Cartao card = new Cartao();
		assertEquals("RS",card.getUF());
	}

	@Test
	public final void testGetNumero() {
		Cartao card = new Cartao();
		assertEquals(111111111,card.getNumero());
	}

	@Test
	public final void testGetUsuario_CPF() {
		Cartao card = new Cartao();
		assertEquals("111.111.111-11",card.getUsuario_CPF());
	}

}
