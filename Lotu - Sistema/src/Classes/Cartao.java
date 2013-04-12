package Classes;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Cartao
{
	Integer numero;
	String validade;
	String UF;
	String Usuario_CPF;
	/**
	 * @return the tipo
	 */

	public Cartao()
	{
		this.numero = 111111111;
		this.UF = "RS";
		this.validade = SetData();
		this.Usuario_CPF = "111.111.111-11";
	}

	/**
	 * @return the validade
	 */
	public String getValidade() {
		return validade;
	}

	/**
	 * @return the uF
	 */
	public String getUF() {
		return UF;
	}
	/**
	 * @param uf the uF to set
	 */
	public void setUF(String uf) {
		UF = uf;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the usuario_CPF
	 */
	public String getUsuario_CPF() {
		return Usuario_CPF;
	}

	/**
	 * @param usuario_CPF the usuario_CPF to set
	 */
	public void setUsuario_CPF(String usuario_CPF) {
		Usuario_CPF = usuario_CPF;
	}

	public String SetData()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		GregorianCalendar calendar = new GregorianCalendar();
		Date dataHoje = new Date(System.currentTimeMillis());
	    String validade = formatter.format(dataHoje);
		return validade;


	}


}

