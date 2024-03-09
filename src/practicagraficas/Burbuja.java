/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagraficas;

/**
 *
 * @author Papá
 */
public class Burbuja {
    private int [] conjunto;
    
    public Burbuja(int [] conjunto){
        this.conjunto = conjunto;
    }
    public void Ordenar(){
        int aux = 0;
        for(int i=0;i<this.conjunto.length;i++){
            for(int j=1;j<this.conjunto.length;j++){
                if(conjunto[j-1] > conjunto[j]){
                    aux = conjunto[j];
                    conjunto[j] = conjunto[j-1];
                    conjunto[j-1] = aux;
                    
                }
            }
        }
    }
    public int [] getConjunto(){
        return this.conjunto;
    }
}
