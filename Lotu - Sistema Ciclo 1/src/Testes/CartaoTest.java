package Testes;

import Classes.Cartao;
import org.junit.Test;
import org.junit.Assert;

public class CartaoTest {

        /*
         * 
         * @author Lucas Ribeiro
         * 
         */
	
	public final void testGetValidade() {
		Cartao card = new Cartao();
		Assert("05/04/2013",card.getValidade());
	}

	
	public final void testGetUF() {
		Cartao card = new Cartao();
		assertEquals("RS",card.getUF());
	}

	
	public final void testGetNumero() {
		Cartao card = new Cartao();
		assertEquals(111111111,card.getNumero());
	}

	
	public final void testGetUsuario_CPF() {
		Cartao card = new Cartao();
		assertEquals("111.111.111-11",card.getUsuario_CPF());
	}



}
