package com.atguigu.java;

import java.util.ArrayList;

/**
 * @date 2019/7/8 -9:52
 */
public class Test {

//private static final Customer cust=new Customer();
public  static  final  int num=1;
public static final int NUM=2;
public static final String nation="china";


    public static void main(String[] args) {
        System.out.println("holle");
        System.out.println("args = [" + args + "]");
        int i=20;
        System.out.println("i = " + i);
        String[] arr=new  String[]{"tom","jer","yu","xiao"};
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[i]);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            for (int i1 = 0; i1 < list.size(); i1++) {
                
            }
            for (int i1 = list.size() - 1; i1 >= 0; i1--) {
                
            }
        }


        }
    public void method() {
        System.out.println("Test.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
    }

}
