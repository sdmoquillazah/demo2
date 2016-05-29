/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pe.egcc.service.Mateservice;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class MateController {
private int num1;
private int num2;
private int suma;
private boolean formulario;

    public boolean isFormulario() {
        return formulario;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    /**
     * Creates a new instance of MateController
     */
    public void doProcesar()
    {
        Mateservice service=new Mateservice();
        service.suma(num1, num2);
        
    }
    
}
