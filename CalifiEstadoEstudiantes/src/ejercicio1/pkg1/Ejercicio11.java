/* 
@autor:
 * Cesar Villalobos
 * Estudiante: Ing.Sistemas UDI
*/

/*
Programa que una vez se ingresan las respuestas correctas a las preguntas se piden las respuestas 
dadas por los estudiantes y se imprime la nota, el resultado obtenido por cada uno de ellos
y el número de estudiantes aprobados y desaprobados

*/

package ejercicio1.pkg1;
import javax.swing.*;
public class Ejercicio11 {
    public static void main(String[] args) {
        int a,i,j,apro=0,repro=0; //Se inicializan variables a usar
        float acierto0=0,acierto1=0,acierto2=0,acierto3=0,acierto4=0;
        Float acierto[]=new Float[5]; //Un vector flotante de 5 posiciones que guardará los aciertos de cada estudiante
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de preguntas"));
        String rc[]=new String[a];//Vector que almacenará las respuestas correctas
        for(i=0;i<a;i++){
            rc[i]=JOptionPane.showInputDialog("Digite la respuesta correcta de la pregunta "+(i+1));
        }
        String es1[]=new String[a]; //Vector del estudiante 1
        for(i=0;i<a;i++){//Bucle encargado de llenar vector del estudiante 1
            es1[i]=JOptionPane.showInputDialog("Digite la "+(i+1)+" respuesta del primer estudiante");
            if(es1[i].equals(rc[i])){
                acierto0+=1; //Se comparan las respuestas del estudiante 1 con las correctas y si cumple la condición suma el contador
            }
        }
        acierto[0]=acierto0;
        String es2[]=new String[a];
        for(i=0;i<a;i++){//Se procede igual que con el estudiante 1
            es2[i]=JOptionPane.showInputDialog("Digite la "+(i+1)+" respuesta del segundo estudiante");
        }
        for(i=0;i<a;i++){
            if(es2[i].equals(rc[i])){
                acierto1+=1;
            }
        }
        acierto[1]=acierto1;
        String es3[]=new String[a];
        for(i=0;i<a;i++){
            es3[i]=JOptionPane.showInputDialog("Digite la "+(i+1)+" respuesta del tercer estudiante");
        }
        for(i=0;i<a;i++){
            if(es3[i].equals(rc[i])){
                acierto2+=1;
            }
        }
        acierto[2]=acierto2;
        String es4[]=new String[a];
        for(i=0;i<a;i++){
            es4[i]=JOptionPane.showInputDialog("Digite la "+(i+1)+" respuesta del cuarto estudiante");
        }
        for(i=0;i<a;i++){
            if(es4[i].equals(rc[i])){
                acierto3+=1;
            }
        }
        acierto[3]=acierto3;
        String es5[]=new String[a];
        for(i=0;i<a;i++){
            es5[i]=JOptionPane.showInputDialog("Digite la "+(i+1)+" respuesta del quinto estudiante");
        }
        for(i=0;i<a;i++){
            if(es5[i].equals(rc[i])){
                acierto4+=1;
            }
        }
        acierto[4]=acierto4;
        Float no[]=new Float[5];
        for(i=0;i<5;i++){
            no[i]=(acierto[i]*5)/a;
        }
        String estado[]=new String[5];
        for(i=0;i<5;i++){
            if(no[i]>=3.2){//Se evalua a cada estudiante su nota, si es mayor o igual a 3.2 será aprobado
                estado[i]="Aprobado";
                apro+=1;//Contador que lleva el numero de estudiantes aprobado
            }
            else{
                estado[i]="Reprobado";
                repro+=1;
            }
        }
        String c="";
        for (i=0;i<5;i++){ 
            c+="\n"+(i+1)+" "+estado[i];
        }
        String b="";
        for (i=0;i<5;i++){
            b+="\n"+(i+1)+" "+no[i];
        }
        
        JOptionPane.showMessageDialog(null, "La nota obtenida por los estudiantes son: "+b);
        JOptionPane.showMessageDialog(null, "El resultado obtenido por los estudiantes es: "+c);
        JOptionPane.showMessageDialog(null, "Los estudiantes que aprobaron fueron: "+apro+"\nLos estudiantes que reprobaron fueron: "+repro);
    }
    
}
