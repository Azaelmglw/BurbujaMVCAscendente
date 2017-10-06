package controllers;

import javax.swing.DefaultListModel;
import views.*;
import models.*;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerBurbujaAscendente {
    private final ViewBurbujaAscendente view_burbuja_ascendente;
    private final ModelBurbujaAscendente model_burbuja_ascendente;
    
    public ControllerBurbujaAscendente(ViewBurbujaAscendente view_burbuja_ascendente, ModelBurbujaAscendente model_burbuja_ascendente){
        this.view_burbuja_ascendente = view_burbuja_ascendente;
        this.model_burbuja_ascendente = model_burbuja_ascendente;
        initView();
    }
    
    public void initView(){
        view_burbuja_ascendente.jtf_insertar_numero.setText("" + model_burbuja_ascendente.getValor_Insertado());
        view_burbuja_ascendente.jbtn_insertar_numero.addActionListener(e -> jbtn_insertar_numeroMouseClicked());
        view_burbuja_ascendente.jbtn_ascendente.addActionListener(e -> jbtn_ascendenteMouseClicked());
        view_burbuja_ascendente.jbtn_promedio.addActionListener(e -> jbtn_promedioMouseClicked());
        model_burbuja_ascendente.Crear_Modelo_Lista();
        view_burbuja_ascendente.jli_lista_numeros.setModel(model_burbuja_ascendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_insertar_numeroMouseClicked(){
        model_burbuja_ascendente.setValor_Insertado(Double.parseDouble(view_burbuja_ascendente.jtf_insertar_numero.getText()));
        model_burbuja_ascendente.Insertar_Valor(model_burbuja_ascendente.getValor_Insertado());
    }
    
    public void jbtn_ascendenteMouseClicked(){
        model_burbuja_ascendente.Ordenar_Ascendente();
        view_burbuja_ascendente.jli_lista_numeros.setModel(model_burbuja_ascendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_promedioMouseClicked(){
        model_burbuja_ascendente.Promediar_Lista();
        view_burbuja_ascendente.jlb_promedio.setText("" + model_burbuja_ascendente.getPromedio());
    }
    
}