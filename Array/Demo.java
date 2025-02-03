class Student{
    int rollno;
    String name;
    int mark;
}


class Demo{
    public static void main(String[] args) {
        // int num[] = new int[7];

        // num[0]=12;
        // num[1]=12;
        // num[2]=12;
        // num[4]=12;
        
        // for (int i=0; i<num.length; i++){
        //     System.out.println(num[i]);
        // }
        
        // System.out.println("___________________");

        // for(int n : num){
        //     System.out.println(n);
        // }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name= "Arun";
        s1.mark=98;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name= "Kabil";
        s2.mark = 90;

        
        System.out.println(s1.rollno +":"+ s1.name + ":" + s1.mark );
        System.out.println(s2.rollno +":"+ s2.name + ":" + s2.mark );
        

        }

}