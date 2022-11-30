package exercicio1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
    	
    	ArrayList<Disciplina> disciplinas = new ArrayList<>();
    	ArrayList<Disciplina> disciplinas_aprovadas = new ArrayList<>();
    	    
    	disciplinas.add(new Disciplina("Matematica", 10));
    	disciplinas.add(new Disciplina("Portugues", 4));
    	disciplinas.add(new Disciplina("Fisica", 3));
    	disciplinas.add(new Disciplina("Ingles", 7));
    	    	
    	Aluno aluno1 = new Aluno("joao", "vitor", 123, "Ensino Medio");
    	
    	aluno1.setDisciplinas(disciplinas);
    	
    	//imprime dados do aluno
    	System.out.println(aluno1.getNome());
    	System.out.println(aluno1.getSobrenome());
    	System.out.println(aluno1.getMatricula());
    	System.out.println(aluno1.getNomeCurso());

    	
    	System.out.printf("\nDisciplinas Matriculadas(%d):\n", disciplinas.size());
    	
    	mostrar(aluno1.getDisciplinas());	
    	
    	//verifica nota para add nas disciplinas aprovadas
    	for(Disciplina d: disciplinas) 
			if(d.getNota() >= 5)
				disciplinas_aprovadas.add(new Disciplina(d.getNome(), d.getNota()));
    	
    	System.out.printf("\n\nDisciplinas Aprovadas(%d):\n", disciplinas_aprovadas.size());
    	
    	aluno1.setDisicplinas_aprovadas(disciplinas_aprovadas);
    	
    	mostrar(aluno1.getDisicplinas_aprovadas());
    	
    }
    //imprime  array
    public static void mostrar(ArrayList<Disciplina> lista) {
    	for(Disciplina d: lista) 
    		System.out.printf("%s \t %.2f \n",d.getNome(), d.getNota());
    	
    }
    
}
