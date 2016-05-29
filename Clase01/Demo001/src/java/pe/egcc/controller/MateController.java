package pe.egcc.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pe.egcc.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
@ManagedBean
@RequestScoped
public class MateController {

  private int num1;
  private int num2;
  private int suma;
  private boolean formulario = true;

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

  public void doProcesar() {
    MateService service = new MateService();
    suma = service.sumar(num1, num2);
    formulario = false;
  }

  public void doRetornar(){
    formulario = true;
  }
}
