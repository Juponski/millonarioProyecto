/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprimerentregable.Millonario;

/**
 *
 * @author mchavesl
 */
import javax.swing.*;
 
import java.text.*;
import java.util.*;
 
public class Millonario {
 
    //Variables
    public static DecimalFormat miformato = new DecimalFormat("###,###,###,###");
    public static int opmenu = 0, aleatorioJuego = 0, respCorrJuego = 0, zonaSegura= 0,
                      nRespJuego = 0, min = 1, maxJuego = 15, confJuego = 0, n = 1,
                      confirm = 0, confResp = 0, nPreg = 0, tGanado = 0, vGanado = 0;
    public static Random rnd = new Random();
    public static String txtopmenu = "";
    // comment khkhkhkhkkk
    
    //Variable de las preguntas del juego
    public static String txtRespJuego = "", preg = "", resp1 = "", resp2 = "", resp3 = "", resp4 = "",
                         varPorcB = "",
    preg1 = "¿Cuál de estos planetas está más cercano al sol?",
    resPreg1A = "Neptuno", resPreg1B = "Urano", resPreg1C = "Tierra", resPreg1D = "Saturno",
            
    preg2 = "¿La vara que suele llevar como cetro el Dios de la mitología romana Baco se llama?",
    resPreg2A = "Tirso", resPreg2B = "Talión", resPreg2C = "Vareta", resPreg2D = "Másil",
            
    preg3 = "¿Cuál es el océano más grande del mundo?",
    resPreg3A = "Océano Pacífico", resPreg3B = "Océano Índico", resPreg3C = "Océano Antártico", resPreg3D = "Océano Atlántico",            
            
    preg4 = "¿Qué enfermedad tenía el legendario astrofísico Stephen Hawking?",
    resPreg4A = "Enfermedad de Addison", resPreg4B = "Progeria de Hutchinson-Gilford", 
    resPreg4C = "Esclerosis Lateral Amiotrófica", resPreg4D = "Síndrome de Marfan",
                 
    preg5 = "¿El origen del café proviene de...",
    resPreg5A = "Etíopia", resPreg5B = "Francia", resPreg5C = "Egipto", resPreg5D = "Indonesia",           
            
    preg6 = "¿¿Aproximadamente, qué porcentaje de la superficie de la Tierra es agua??",
    resPreg6A = "60%", resPreg6B = "70%", resPreg6C = "90%", resPreg6D = "50%",       
            
    preg7 = "¿En que año se fundó la franquicia de comida rápida McDonalds?",
    resPreg7A = "1970", resPreg7B = "1932", resPreg7C = "1944", resPreg7D = "1940",         
            
    preg8 = "Una persona fámelica está...",
    resPreg8A = "Irritable", resPreg8B = "Hambrienta", resPreg8C = "Furiosa", resPreg8D = "Asustada",            
            
    preg9 = "Son las membranas movibles cubiertas de piel que resguardan los ojos: ",
    resPreg9A = "Cejas", resPreg9B = "Pupilas", resPreg9C = "Párpados", resPreg9D = "Anteojos",        
            
    preg10 = "¿Cual de las siguientes serpientes no es venenosa?",
    resPreg10A = "Cobra", resPreg10B = "Víbora", resPreg10C = "Cascabel", resPreg10D = "Anaconda", 
            
    preg11 = "¿Quién dirigió la película \"El Padrino\" en 1972?",
    resPreg11A = "Roman Polanski", resPreg11B = "Franco Zeffirelli", 
    resPreg11C = "Francis Ford Copolla", resPreg11D = "Federico Fellini",             
            
    preg12 = "¿Cómo apodaron a Jose Bonaparte en España?",
    resPreg12A = "Pepe Botella", resPreg12B = "Pepe Plata", resPreg12C = "Pepe Gruñón", resPreg12D = "Pepe Sombrero",       
            
    preg13 = "En la mitología griega, Eros es considerado el dios del: ",
    resPreg13A = "Sol", resPreg13B = "Amor", resPreg13C = "Trabajo", resPreg13D = "Odio",           
            
    preg14 = "¿Dónde se desarrollo la civilización etrusca?",
    resPreg14A = "Península Itálica", resPreg14B = "Caucaso", resPreg14C = "Norte de África", resPreg14D = "Extremo Oriente",      
            
    preg15 = "Si un día decidieras sembrar semillas de Quercus robur. ¿Qué crecería?",
    resPreg15A = "Árbol", resPreg15B = "Flores", resPreg15C = "Verduras", resPreg15D = "Grano", 
            
    preg16 = "¿Dos de los animales que se destacan en el Guernica de Picasso son...?",
    resPreg16A = "Chigüiro y armadillo", resPreg16B = "Gallina y pollito", resPreg16C = "Caballo y toro", resPreg16D = "Raton y ardilla",                
            
