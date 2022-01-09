package com.mscs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                isDigitIncreasing(7404));
    }

    public static int isDigitIncreasing(int n){

        for(int i=1;i<10;i++){
            int res=0;
            int sum=0,cnt=1;
            while(res<n){
                sum+=i*Math.pow(10,cnt-1);
                res+=sum;
                if(res==n){
                    break;
                }
                cnt++;
            }
            if(res==n){
                return 1;
            }
        }
       return 0;
    }
    public static int is123Array(int [] a){
        if(a.length<3 || a.length%3 != 0){
            return 0;
        }
        for (int i = 0; i < a.length-2; i+=3) {
            if(a[i]!=1||a[i+1]!=2||a[i+2]!=3){
                return 0;
            }
        }
        return 1;



    }
    public static int hasNValues(int [] a,int n) {
        int cnt=0;
        int [] temp=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            boolean exist=false;
            for (int j = 0; j<cnt ; j++) {
                if(a[i]==temp[j]){
                    exist=true;
                    break;
                }
            }
            if(!exist){
                temp[cnt++]=a[i];
            }

        }

        return cnt==n ? 1 : 0;
    }

    public static int isRailroadTie(int[ ] a){
        if(a.length==0||a.length==1||a[0]==0||a[a.length-1]==0){
            return 0;
        }
        boolean hasDigit=false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                hasDigit=true;
            }
        }
        if(!hasDigit){
            return 0;
        }

        for (int i = 1; i < a.length-1; i++) {
            if(a[i]==0){
                if(a[i-1]==0||a[i+1]==0){
                    return 0;
                }
            }else{
                if(a[i-1]==0&&a[i+1]==0||a[i-1]!=0&&a[i+1]!=0){
                    return 0;
                }

            }
        }
        return 1;
    }

    public static int[] clusterCompression(int[] a){
        if(a.length==0 || a.length==1){
            return a;
        }

        int[] result = new int[a.length];
        result[0]=a[0];
        int cnt=1;
        for (int i = 1; i <a.length ; i++) {
            if(result[cnt-1]!=a[i]){
                result[cnt++]=a[i];
            }
        }
        int [] finalResult=new int[cnt];
        System.arraycopy(result, 0, finalResult, 0, finalResult.length);
        return finalResult;
    }

    public static int smallest(int n){
        int i=1;
        for (; true; i++) {
            int cnt=0;
            for (int j = 1; j<=n; j++) {
                String result=String.valueOf(i*j);
                if(result.contains("2")){
                    cnt++;
                }
            }
            if(cnt==n){
                break;
            }
        }
        return i;
    }

}
