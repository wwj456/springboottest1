package com.gl.springbootagi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAgiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAgiApplication.class, args);
        /*
        Integer[] intArray={new Integer(2),new Integer(4),new Integer(3)};

        Double[] doubleArray={(3.4),(1.3),(-22.1)};
        Character[] charArray={'a','j','r'};
        String[] stringArray={"TOM","SUSAN","KIM"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println("Sorted Integer objects:");
        printList(intArray);
        System.out.println("Sorted Double objects:");
        printList(doubleArray);
        System.out.println("Sourted Character objects:");
        printList(charArray);
        System.out.println("Sourted String objects:");
        printList(stringArray);*/
    }
    /*
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for (int i=0;i<list.length-1;i++){
            currentMin=list[i];
            currentMinIndex=i;

            for (int j=i+1;j<list.length;j++){
                if(currentMin.compareTo(list[j])>0){
                    currentMin =list[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex !=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }
    public static void printList(Object[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"");
            System.out.println();
        }
    }*/
}
