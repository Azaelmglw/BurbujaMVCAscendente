package main;

import views.*;
import models.*;
import controllers.*;

/**
 *
 * @author Azael_Mendoza
 */
public class Main {
    private static ViewPrincipal view_principal;
    private static ModelPrincipal model_principal;
    private static ControllerPrincipal controller_principal;
    
    private static ViewBurbujaAscendente view_burbuja_ascendente;
    private static ModelBurbujaAscendente model_burbuja_ascendente;
    private static ControllerBurbujaAscendente controller_burbuja_ascendente;
    
    public static void main (String oamg[]){
        view_burbuja_ascendente = new ViewBurbujaAscendente();
        model_burbuja_ascendente = new ModelBurbujaAscendente();
        controller_burbuja_ascendente = new ControllerBurbujaAscendente(view_burbuja_ascendente, model_burbuja_ascendente);
        
        view_principal = new ViewPrincipal();
        model_principal = new ModelPrincipal();
        controller_principal = new ControllerPrincipal(view_principal, view_burbuja_ascendente, model_principal);
    }
    
}