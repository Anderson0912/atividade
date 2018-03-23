/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.anderson.objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author anderson.154517
 */
public class Aluno extends Pessoa {

    private int matricula;
    private Date dataMatricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno(int matricula, Date dataMatricula, String nome, String rg, String cpf, Date datanascimento, int idade) {
        super(nome, rg, cpf, datanascimento, idade);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(ArrayList disciplina) {
        this.disciplinas = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno: " + "\nMatrícula: " + matricula + "\nData de Matrícula: " + dataMatricula + "\nDisciplinas: " + disciplinas + '.';
    }
}
