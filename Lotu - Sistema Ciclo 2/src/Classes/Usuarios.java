package Classes;

public class Usuarios
{
        /*
         * 
         * @author Lucas Ribeiro
         * 
         */
	private String CPF;
	private String RG;
	private String Nome;
	private String Cidade;
	private String UF;
	private Integer CEP;
	private String Pais;
	private String Nome_Mae;
	private String Bairro;
	private String Rua;
	private String Email;
	private Integer Num_Cartao;
	private String Senha;



	/*
	 * Construtor padr�o para testes
	 */
	public Usuarios()
	{
	this.CPF = "111.111.111-11";
	this.RG  = "8102592543";
	this.Nome = "Rafael";
	this.Cidade = "Porto Alegre";
	this.UF = "RS";
	this.CEP = 91250450;
	this.Pais = "Brasil";
	this.Nome_Mae = "Minha mae";
	this.Bairro = "Cidade Baixa";
	this.Rua = "Av. Coronel Genu�no";
	this.Email = "atendimento@lotuintegracao.com.br";
	this.Senha = "lotu";
	}

	/**
	 * @return the cPF
	 */
	public String getCPF()
	{
		return CPF;
	}

	/**
	 * @param cpf the cPF to set
	 */
	public void setCPF(String cpf)
	{
		CPF = cpf;
	}

	/**
	 * @return the rG
	 */
	public String getRG()
	{
		return RG;
	}

	/**
	 * @param rg the rG to set
	 */
	public void setRG(String rg)
	{
		RG = rg;
	}

	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		Nome = nome;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade()
	{
		return Cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade)
	{
		Cidade = cidade;
	}

	/**
	 * @return the uF
	 */
	public String getUF()
	{
		return UF;
	}

	/**
	 * @param uf the uF to set
	 */
	public void setUF(String uf)
	{
		UF = uf;
	}

	/**
	 * @return the cEP
	 */
	public Integer getCEP()
	{
		return CEP;
	}

	/**
	 * @param cep the cEP to set
	 */
	public void setCEP(Integer cep)
	{
		CEP = cep;
	}

	/**
	 * @return the pais
	 */
	public String getPais()
	{
		return Pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais)
	{
		Pais = pais;
	}

	/**
	 * @return the nome_Mae
	 */
	public String getNome_Mae()
	{
		return Nome_Mae;
	}

	/**
	 * @param nome_Mae the nome_Mae to set
	 */
	public void setNome_Mae(String nome_Mae)
	{
		Nome_Mae = nome_Mae;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro()
	{
		return Bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro)
	{
		Bairro = bairro;
	}

	/**
	 * @return the rua
	 */
	public String getRua()
	{
		return Rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua)
	{
		Rua = rua;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		Email = email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha()
	{
		return Senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha)
	{
		Senha = senha;
	}
}

