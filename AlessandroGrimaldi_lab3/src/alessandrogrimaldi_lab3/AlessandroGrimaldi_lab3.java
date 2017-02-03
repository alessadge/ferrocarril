/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alessandrogrimaldi_lab3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author adgri_001
 */
public class AlessandroGrimaldi_lab3 {

    
    public static void main(String[] args) {
        ArrayList<Carro> carro = new ArrayList();
        ArrayList<Empleado> empleado = new ArrayList();
        ArrayList<Cliente> cliente = new ArrayList();
        ArrayList<Personas> persona = new ArrayList();
        String opcion = "";
        while(!opcion.equalsIgnoreCase("e")){
             opcion=JOptionPane.showInputDialog("MENU\n"
                    + "a- Agregar \n"
                    + "b- Eliminar \n"
                    + "c- Modificar\n"
                    + "d- Ventas \n"
                    + "e- Salir\n");
             
             if(opcion.equals("a")){
                 String opcion1 = "";
                 while(!opcion1.equalsIgnoreCase("e")){
                        opcion1=JOptionPane.showInputDialog("Que desea agregar? \n"
                                          + "a- Carro \n"
                                          + "b- Empleado \n"
                                          + "c- Cliente\n"
                                          + "e- Salir\n");
                        if(opcion1.equals("a")){
                        String opcion2 = "";
                        while(!opcion2.equalsIgnoreCase("e")){
                              opcion2=JOptionPane.showInputDialog("Que carro desea agregar?\n"
                                   + "a- Maybach \n"
                                   + "b- Morgan Aereo 8\n"
                                   + "c- Fisker Automative\n"
                                   + "d- Tramontana \n"
                                   + "e- Salir\n");
                              if(opcion2.equals("a")){
                                  
                                  
                                  
                              }
                              if(opcion2.equals("b")){
                                  
                              }
                              if(opcion2.equals("c")){
                                  
                              }
                              if(opcion2.equals("d")){
                                  
                              }
                         }
                      }
                        if(opcion1.equals("b")){
                            
                 
             }
                        if(opcion1.equals("c")){
                            
             }
             }  
             }
             if(opcion.equals("b")){
               String opcion3 = "";
                 while(!opcion3.equalsIgnoreCase("e")){
                        opcion3=JOptionPane.showInputDialog("Que desea eliminar? \n"
                                          + "a- Carro \n"
                                          + "b- Empleado \n"
                                          + "c- Cliente\n"
                                          + "d- Salir\n");
                        if(opcion3.equals("a")){ 
                            String opcion4 = "";
                      while(!opcion4.equalsIgnoreCase("e")){
                        opcion4=JOptionPane.showInputDialog("Que desea eliminar? \n"
                                          + "a- Maybach \n"
                                          + "b- Morgan Aero 8 \n"
                                          + "c- Fikser Automotive\n"
                                          + "d- Tramontana\n"
                                          + "e- Salir");
                            if(opcion4.equals("a")){  
                                int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del Maybach "));
                                for (Carro t : carro) {
                                    if(t instanceof Maybach){
                                        carro.remove(pos);
                                    }
                                }
                            
                            }     
                            if(opcion4.equals("b")){  
                                 int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del Morgan "));
                                for (Carro t : carro) {
                                    if(t instanceof Morgan){
                                        carro.remove(pos);
                                    }
                                }
                            }
                            } 
                            if(opcion4.equals("c")){  
                                 int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del Fisker "));
                                for (Carro t : carro) {
                                    if(t instanceof Fisker){
                                        carro.remove(pos);
                                    }
                                }
                            }
                            
                            if(opcion4.equals("d")){  
                                int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del Tramontana "));
                                for (Carro t : carro) {
                                    if(t instanceof Tramontana){
                                        carro.remove(pos);
                                    }
                                }
                            
                            } 
                        }
                        
                        }
                        if(opcion3.equals("b")){  
                            
                         int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del Empleado "));
                                for (Empleado t : empleado) {
                                    if(t instanceof Empleado){
                                        empleado.remove(pos);
                                    }
                                }
                        }
                        if(opcion3.equals("c")){  
                            int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del Cliente "));
                                for (Cliente t : cliente) {
                                    if(t instanceof Cliente){
                                        cliente.remove(pos);
                                    }
                                }
                        
                        }
             }
             if(opcion.equals("c")){
                 String opcion1 = "";
                 while(!opcion1.equalsIgnoreCase("e")){
                        opcion1=JOptionPane.showInputDialog("Que desea modificar? \n"
                                          + "a- Carro \n"
                                          + "b- Empleado \n"
                                          + "c- Cliente\n"
                                          + "e- Salir\n");
                        if(opcion1.equals("a")){
                            String opcion2 = "";
                        while(!opcion2.equalsIgnoreCase("e")){
                              opcion2=JOptionPane.showInputDialog("Que carro desea modificar?\n"
                                   + "a- Maybach \n"
                                   + "b- Morgan Aereo 8\n"
                                   + "c- Fisker Automative\n"
                                   + "d- Tramontana \n"
                                   + "e- Salir\n");
                              if(opcion2.equals("a")){
                                  String acum="";
                                  for (int i=0;i<carro.size();i++) {
                                         if(carro.get(i) instanceof Maybach){
                                         acum += (""+i)+" " + carro.get(i)+"\n";
                                         }
                                     }
                                  int pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado: \n"+acum));
                                  for (Carro t : carro) {
                                      if (t instanceof Maybach) {
                                  int repuesto=Integer.parseInt(JOptionPane.showInputDialog("Llantas de repuesto: "));
                                  String  numeroSerie= JOptionPane.showInputDialog("Numero de serie: ");
                                  int velocidad=Integer.parseInt(JOptionPane.showInputDialog("Velocidad del carro: "));
                                  int kilometros=Integer.parseInt(JOptionPane.showInputDialog("Kilometros del carro: "));
                                  int precio=Integer.parseInt(JOptionPane.showInputDialog("Precio del carro: "));
                                  String  marcaLlanta= JOptionPane.showInputDialog("Marca de la llanta: ");
                                  String polarizado = JOptionPane.showInputDialog("Tiene polarizado (Si/No): ");
                                  ((Maybach)carro.get(pos)).setRepuesto(repuesto);
                                  ((Maybach)carro.get(pos)).setVelocidad(velocidad);
                                  ((Maybach)carro.get(pos)).setKilometros(kilometros);
                                  ((Maybach)carro.get(pos)).setPrecio(precio);
                                  ((Maybach)carro.get(pos)).setNumeroSerie(numeroSerie);
                                          }
                              }
                              }
                              if(opcion2.equals("b")){
                                  String acum="";
                                  for (int i=0;i<carro.size();i++) {
                                         if(carro.get(i) instanceof Morgan){
                                         acum += (""+i)+" " + carro.get(i)+"\n";
                                         }
                                     }
                                  int pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado: \n"+acum));
                                  for (Carro t : carro) {
                                      if (t instanceof Morgan) {
                                  String  convert= JOptionPane.showInputDialog("Es convertible o no? ");
                                  String  numeroSerie= JOptionPane.showInputDialog("Numero de serie: ");
                                  int velocidad=Integer.parseInt(JOptionPane.showInputDialog("Velocidad del carro: "));
                                  int kilometros=Integer.parseInt(JOptionPane.showInputDialog("Kilometros del carro: "));
                                  int precio=Integer.parseInt(JOptionPane.showInputDialog("Precio del carro: "));
                                  String  marcaLlanta= JOptionPane.showInputDialog("Marca de la llanta: ");
                                  String polarizado = JOptionPane.showInputDialog("Tiene polarizado (Si/No): ");
                                  ((Morgan)carro.get(pos)).setConvert(convert);
                                  ((Morgan)carro.get(pos)).setMarcaLlanta(marcaLlanta);
                                  ((Morgan)carro.get(pos)).setPolarizado(polarizado);
                                  ((Morgan)carro.get(pos)).setVelocidad(velocidad);
                                  ((Morgan)carro.get(pos)).setKilometros(kilometros);
                                  ((Morgan)carro.get(pos)).setPrecio(precio);
                                  ((Morgan)carro.get(pos)).setNumeroSerie(numeroSerie);
                              }
                                  }
                              }
                              if(opcion2.equals("c")){
                                  String acum="";
                                  for (int i=0;i<carro.size();i++) {
                                         if(carro.get(i) instanceof Fisker){
                                         acum += (""+i)+" " + carro.get(i)+"\n";
                                         }
                                     }
                                  int pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado: \n"+acum));
                                  for (Carro t : carro) {
                                      if (t instanceof Fisker) {
                                  String  convert= JOptionPane.showInputDialog("Es convertible o no? ");
                                  String  camion= JOptionPane.showInputDialog("Es camion o turismo ");
                                  String  numeroSerie= JOptionPane.showInputDialog("Numero de serie: ");
                                  int velocidad=Integer.parseInt(JOptionPane.showInputDialog("Velocidad del carro: "));
                                  int kilometros=Integer.parseInt(JOptionPane.showInputDialog("Kilometros del carro: "));
                                  int precio=Integer.parseInt(JOptionPane.showInputDialog("Precio del carro: "));
                                  String  marcaLlanta= JOptionPane.showInputDialog("Marca de la llanta: ");
                                  String polarizado = JOptionPane.showInputDialog("Tiene polarizado (Si/No): ");
                                  ((Fisker)carro.get(pos)).setConvert(convert);
                                  ((Fisker)carro.get(pos)).setCamion(camion);
                                  ((Fisker)carro.get(pos)).setMarcaLlanta(marcaLlanta);
                                  ((Fisker)carro.get(pos)).setPolarizado(polarizado);
                                  ((Fisker)carro.get(pos)).setVelocidad(velocidad);
                                  ((Fisker)carro.get(pos)).setKilometros(kilometros);
                                  ((Fisker)carro.get(pos)).setPrecio(precio);
                                  ((Fisker)carro.get(pos)).setNumeroSerie(numeroSerie);
                                      }
                                  }       
                              }
                              if(opcion2.equals("d")){
                                  String acum="";
                                  for (int i=0;i<carro.size();i++) {
                                         if(carro.get(i) instanceof Tramontana){
                                         acum += (""+i)+" " + carro.get(i)+"\n";
                                         }
                                     }
                                  int pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado: \n"+acum));
                                  for (Carro t : carro) {
                                      if (t instanceof Fisker) {
                                  int peso=Integer.parseInt(JOptionPane.showInputDialog("Peso del carro: "));
                                  int transmision=Integer.parseInt(JOptionPane.showInputDialog("Numero de cambios del carro: "));
                                  String  numeroSerie= JOptionPane.showInputDialog("Numero de serie: ");
                                  int velocidad=Integer.parseInt(JOptionPane.showInputDialog("Velocidad del carro: "));
                                  int kilometros=Integer.parseInt(JOptionPane.showInputDialog("Kilometros del carro: "));
                                  int precio=Integer.parseInt(JOptionPane.showInputDialog("Precio del carro: "));
                                  Color colorr = new Color(Color.BITMASK);
                                  Date fecha = new Date();
                                  String  marcaLlanta= JOptionPane.showInputDialog("Marca de la llanta: ");
                                  String polarizado = JOptionPane.showInputDialog("Tiene polarizado (Si/No): ");
                                  ((Tramontana)carro.get(pos)).setPeso(peso);
                                  ((Tramontana)carro.get(pos)).setTransmision(transmision);
                                  ((Tramontana)carro.get(pos)).setMarcaLlanta(marcaLlanta);
                                  ((Tramontana)carro.get(pos)).setPolarizado(polarizado);
                                  ((Tramontana)carro.get(pos)).setVelocidad(velocidad);
                                  ((Tramontana)carro.get(pos)).setKilometros(kilometros);
                                  ((Tramontana)carro.get(pos)).setPrecio(precio);
                                  ((Tramontana)carro.get(pos)).setNumeroSerie(numeroSerie);
                              }
                        }
                        }
                        }           
             }
                        if(opcion1.equals("b")){
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
                            for (Empleado t : empleado) {
                                      if (t instanceof Empleado) {
                            int horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas que trabaja: "));
                            String  nombre= JOptionPane.showInputDialog("Nombre del empleado: ");
                            String  ID= JOptionPane.showInputDialog("ID del empleado: ");
                            int edad=Integer.parseInt(JOptionPane.showInputDialog("Edad del empleado: "));
                            double altura=Integer.parseInt(JOptionPane.showInputDialog("Altura del empleado: "));
                            int peso=Integer.parseInt(JOptionPane.showInputDialog("Peso del empleado: "));
                            ((Empleado)empleado.get(pos)).setAltura(horas);
                            ((Empleado)empleado.get(pos)).setID(ID);
                            ((Empleado)empleado.get(pos)).setNombre(nombre);
                            ((Empleado)empleado.get(pos)).setHoras(horas);
                            ((Empleado)empleado.get(pos)).setPeso(peso);
                        }
                            }
                        }
                        if(opcion1.equals("c")){
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a modificar: "));
                            for (Empleado t : empleado) {
                                      if (t instanceof Empleado) {
                            int dinero=Integer.parseInt(JOptionPane.showInputDialog("Dinero del cliente: "));
                            String  nombre= JOptionPane.showInputDialog("Nombre del cliente: ");
                            String  ID= JOptionPane.showInputDialog("ID del cliente: ");
                            int edad=Integer.parseInt(JOptionPane.showInputDialog("Edad del cliente: "));
                            double altura=Integer.parseInt(JOptionPane.showInputDialog("Altura del cliente: "));
                            int peso=Integer.parseInt(JOptionPane.showInputDialog("Peso del cliente: "));
                            ((Cliente)cliente.get(pos)).setAltura(altura);
                            ((Cliente)cliente.get(pos)).setID(ID);
                            ((Cliente)cliente.get(pos)).setNombre(nombre);
                            ((Cliente)cliente.get(pos)).setDinero(dinero);
                            ((Cliente)cliente.get(pos)).setPeso(peso);
                        }
                            }
                        }
                 }
             }
             if(opcion.equals("d")){
                 String opcion1 = "";
                 while(!opcion1.equalsIgnoreCase("c")){
                        opcion1=JOptionPane.showInputDialog("Que desea modificar? \n"
                                          + "a- Ventas \n"
                                          + "b- Generar reporte \n"
                                          + "c- Salir\n");
                        if(opcion1.equals("a")){
                 String acum="";
                 String acum1="";
                 String acum2="";
                 for (int i=0;i<empleado.size();i++) {
                     acum += (""+i)+" " + empleado.get(i)+"\n";
                 }
                 int emp=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado: \n"+acum));
                 for (int i=0;i<cliente.size();i++) {
                     acum1 += (""+i)+" " + cliente.get(i)+"\n";
                 }
                 int client=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cliente: \n"+acum1));
                 if(((Empleado)empleado.get(emp)).getCliente() == null){
                    ((Empleado)empleado.get(emp)).setCliente(((Cliente)cliente.get(client)));
                    for (int i=0;i<carro.size();i++) {
                     acum2 += (""+i)+" " + carro.get(i)+"\n";
                     }
                     int posCaro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el carro: \n"+acum2));
                     if(((Cliente)cliente.get(client)).getDinero()>= carro.get(posCaro).getPrecio()){
                     int dinero = ((Cliente)cliente.get(client)).getDinero() - carro.get(posCaro).getPrecio();
                     ((Cliente)cliente.get(client)).setDinero(dinero);
                     Carro carro2 = carro.get(posCaro);
                    ((Cliente)cliente.get(client)).setCarro(carro2);
                     }else{
                       JOptionPane.showInputDialog("Cliente no tiene suficiente fondos");  
                     }
                 }
                 }
                        if(opcion1.equals("b")){
                            String acum = "";
                            for (int i=0;i<empleado.size();i++) {
                                 acum += (""+i)+" " + empleado.get(i)+" ";
                                 acum = acum + ((Empleado)empleado.get(i)).getCliente()+" "+((Cliente)cliente.get(i)).getCarro()+" "
                                         + ((Cliente)cliente.get(i)).getCarro().getPrecio()+" \n";
                         }
                            JOptionPane.showInputDialog("Reporte: \n"+acum);
                        }
             }
             
    }
    
}
}
}

                 
             
       
    
