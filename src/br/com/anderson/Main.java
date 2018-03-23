/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.anderson;

import br.com.anderson.objetos.Aluno;
import br.com.anderson.objetos.Disciplina;
import br.com.anderson.objetos.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author anderson.154517
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        List<Disciplina> materias = new ArrayList<>();
        List<Professor> prof = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();

        int esc = 0;
        do {
            esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha"
                    + "\n 1. Cadastro de Disciplina"
                    + "\n 2. Cadastro de Professor"
                    + "\n 3. Cadastro de Aluno"
                    + "\n 4. Consulta de Disciplina"
                    + "\n 5. Consulta de Professor"
                    + "\n 6. Consulta de Aluno"
                    + "\n 7. Sair"));
            switch (esc) {
                case 1: {
                    do {
                        String nome;
                        String departamento;
                        char status;

                        nome = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
                        departamento = JOptionPane.showInputDialog("Informe o departamento:");
                        status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo?").charAt(0);
                        materias.add(new Disciplina(nome, departamento, status));
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
                    break;
                }
                case 2: {
                    do {
                        int cargaHoraria;
                        float valorHora;
                        float salario = 0;
                        String nome;
                        String rg;
                        String cpf;
                        int idade = 0;
                        Date dataNascimento;
                        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");

                        nome = JOptionPane.showInputDialog("Informe o seu nome:");
                        rg = JOptionPane.showInputDialog("Informe o seu RG:");
                        cpf = JOptionPane.showInputDialog("Informe o seu CPF:");
                        dataNascimento = conversor.parse(JOptionPane.showInputDialog("Informe a sua data de nascimento:"));
                        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua carga horária:"));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora:"));

                        prof.add(new Professor(cargaHoraria, valorHora, salario, nome, rg, cpf, idade, dataNascimento));

                        if (JOptionPane.showConfirmDialog(null, "Professor já trabalha em alguma disciplina?") == 0) {
                            do {
                                String disciplinasExistentes = "";
                                for (Disciplina materia : materias) {
                                    disciplinasExistentes += "\n" + materias.lastIndexOf(materia) + " " + materia.getNome();
                                }
                                int escolhaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe qual disciplina: \n" + disciplinasExistentes));
                                prof.get(prof.size() - 1).getDisciplinas().add(materias.get(escolhaDisciplina));
                            } while ((JOptionPane.showConfirmDialog(null, "Professor possui outra disciplina?")) == 0);
                        }
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
                    break;
                }
                case 3: {
                    do {
                        int matricula;
                        Date dataMatricula;
                        String nome;
                        String rg;
                        String cpf;
                        Date dataNascimento;
                        int idade = 0;

                        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");

                        nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
                        rg = JOptionPane.showInputDialog("Informe o RG do aluno:");
                        cpf = JOptionPane.showInputDialog("Informe o CPF do aluno:");
                        dataNascimento = conversor.parse(JOptionPane.showInputDialog("Informe a data de nascimento do aluno:"));
                        dataMatricula = conversor.parse(JOptionPane.showInputDialog("Informe a data de matrícula do aluno:"));
                        matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do aluno:"));
                        alunos.add(new Aluno(matricula, dataMatricula, nome, rg, cpf, dataNascimento, idade));
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
                    break;
                }
                case 4: {
                    JOptionPane.showInputDialog(materias.toString());
                }
                break;
                case 5: {
                    JOptionPane.showInputDialog(prof.toString());
                }
                break;
                case 6: {
                    JOptionPane.showInputDialog(alunos.toString());
                }
            }
        } while (esc != 7);
    }

}
