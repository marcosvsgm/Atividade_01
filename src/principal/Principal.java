package principal;

import java.util.Scanner;
import classes.Aluno;
import classes.Professor;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
	    System.out.println("Ecolha seu cargo:");
	    System.out.println("1 - Aluno \n2 - Professor \nDigite o número correspondente ao cargo.");
	    opcao = input.nextInt();
	    
	    if(opcao == 1) {
	    String nome,matricula;
	    int copias;
		Aluno a = new Aluno();
	    System.out.print("Digite Seu Nome: ");
	    nome = input.next();
		a.setNome(nome);
		System.out.print("Digite Sua Matricula: ");
	    matricula = input.next();
		a.setMatricula(matricula);
		System.out.print("Quantidade de Copias desejada: ");
	    copias = input.nextInt();
		double total = a.tirarCopia(copias);
		System.out.println("Aluno(a): "+a.getNome()+"\nNúmero da Matricula: "+a.getMatricula());
		System.out.printf("Valor total a pagar pela quantidade de "+copias+" copias: %.2f Reais", total);
	    }
	    
	    else if(opcao == 2){
		String nome,disciplina;
		int copias;
		Professor p = new Professor();
	    System.out.print("Digite Seu Nome: ");
	    nome = input.next();
		p.setNome(nome);
		System.out.print("Digite Sua Disciplina: ");
	    disciplina = input.next();
		p.setDisciplina(disciplina);
		System.out.print("Quantidade de Copias desejada: ");
	    copias = input.nextInt();
		double total = p.tirarCopia(copias);
		System.out.printf("\nProfessor(a): "+p.getNome()+"\nDisciplina: %s", disciplina);
		System.out.printf("\nValor total a pagar pela quantidade de "+copias+" copias: %.2f Reais", total);
	    }
	    
	    else {
	    	System.out.println("Você não selecionou uma opção valida");
	    	
	    }
	    
	    input.close();

	}

}
