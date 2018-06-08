/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoOrderNumbers;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author henrique
 */
public class Tabuleiro {
    private int tabuleiro[][]= new int [4][4];
    int contJogadas=0;
    

    public Tabuleiro(){
        IniciarTabuleiro();
    }
    public void IniciarTabuleiro(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              getTabuleiro()[i][j]=0;
             
    }
        }
    }
    /**
     * @return the tabuleiro
     */
    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    /**
     * @param tabuleiro the tabuleiro to set
     */
    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
    public void PreencherTabuleiro(){
        int p1=0,p2=0;
        int cont=0, cont2=0;
        boolean continuar=true;
    
        Random rd=new Random();
        int num=0;
        do{
            cont=0;
            cont2=0;
        num=rd.nextInt(16)+1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              if( getTabuleiro()[i][j]== num){
                  cont++;
              }else;
                  
              }
        }
        if(cont== 0){
            for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              if( getTabuleiro()[i][j]==0 ){
                getTabuleiro()[i][j]=num;
                i=4;
                j=4;
                 
              }else;
        }
        }
        }else;
        
        
        
        
            for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              if( getTabuleiro()[i][j]==0 ){
                 cont2++;
              }else;
        
        }
            }
            if(cont2==0){
                continuar=false;
            }
            else;
        }
        
        while(continuar);
    }
    
   
    
    public void MudarPosicao(int p1,int p2){
       try{
        if(getTabuleiro()[p1][p2-1]==16){
           getTabuleiro()[p1][p2-1]=getTabuleiro()[p1][p2];
           getTabuleiro()[p1][p2]=16;
           contJogadas++;
       }
       }catch(java.lang.ArrayIndexOutOfBoundsException e){
           
       }
        try{
       if(getTabuleiro()[p1][p2+1]==16){
           getTabuleiro()[p1][p2+1]=getTabuleiro()[p1][p2];
           getTabuleiro()[p1][p2]=16;
            contJogadas++;
       }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
           
       }
         try{
        if(getTabuleiro()[p1+1][p2]==16){
           getTabuleiro()[p1+1][p2]=getTabuleiro()[p1][p2];
          getTabuleiro()[p1][p2]=16;
           contJogadas++;
       }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
           
       }
           try{
         if(getTabuleiro()[p1-1][p2]==16){
           getTabuleiro()[p1-1][p2]=getTabuleiro()[p1][p2];
           getTabuleiro()[p1][p2]=16;
            contJogadas++;
       }
          }catch(java.lang.ArrayIndexOutOfBoundsException e){
           
    }
    
    
   
}
    public boolean Vence(){
        if(((getTabuleiro()[0][0]==1)&&(getTabuleiro()[0][1]==2) && (getTabuleiro()[0][2]==3)&&
                (getTabuleiro()[0][3]==4)&& (getTabuleiro()[1][0]==5)&& (getTabuleiro()[1][1]==6)&&
                (getTabuleiro()[1][2]==7)&& (getTabuleiro()[1][3]==8)&&
                (getTabuleiro()[2][0]==9)&&(getTabuleiro()[2][1]==10) && (getTabuleiro()[2][2]==11)&&
                (getTabuleiro()[2][3]==12)&& (getTabuleiro()[3][0]==13)&& (getTabuleiro()[3][1]==14)&&
                (getTabuleiro()[3][2]==15)&& (getTabuleiro()[3][3]==16))||((getTabuleiro()[0][0]==16) &&(getTabuleiro()[0][1]==1)&&(getTabuleiro()[0][2]==2) && (getTabuleiro()[0][3]==3)&&
                (getTabuleiro()[1][0]==4)&& (getTabuleiro()[1][1]==5)&& (getTabuleiro()[1][2]==6)&&
                (getTabuleiro()[1][3]==7)&& (getTabuleiro()[2][0]==8)&&
                (getTabuleiro()[2][1]==9)&&(getTabuleiro()[2][2]==10) && (getTabuleiro()[2][3]==11)&&
                (getTabuleiro()[3][0]==12)&& (getTabuleiro()[3][1]==13)&& (getTabuleiro()[3][2]==14)&&
                (getTabuleiro()[3][3]==15) )){
            
            return true;
        }
    
    
    return false;
}
    public void PreencherTabuleiroDefinido1(){
        getTabuleiro()[0][0]=1;
        getTabuleiro()[0][1]=2;
        getTabuleiro()[0][2]=3;
        getTabuleiro()[0][3]=4;
        getTabuleiro()[1][0]=5;
        getTabuleiro()[1][1]=6;
        getTabuleiro()[1][2]=7;
        getTabuleiro()[1][3]=8;
        getTabuleiro()[2][0]=9;
        getTabuleiro()[2][1]=10;
        getTabuleiro()[2][2]=11;
        getTabuleiro()[2][3]=12;
        getTabuleiro()[3][0]=13;
        getTabuleiro()[3][1]=14;
        getTabuleiro()[3][2]=16;
        getTabuleiro()[3][3]=15;
    }
    
     public void PreencherTabuleiroDefinido2(){
        getTabuleiro()[0][0]=1;
        getTabuleiro()[0][1]=16;
        getTabuleiro()[0][2]=2;
        getTabuleiro()[0][3]=3;
        getTabuleiro()[1][0]=4;
        getTabuleiro()[1][1]=5;
        getTabuleiro()[1][2]=6;
        getTabuleiro()[1][3]=7;
        getTabuleiro()[2][0]=8;
        getTabuleiro()[2][1]=9;
        getTabuleiro()[2][2]=10;
        getTabuleiro()[2][3]=11;
        getTabuleiro()[3][0]=12;
        getTabuleiro()[3][1]=13;
        getTabuleiro()[3][2]=14;
        getTabuleiro()[3][3]=15;
    }
}
