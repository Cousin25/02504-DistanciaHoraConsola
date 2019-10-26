/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 */
public class Main {
public static final Scanner SCN
        =new Scanner(System.in, "Windows-1252")
        .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    

    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        
        try{
            System.out.println("Distancia entre horas");
            
            System.out.println("================");
            
            System.out.print("Hora de inicio......:");
            int hEnt =SCN.nextInt();
            SCN.nextLine();
            System.out.print("Minuto de inicio......:");
            int mEnt =SCN.nextInt();
            SCN.nextLine();
            System.out.print("Segundo de inicio......:");
            int sEnt =SCN.nextInt();
            SCN.nextLine();
            
            System.out.println("-----");
            
           
            
            //hora actual
            int hAct=cal.get(Calendar.HOUR_OF_DAY);
            int mAct=cal.get(Calendar.MINUTE);
            int sAct=cal.get(Calendar.SECOND);
            
           
            
            //tiempos
            int tiempoEnt=hEnt * 3600 + mEnt * 60 +sEnt;
            int tiempoAct=hAct * 3600 + mAct * 60 + sAct;
            
            int hDiferencia = tiempoAct - tiempoEnt;
            
            int horas_clase = hDiferencia /3600;
            int mins_en_seg = hDiferencia % 3600;
            
            int minutos_clase = mins_en_seg / 60;
            int segundos_clase = mins_en_seg % 60;
            
            System.out.printf("Tiempo actual: %02d:%02d:%02d%n", hAct, mAct, sAct);
            System.out.printf("Tiempo de clase: %02d:%02d:%02d%n", horas_clase, minutos_clase, segundos_clase);
            

        }catch (Exception e){
            System.out.print("ERROR DE ENTRADA!!!!!!!");
        } finally {
            
    }
    
}}
