package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Test {

public static void main(String[] args) {
	
List<Employe> employeList=Arrays.asList(new Employe("gova","26","20/03","lgova"),new Employe("adhi","28","20/03","badhi"),new Employe("shankar","29","20/03","nshankar"));
	

employeList.parallelStream().filter(name-> name.getName().equals("gova")).findFirst();

System.out.println(employeList.parallelStream().filter(name-> name.getName().equals("gova") || name .getName().equals("adhi")).map(mapObject->mapObject.getEmail())
);




}

}
