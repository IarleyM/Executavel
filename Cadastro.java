package Aula.Executavel;

import java.util.*;

public class Cadastro {
	
	private int id;
	private String nome;
	private double salario;
	private String endereco;
	
	@Override
	public String toString() {
		return "Funcionario: " + nome +", id=" + id +  ", salario=" + salario;
	}
	
	public Cadastro(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Cadastro(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario += porcentagem * salario / 100;
	}
	
}
