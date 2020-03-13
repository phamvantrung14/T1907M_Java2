package baiThi;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    ArrayList<addressBook> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public int showMenu(){
        System.out.println("=========MENU===============");
        System.out.println("1. Add new contact.");
        System.out.println("2. Find a contact by name.");
        System.out.println("3. Display contacts.");
        System.out.println("4. Exit.");
        System.out.println("============================");
        return sc.nextInt();
    }
    public void input(){
        addressBook bk = new addressBook();
        bk.inputData();
        list.add(bk);
        System.out.println("Thank you!!");
    }
    public void showData(){
        System.out.println("list address book:");
        if (list.isEmpty()){
            System.out.println("Not list");
        }
        for (int i=0;i<list.size();i++){
            addressBook get = list.get(i);
            System.out.println((i+1)+". "+get.toString());
        }
        System.out.println("-------------------");
    }
    public void findName(){
        if (list.isEmpty()){
            System.out.println("not list");
        }else {
            System.out.println("Enter Name:");
            String keyWorks = sc.nextLine();
            if (keyWorks.isEmpty()) {
                keyWorks = sc.nextLine();
            }
            boolean key = false;
            for (addressBook get : list) {
                if (get.contactName.equals(keyWorks)) {
                    get.toString();
                    key = true;
                }
            }
            if (key == false) {
                System.out.println("Not key word:" + keyWorks);
            }
        }
    }

    public static void main(String []args){
        int choose;
        MainClass main = new MainClass();
        do {
            choose = main.showMenu();
            switch (choose){
                case 1:
                    main.input();
                    break;
                case 2:
                    main.findName();
                    break;
                case 3:
                    main.showData();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true);
    }

}
