package exercicio1;

public class Disciplina {
	
	private String nome;
	private float nota;
	
	public Disciplina() {
		super();
		this.nome = "";
		this.nota = 0;
	}	
	
	public Disciplina(String nome) {
		super();
		this.nome = nome;
		this.nota = 0;
	}
	
	public Disciplina(String nome, float nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
		
}
