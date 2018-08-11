class child extends parent{

    int a = 10;

    child (int a){
        this.a = a;
    }

    child(){

         super();
         super.m1();
        
    }

    void m1(){
    
        System.out.print("value of a "+a);

    }

    public static void main(String args[]){

        child c = new child(100);
        c.m1();
        // c.super.m1();
      
        

    }



}