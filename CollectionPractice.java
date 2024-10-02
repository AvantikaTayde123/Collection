import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractice {
    String name;
    int total=0;
    int C;
    int cpp;
    int java;

    CollectionPractice(String name, int C, int cpp, int java) {
        this.name = name;
        this.C=C;
        this.cpp = cpp;
        this.java = java;
    }

    public String getname(){
        return name;
    }

    public int totalmarks(){
        total=C+cpp+java;
        int avg=total/3;
        return avg;
    }
    public String toString(){
        return "name "+this.name+ " marks "+(this.C+this.cpp+this.java)+" avg "+totalmarks();

    }   
}

class StudentManagement{
    public static void main(String[] args) {
        ArrayList<CollectionPractice>s=new ArrayList<>();
        s.add(new CollectionPractice("aakansha",35,56,78));
        s.add(new CollectionPractice("Harshita",35,46,85));
        s.add(new CollectionPractice("Babita",45,66,75));
        s.add(new CollectionPractice("Anil",55,76,77));
        s.add(new CollectionPractice("anjali",65,46,67));

        for(CollectionPractice a:s){
            if(a.getname().startsWith("H")){
                System.out.println(a);
            }
        }
        Iterator<CollectionPractice>itr=s.iterator();
        while(itr.hasNext()){
            CollectionPractice a=itr.next();
            if(a.getname().startsWith("B")){
                itr.remove();
                System.out.println(a);
            }
        }
        for(CollectionPractice a:s){
            System.out.println(a);
    }
}
}
