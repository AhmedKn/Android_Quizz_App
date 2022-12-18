package com.example.quiz;
public class Score {
    public static int[] score={0,0,0,0,0};
    public static int[] check1={0,0,0,0};
    public static int[] check2={0,0,0,0};
    public static int[] check3={0,0,0,0};
    public static int[] check4={0,0,0,0};
    public static int[] check5={0,0,0,0};
    public static String username="";
    public static void setCheck1(int index,int lord){
        check1[index]=lord;
    }
    public static void setCheck2(int index,int lord){
        check2[index]=lord;
    }
    public static void setCheck3(int index,int lord){
        check3[index]=lord;
    }
    public static void setCheck4(int index,int lord){
        check4[index]=lord;
    }
    public static void setCheck5(int index,int lord){
        check5[index]=lord;
    }
    public static void setScore(int index,int lord){
        score[index]=lord;
    }
    public static int[] getScore(){
        return score;
    }
    public static void setUsername(String user){
        username=user;
    }
    public static void reintialize(){
        for(int i=0;i<4;i++){
            check1[i]=0;
            check2[i]=0;
            check3[i]=0;
            check4[i]=0;
            check5[i]=0;
            score[i]=0;
        }
        score[4]=0;
    }
}
