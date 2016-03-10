package br.com.caelum.blog.jenkins;

public class Orcamento
{

	private final double valor;
	private final Long id;

	public Orcamento(final double valor, final Long id)
	{
		this.valor = valor;
		this.id = id;
	}

	public double getValor()
	{
		return valor;
	}

	public Long getId()
	{
		return id;
	}

}
