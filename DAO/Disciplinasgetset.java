/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author dodoa
 */
public class Disciplinasgetset {
    
    private String disciplina;
    private String cargh;
    private String curso;
    private int nvagas;
    private String periodo;


    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCargH() {
        return cargh;
    }

    public void setCargH(String cargh) {
        this.cargh = cargh;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    } 
    public int getNVagas() {
        return nvagas;
    }

    public void setNVagas(int nvagas) {
        this.nvagas = nvagas;
    } 
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    } 

    @Override
    public String toString() {
        return getDisciplina(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
