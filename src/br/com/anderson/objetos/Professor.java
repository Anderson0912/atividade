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
public class Professor extends Pessoa {

    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    private int cargaHoraria;
    private float valorHora;
    private float salario;

    public Professor(int cargaHoraria, float valorHora, String nome, String rg, String cpf, Date datanascimento, int idade) {
        super(nome, rg, cpf, datanascimento, idade);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = calculaSalario(valorHora, cargaHoraria);
    }

    public float calculaSalario(float valorHora, float cargaHoraria) {
        return valorHora * cargaHoraria;
    }

    public ArrayList getDisciplinas() {
        return disciplina;
    }

    public void setDisciplinas(ArrayList disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nProfessor: " +nome+ "\nDisciplina: " + disciplina + "\nCarga Horária: " + cargaHoraria + "\nValor da Hora: " + valorHora + "\nSalário: " + salario + '.';
    }
}
