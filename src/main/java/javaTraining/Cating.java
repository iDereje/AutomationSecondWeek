package javaTraining;



public class Cating {
  public static void main(String[] args) {

String stringAInt = "5" ;

int total = Integer.parseInt(stringAInt);
    System.out.println(total+10);
    System.out.println(total/2);
    System.out.println(total*5);
    System.out.println(total-5);




    String java = "i love java";
//

    String a = java.substring(7);
    System.out.println(a);
    String b = java.substring(2, 6);
    System.out.println(b);
    System.out.println(java.length());
    String c = java.substring(7,java.length());
    System.out.println(c);

    String d = java.substring(7,12);

  }
}
