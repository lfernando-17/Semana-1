package Exercicios.Encapsulamento;

import java.util.Scanner;
public class Aluno{
    private Integer matricula;
    private String nome;
    private String curso;
    Scanner input= new Scanner(System.in);
    public Aluno(){
        System.out.println("Nome do Aluno: ");
        this.nome= input.next();
        System.out.println("Matricula: ");
        this.matricula= input.nextInt();
        System.out.println("Curso: ");
        this.curso= input.next();
        if (curso.equalsIgnoreCase("si")) {
            this.curso= "Sistemas de Informação";
        }
    }

    public void listar(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + ", nome=" + nome + "]";
    }
    }