    preg17 = "¿Los neurólogos creen que la corteza prefrontal del cerebro se activa cuando haces qué?",
    resPreg17A = "Tienes un ataque de pánico", resPreg17B = "Recuerdas un nombre", 
    resPreg17C = "Entiendes una broma", resPreg17D = "Escuchas música",        
            
    preg18 = "¿Quién fue el primero en recibir un premio Nobel de Literatura?",
    resPreg18A = "Novelista", resPreg18B = "Dramaturgo", resPreg18C = "Ensayista", resPreg18D = "Poeta",       
            
    preg19 = "¿Qué elemento químico fue nombrado en honor a un malvado duende del subsuelo?",
    resPreg19A = "Hafnio", resPreg19B = "Cobalto", resPreg19C = "Berilio", resPreg19D = "Telurio", 
            
    preg20 = "¿Qué novela escribió James Fenimore Cooper en una discusión con su esposa?",
    resPreg20A = "/“Precaución”/", resPreg20B = "/ “Los pioneros”/", resPreg20C = "/“El último mohicano”/", resPreg20D = "/“El cazador de ciervos”/";               
        
         
    public static void main(String [] args)
    {   // Menú del juego
        while (opmenu != 4)
        {
            try {
                 
                txtopmenu = JOptionPane.showInputDialog(null, "Bienvenido" +
                        "\n 1. Comenzar el juego" +
                        "\n 2. Ayuda" +
                        "\n 3. Salir" +
                        "\n Escoja una opción ?",
                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
             
                opmenu = Integer.parseInt(txtopmenu);
                 
                switch (opmenu)
                {
                case 1:
                    Jugar();
                    break;
                case 2:
                    Ayuda();
                    break;
                case 3:
                    Salir();
                    break;
                default:
                    Incorrecto();
                    break;
                }
                 
            } catch(Exception e) //Evita errores por parte del jugador.
            {
                Incorrecto();
            }
        }
    }
     
    
    public static void Incorrecto()
    {
        JOptionPane.showMessageDialog(null, "Tiene que seleccionar una de las opciones",
                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.ERROR_MESSAGE);
    }
     
   
     
    public static void Jugar()
    {
        
        n = 1;
        min = 1;
        do
        {
            confResp = 0;
            aleatorioJuego = (int)(Math.random()*(maxJuego))+min; //Genera la pregunta aleatoria
             
            do
            {
                switch (aleatorioJuego) //Menù de Preguntas y Respuestas
                {
                    case 1:
                        preg = preg1;
                        resp1 = "\n 1. " + resPreg1A;
                        resp2 = "\n 2. " + resPreg1B;
                        resp3 = "\n 3. " + resPreg1C;
                        resp4 = "\n 4. " + resPreg1D;
                        respCorrJuego = 3;
                    break;
                    case 2:
                        preg = preg2;
                        resp1 = "\n 1. " + resPreg2A;
                        resp2 = "\n 2. " + resPreg2B;
                        resp3 = "\n 3. " + resPreg2C;
                        resp4 = "\n 4. " + resPreg2D;
                        respCorrJuego = 1;
                    break;
                    case 3:
                        preg = preg3;
                        resp1 = "\n 1. " + resPreg3A;
                        resp2 = "\n 2. " + resPreg3B;
                        resp3 = "\n 3. " + resPreg3C;
                        resp4 = "\n 4. " + resPreg3D;
                        respCorrJuego = 1;
                    break;
                    case 4:
                        preg = preg4;
                        resp1 = "\n 1. " + resPreg4A;
                        resp2 = "\n 2. " + resPreg4B;
                        resp3 = "\n 3. " + resPreg4C;
                        resp4 = "\n 4. " + resPreg4D;
                        respCorrJuego = 3;
                    break;
                    case 5:
                        preg = preg5;
                        resp1 = "\n 1. " + resPreg5A;
                        resp2 = "\n 2. " + resPreg5B;
                        resp3 = "\n 3. " + resPreg5C;
                        resp4 = "\n 4. " + resPreg5D;
                        respCorrJuego = 1;
                    break;
                    case 6:
                        preg = preg6;
                        resp1 = "\n 1. " + resPreg6A;
                        resp2 = "\n 2. " + resPreg6B;
                        resp3 = "\n 3. " + resPreg6C;
                        resp4 = "\n 4. " + resPreg6D;
                        respCorrJuego = 2;
                    break;
                    case 7:
                        preg = preg7;
                        resp1 = "\n 1. " + resPreg7A;
                        resp2 = "\n 2. " + resPreg7B;
                        resp3 = "\n 3. " + resPreg7C;
                        resp4 = "\n 4. " + resPreg7D;
                        respCorrJuego = 4;
                    break;
                    case 8:
                        preg = preg8;
                        resp1 = "\n 1. " + resPreg8A;
                        resp2 = "\n 2. " + resPreg8B;
                        resp3 = "\n 3. " + resPreg8C;
                        resp4 = "\n 4. " + resPreg8D;
                        respCorrJuego = 2;
                    break;
                    case 9:
                        preg = preg9;
                        resp1 = "\n 1. " + resPreg9A;
                        resp2 = "\n 2. " + resPreg9B;
                        resp3 = "\n 3. " + resPreg9C;
                        resp4 = "\n 4. " + resPreg9D;
                        respCorrJuego = 3;
                    break;
                    case 10:
                        preg = preg10;
                        resp1 = "\n 1. " + resPreg10A;
                        resp2 = "\n 2. " + resPreg10B;
                        resp3 = "\n 3. " + resPreg10C;
                        resp4 = "\n 4. " + resPreg10D;
                        respCorrJuego = 4;
                    break;
                    case 11:
                        preg = preg11;
                        resp1 = "\n 1. " + resPreg11A;
                        resp2 = "\n 2. " + resPreg11B;
                        resp3 = "\n 3. " + resPreg11C;
                        resp4 = "\n 4. " + resPreg11D;
                        respCorrJuego = 3;
                    break;
                    case 12:
                        preg = preg12;
                        resp1 = "\n 1. " + resPreg12A;
                        resp2 = "\n 2. " + resPreg12B;
                        resp3 = "\n 3. " + resPreg12C;
                        resp4 = "\n 4. " + resPreg12D;
                        respCorrJuego = 1;
                    break;
                    case 13:
                        preg = preg13;
                        resp1 = "\n 1. " + resPreg13A;
                        resp2 = "\n 2. " + resPreg13B;
                        resp3 = "\n 3. " + resPreg13C;
                        resp4 = "\n 4. " + resPreg13D;
                        respCorrJuego = 2;
                    break;
                    case 14:
                        preg = preg14;
                        resp1 = "\n 1. " + resPreg14A;
                        resp2 = "\n 2. " + resPreg14B;
                        resp3 = "\n 3. " + resPreg14C;
                        resp4 = "\n 4. " + resPreg14D;
                        respCorrJuego = 1;
                    break;
                    case 15:
                        preg = preg15;
                        resp1 = "\n 1. " + resPreg15A;
                        resp2 = "\n 2. " + resPreg15B;
                        resp3 = "\n 3. " + resPreg15C;
                        resp4 = "\n 4. " + resPreg15D;
                        respCorrJuego = 1;
                    break;
                    case 16:
                        preg = preg16;
                        resp1 = "\n 1. " + resPreg16A;
                        resp2 = "\n 2. " + resPreg16B;
                        resp3 = "\n 3. " + resPreg16C;
                        resp4 = "\n 4. " + resPreg16D;
                        respCorrJuego = 3;
                    break;
                    case 17:
                        preg = preg17;
                        resp1 = "\n 1. " + resPreg17A;
                        resp2 = "\n 2. " + resPreg17B;
                        resp3 = "\n 3. " + resPreg17C;
                        resp4 = "\n 4. " + resPreg17D;
                        respCorrJuego = 3;
                    break;
                    case 18:
                        preg = preg18;
                        resp1 = "\n 1. " + resPreg18A;
                        resp2 = "\n 2. " + resPreg18B;
                        resp3 = "\n 3. " + resPreg18C;
                        resp4 = "\n 4. " + resPreg18D;
                        respCorrJuego = 4;
                    break;
                    case 19:
                        preg = preg19;
                        resp1 = "\n 1. " + resPreg19A;
                        resp2 = "\n 2. " + resPreg19B;
                        resp3 = "\n 3. " + resPreg19C;
                        resp4 = "\n 4. " + resPreg19D;
                        respCorrJuego = 2;
                    break;
                    case 20:
                        preg = preg20;
                        resp1 = "\n 1. " + resPreg20A;
                        resp2 = "\n 2. " + resPreg20B;
                        resp3 = "\n 3. " + resPreg20C;
                        resp4 = "\n 4. " + resPreg20D;
                        respCorrJuego = 1;
                    break;
                }
                if (nPreg == 0) //Presentacion de preguntas y respuestas en pantalla
                {
                    if (1==1){
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +
                                "\n7. Salir",
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                    }
                     
                    nRespJuego = Integer.parseInt(txtRespJuego);
                 
                    
                }
                
                     
                if (nRespJuego == 1 || nRespJuego == 2 || nRespJuego == 3 || nRespJuego == 4)
                {
                    if (respCorrJuego == nRespJuego)
                    {
                        if (n <= 15 )
                        {
 
                            if(n == 1)
                            {
                                vGanado = 100000;
                                zonaSegura = 0;
                            }
                            if(n == 2)
                            {
                                vGanado = 250000;
                                zonaSegura = 0; 
                            }
                            if(n == 3)
                            {
                                vGanado = 500000;
                                zonaSegura = 0;
                            }
                            if(n == 4)
                            {
                                vGanado = 750000;
                                zonaSegura = 0;
                            }
                            if(n == 5)
                            {
                                vGanado = 1000000;
                                zonaSegura = 1; // Define la zona segura
                            }
                            if(n == 6)
                            {
                                vGanado = 2000000;
                                zonaSegura = 0;
                            }
                            if(n == 7)
                            {
                                vGanado = 2500000;
                                zonaSegura = 0;
                            }
                            if(n == 8)
                            {
                                vGanado = 3000000;
                                zonaSegura = 1;
                            }
                            if(n == 9)
                            {
                                vGanado = 5000000;
                                zonaSegura = 0;
                            }
                            if(n == 10)
                            {
                                vGanado = 7500000;
                                zonaSegura = 1;
                            }
                            if(n == 11)
                            {
                                vGanado = 10000000;
                                zonaSegura = 0;
                            }
                            if(n == 12)
                            {
                                vGanado = 12000000;
                                zonaSegura = 0;
                            }
                            if(n == 13)
                            {
                                vGanado = 15000000;
                                zonaSegura = 1;
                            }
                            if(n == 14)
                            {
                                vGanado = 20000000;
                                zonaSegura = 0;
                            }
                            if(n == 15 )
                            {
                                vGanado = 30000000;
                                JOptionPane.showMessageDialog(null, "Ha ganado el premio mayor\n" +
                                        "Total ganado : ₡" + miformato.format(vGanado),
                                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                                Salir();
                            }
                             
                            if (zonaSegura == 1) // Le asigna el premio de la zona segura alcanzada si pierde
                            {
                                tGanado = vGanado;
                            }
                                 
                            confJuego = JOptionPane.showConfirmDialog(null, "Respuesta Correcta \n" +
                                    "Hasta el momento ha ganado:  ₡" + miformato.format(vGanado) +
                                    "\nDesea continuar jugando",
                                    "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                             
                            if (confJuego == JOptionPane.YES_OPTION)
                            {
                                confirm = 0;
                                confResp = 0;
                                nPreg = 0;
                            }
                            if (confJuego == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null, "Total ganado : ₡" + miformato.format(vGanado),
                                        "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                                confirm = 1;
                                confResp = 0;
                                nPreg = 0;
                            }
                             
                        }
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta \n" +
                                "Total ganado : ₡" + miformato.format(tGanado),
                                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.ERROR_MESSAGE);
                        confirm = 1;
                    }
                     
                }
                
                if (nRespJuego == 7)
                {
                    Salir();
                }
                if (nRespJuego >= 15 )
                {
                    confResp = 1;
                }
                
                
 
            }while(confResp == 1);
            n += 1;
        }while(confirm == 0);
         
    }
     
    public static void Ayuda()
    {   //Muestra las Indicaciones Generales del Juego
        JOptionPane.showMessageDialog(null, "Reglas\n" +
                "Empieza el juego al seleccionar la opción numero 1.\n" +
                "Premios \n" +
                "1a Pregunta    ₡100,000 \n" +
                "2a Pregunta   ₡250,000 \n" +
                "3a Pregunta   ₡5000,000 \n" +
                "4a Pregunta  ₡750,000 \n" +
                "5a Pregunta  ₡1,000,000 (1ra Zona Segura) \n" +
                "6a Pregunta  ₡2,000,000 Queda en Seguridad \n" +
                "7a Pregunta  ₡2,500,000 \n" +
                "8a Pregunta  ₡3,000,000 (2da Zona Segura) \n"+
                "9a Pregunta  ₡5,000,000 \n" +
                "10a Pregunta  ₡7,500,000 (3ra Zona Segura)\n" +
                "11a Pregunta  ₡10,000,000 \n" +
                "12a Pregunta  ₡12,000,000 \n" +
                "13a Pregunta  ₡15,000,000 (4ta Zona Segura) \n" +
                "14a Pregunta  ₡20,000,000 \n"+
                "15a Pregunta  ₡30,000,000 GRAN PREMIO \n",
                "¿QUIEN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
    }
     
    public static void Salir()
    { // Permite la salida del juego, con está opcion se evita que el concursante cierre por error el juego.
        System.exit(0);
    }
     
}