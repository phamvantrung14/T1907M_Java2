package Assignment3;

import java.util.ArrayList;

public class PersonModel {
    ArrayList<PersonModel> person = new ArrayList();
    public void addPerson(PersonModel pm){

        person.add(pm);
    }
    public void showsInfo(){
        System.out.println("list person:");
        for (PersonModel p: person){
            p.toString();
        }
    }
    public static void main(String [] args){
        Student st = new Student();

    }

}
