public class Classes {
    
    public static void main(String[] args) {
        master();
        // master1();
        // 65, 77, 82, 73, 78
        // char[] a = new char[266];
       for(char c='a';c<='z';c++){
        int i=c;
        System.out.println("character: "+c+" "+"Number: "+i);
       }

       System.out.println();

       for(char c='A';c<='Z';c++){
        int i=c;
        System.out.println("character: "+c+" "+"Number: "+i);
       }

        Classes m = new Classes();
        m.master1();
        
    }

    static void master() {
        System.out.println("Hello");
    }

    void master1(){
        System.out.println("I am inside the non static class!");
    }
    
}
