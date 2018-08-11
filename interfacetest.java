class interfacetest implements i1,i2{

public void print(){

    System.out.println("child class");
    System.out.println("value of a "+ i1.a);    

}

public static void main(String z[]){

    interfacetest t = new interfacetest();
    t.print();
}
}