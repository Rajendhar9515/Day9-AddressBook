package com.bridgelabz.addressbook;

public class AddressBook {
    public static void main(String[] args) {
        int choice,i=0;
        final Helper help = new Helper();
        while(i==0)
        {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Display Records     ");
            System.out.println("3: Edit Contact		   ");
            System.out.println("4: Delete Contact	   ");
            System.out.println("5: Exit		       \n");
			System.out.println(" -----------------------");
            System.out.println("--- Enter Your Choice ---");
            choice = InputUtil.getIntValue();
            switch(choice)
            {
                case 1 :
                    help.addRecord();
                    break;
                case 2 :
                    help.displayRecord();
                    break;
                case 3 :
    		    help.editRecord();
    		    break;
                case 4:
    		    help.deleteRecord();
    		    break;
                case 5 :
                    i=1;
                    break;
                default :
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}
