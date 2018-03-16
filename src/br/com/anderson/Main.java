/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.anderson;

import br.com.anderson.objetos.Aluno;
import br.com.anderson.objetos.Disciplina;
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
        
        do {
            String nome;
            String departamento;
            char status;
            
            nome = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
            departamento = JOptionPane.showInputDialog("Informe o departamento:");
            status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo?").charAt(0);
            materias.add(new Disciplina(nome, departamento, status));
        }while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?" )) == 0);
           String disciplinasDisponiveis = "";
           for (Disciplina materia : materias) {
               disciplinasDisponiveis +="\n"+ materias.lastIndexOf(materia) + " " + materia.getNome();
        }
           JOptionPane.showMessageDialog(null, disciplinasDisponiveis);
        
        List<Aluno> alunos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        do {
            int matricula;
            Date dataMatricula;
            
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da matrícula:"));
            dataMatricula = sdf.parse(JOptionPane.showInputDialog("Qual a data de matrícula?"));
            alunos.add(new Aluno(matricula, dataMatricula));
        }while((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
           for (Aluno aluno : alunos) {
               alunosmatriculados +="\n"+ alunos.lastIndexOf(matriculas) + " " + matriculas.getMatricula();
        }
        
        
    }
    
}
