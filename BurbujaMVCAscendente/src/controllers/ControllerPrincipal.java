package controllers;

import views.*;
import models.*;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerPrincipal {
    ViewPrincipal view_principal;
    ViewBurbujaAscendente view_burbuja_ascendente;
    ModelPrincipal model_principal;
    
    public ControllerPrincipal(ViewPrincipal view_principal, ViewBurbujaAscendente view_burbuja_ascendente, ModelPrincipal model_principal){
        this.view_principal = view_principal;
        this.view_burbuja_ascendente = view_burbuja_ascendente;
        this.model_principal = model_principal;
        initView();
    }
    
    public void initView(){
        this.view_principal.setTitle("Burbuja Ascendente MVC");
        this.view_principal.jbtn_burbuja_ascendente.addActionListener(e -> jbtn_burbuja_ascendenteMouseClicked());
        this.view_principal.setLocationRelativeTo(null);
        this.view_principal.setVisible(true);
    }
    
    public void jbtn_burbuja_ascendenteMouseClicked(){
        this.view_principal.setContentPane(view_burbuja_ascendente);
        this.view_principal.revalidate();
        this.view_principal.repaint();
    }
    
}