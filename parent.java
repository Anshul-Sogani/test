class parent{

    public int a = 10;

    parent(){

        System.out.println("constructor of parent");
    }

    void m1(){

        int b = 20;
        System.out.println("method in parent" + b);
        System.out.println(a);

    }

}