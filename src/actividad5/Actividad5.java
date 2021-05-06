/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

import java.util.Scanner;

/**
 *
 * @author starco
 */
public class Actividad5 {

    /**
   
     */
     public static String[]  Dias;
    public static void llenarArreglo() {
        // TODO code application logic here
    System.out.println("--------------------------[ejercicio 1]--------------------------");
        Dias = new String[07];
        Dias[0] = "Domingo";
        Dias[1] = "Lunes";
        Dias[2] = "Martes";
        Dias[3] = "Miercoles";
        Dias[4] = "Jueves";
        Dias[5] = "Viernes";
        Dias[6] = "Sabado";

    }
    public static String obtenerDia(int dia){
        return Dias[dia-1];
    }
    public static void main(String[] args) {
           Actividad5.llenarArreglo();
           System.out.println(obtenerDia(7));

         
           for (int i = 1; i < 7; i++) {
               System.out.println(obtenerDia(i));
        }           

        System.out.println("--------------------------[ejercicio 2]--------------------------");

        System.out.println("Matriz de personajes");
        String sWar[][] = new String[3][4];
        sWar[0][0]="Han Solo";
        sWar[0][1]="BB-8";
        sWar[0][2]="Yoda";
        sWar[0][3]="Leia Organa";
        sWar[1][0]="Obi-Wan Kenobi";
        sWar[1][1]="Chewbacca";
        sWar[1][2]="Poe Dameron";
        sWar[1][3]="Palpatine";
        sWar[2][0]="Luke Skywalker";
        sWar[2][1]="C-3PO";
        sWar[2][2]="R2-D2";
        sWar[2][3]="Darth Vader";
        int i,j;
        for (i = 0;i < sWar.length; i++){
            for(j = 0; j < sWar[i].length; j++){
                System.out.print("["+sWar[i][j]+"]");
    
    }
    
System.out.println("--------------------------[ejercicio 3]--------------------------");

 String aCodigo[][]  = new String[26][2];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
    
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        
            for (int k = 0; k < aCodigo.length; k++) {
                System.out.println(aCodigo[k][0]+" : "+ aCodigo[k][1]);                
            }
        
            System.out.println("--------------------------[ejercicio 4]--------------------------");
            
            System.out.println("Ingrese una palabra sin espacios:");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.next();
        char [] aChar = palabra.toCharArray();
            for (int k = 0; k < aChar.length; k++) {
               System.out.println(aChar[k]);
               
           
        }
            
    }
         System.out.println("--------------------------[ejercicio 5]--------------------------");
            String aCodigo[][]  = new String[26][2];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
    
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una palabra solo en MAYUSCULA:");
        //sobre aviso no hay falsedad xd
        String palabra = leer.next();
        int Tpagar = 10;
        int asciiValue;
        char cChar;
        int x=0;
        char [] aChar = palabra.toCharArray();
        for (int k = 0; k < aChar.length; k++) {
            cChar  = aChar[k];
            asciiValue= (int) cChar;
            x = i;  
            switch (asciiValue) {
                case 65: System.out.println("A:"+aCodigo[65-65][1]);
                    break;
                case 66: System.out.println("B:"+aCodigo[66-65][1]);
                    break;
                case 67: System.out.println("C:"+aCodigo[67-65][1]);
                    break;
                case 68: System.out.println("D:"+aCodigo[68-65][1]);
                    break;
                case 69: System.out.println("E:"+aCodigo[68-65][1]);
                    break;
                case 70: System.out.println("F:"+aCodigo[69-65][1]);
                    break;
                case 71: System.out.println("G:"+aCodigo[70-65][1]);
                    break;
                case 72: System.out.println("H:"+aCodigo[71-65][1]);
                    break;
                case 73: System.out.println("I:"+aCodigo[72-65][1]);
                    break;
                case 74: System.out.println("J:"+aCodigo[73-65][1]);
                    break;
                case 75: System.out.println("K:"+aCodigo[74-65][1]);
                    break;
                case 76: System.out.println("L:"+aCodigo[75-65][1]);
                     break;
                case 77: System.out.println("M:"+aCodigo[76-65][1]);
                     break;
                case 78: System.out.println("N:"+aCodigo[77-65][1]);
                     break;
                case 79: System.out.println("O:"+aCodigo[78-65][1]);
                    break;
                case 80: System.out.println("P:"+aCodigo[79-65][1]);
                    break;
                case 81: System.out.println("Q:"+aCodigo[80-65][1]);
                    break;
                case 82: System.out.println("R:"+aCodigo[81-65][1]);
                    break;
                case 83: System.out.println("S:"+aCodigo[82-65][1]);
                    break;
                case 84: System.out.println("T:"+aCodigo[83-65][1]);
                    break;
                case 85: System.out.println("U:"+aCodigo[84-65][1]);
                    break;
                case 86:  System.out.println("V:"+aCodigo[85-65][1]);
                    break;
                case 87: System.out.println("W:"+aCodigo[86-65][1]);
                    break;
                case 88: System.out.println("X:"+aCodigo[87-65][1]);
                    break;
                case 89: System.out.println("Y:"+aCodigo[88-65][1]);
                    break;
                case 90: System.out.println("Z:"+aCodigo[89-65][1]);
                    break;
            }
        }
        if (x<=aChar.length) {
                if (x<=4) {
                    System.out.println("total a pagar ="+ Tpagar);
                }
                else{
                    int extra = x-4;
                    for (int k = 0; k < aChar.length; k++) {
                        Tpagar = Tpagar +3;
                    }
                    System.out.println("total a pagar mas el extra ="+ Tpagar);
                }
            }
     System.out.println("--------------------------[ejercicio 6]--------------------------");
     
     System.out.println("ingresa un sexo:");
        
        String SWar[][] = new String[3][10];
        SWar[0][0]="Darth Vader";
        SWar[1][0]="2,03 m";
        SWar[2][0]="male";
        
        SWar[0][1]="Luke Skywalker";
        SWar[1][1]="1.72 m";
        SWar[2][1]="male";
        
        SWar[0][2]="Han solo";
        SWar[1][2]="1.8 m";
        SWar[2][2]="male";
        
        SWar[0][3]="Lea Organa";
        SWar[1][3]="2,03 m";
        SWar[2][3]="female";
        
        SWar[0][4]="Asoka Tano";
        SWar[1][4]="1.88 m";
        SWar[2][4]="female";
        
        SWar[0][5]="Rey Skywalker";
        SWar[1][5]="1.7 m";
        SWar[2][5]="female";
        
        SWar[0][6]="Jabba el Hutt";
        SWar[1][6]="3,9 m";
        SWar[2][6]="hermafrodita";
        
        SWar[0][7]="Zorba Desilijic";
        SWar[1][7]="3,03 m";
        SWar[2][7]="hermafrodita";
        
        SWar[0][8]="R2-D2";
        SWar[1][8]="2,03 m";
        SWar[2][8]="programming";
        
        SWar[0][9]="C-3PO";
        SWar[1][9]="2,03 m";
        SWar[2][9]="programming";
        String names = leer.next();
        switch(names){
            case "Male": 
                for (int k = 0; k < 3; k++) {
                    System.out.println(SWar[0][k]);
                }
                break;
            case "Femele":
                for (int k = 3; k < 5; k++) {
                    System.out.println(SWar[0][k]);
                }
                break;
            case "Hermafrodita":
                for (int k = 5; k < 7; k++) {
                    System.out.println(SWar[0][k]);
                }
                break;
            case "Programming":
                for (int k = 7; k < 9; k++) {
                
                    System.out.println(SWar[0][k]);
                }
                break;
            
        }
        
        
    }
    }     
            

        
    

   
        
    


    
    
    



        