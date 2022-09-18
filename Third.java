import java.util.NoSuchElementException;
import java.util.Scanner;
//author kunal nagwanshi
public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = {"kunal", "nagwanshi", "lemon", "orange", "banana", "mango", "china", "usa", "russia", "delhi", "mumbai", "bangalore", "quantum", "bhopal", "agartala"};
        int []ttp = {0};
        int [] bkpt ={35,0};
        int []plr = {69,34,0};
        int []vlpd = {109,74,40,0};
        int []mpl = {130,95,61,21,0};
        int []mkcv = {172,137,103,63,42,0};
        int []kdri = {214,179,145,105,84,42,0};
        int []mdgb = {247,213,179,139,118,76,34,0};
        int []bipl = {281,246,213,173,152,110,68,34,0};
        int []atp =  {309,275,241,201,180,138,96,62,29,0};


        int []ttp1 = {0};       //0
        int [] bkpt2 ={36,0};   //1
        int []plr3 = {67,36,0};  //2
        int []vlpd4 = {110,73,41,0}; //3
        int []mpl5 = {131,94,62,22,0};//4
        int []mkcv6 = {173,138,104,64,43,0};//5
        int []kdri7 = {215,180,146,106,85,43,0};//6
        int []mdgb8 = {248,214,180,140,119,75,35,0};//7
        int []bipl9 = {282,245,214,174,153,111,69,35,0};//8

        int []ttp11 = {0};
        int [] bkpt22 ={7,0};
        int []plr33 = {68,37,0};
        int []vlpd44 = {111,74,42,0};
        int []mpl55 = {132,95,63,23,0};
        int []mkcv66 = {174,139,105,65,44,0};

        int [][][] stage = {{ttp,bkpt,plr,vlpd,mpl,mkcv,kdri,mdgb,bipl,atp},{ttp1,bkpt2,plr3,vlpd4,mpl5,mkcv6,kdri7,mdgb8,bipl9},{ttp11,bkpt22,plr33,vlpd44,mpl55,mkcv66}};
        System.out.println("select the station ");

        int station = in.nextInt();
        int ent;

     while(station<=3) {
         while (true) {

             System.out.println("enter the starting point  ");
             int st=in.nextInt();
           if(station==0) {
               if (st > 11) {
                   System.out.println("0 enter the valid input");
                   break;
               } else {
                   if (st >= 0 && st < 10) {
                       System.out.println("enter the second station");
                       ent = in.nextInt();
                       int amount = stage[0][ent][st];
                       System.out.println("enter the number of person");
                       int person = in.nextInt();
                       System.out.println("enter the number of kids\r\n if kids equals to 0 to give 0");
                       int kids = in.nextInt();

                       int finalAmount = person*amount+(kids*amount/2);
                       System.out.println("total person = "+person+ "\r\ntotal kids = "+kids +"\r\nyour fare is: "+finalAmount);

                       break;
                   }
                   else{
                       System.out.println("enter the right input");
                       break;
                   }


               }
           }
             if(station==1) {
                 if (st > 9) {
                     System.out.println("1 enter the valid input");
                     break;
                 } else {
                     if (st >= 0 && st < 7) {
                         System.out.println("enter the second station");
                         ent = in.nextInt();
                         int amount = stage[0][ent][st];
                         System.out.println("enter the number of person");
                         int person = in.nextInt();
                         System.out.println("enter the number of kids\r\n if kids equals to 0 to give 0");
                         int kids = in.nextInt();

                         int finalAmount = person*amount+kids*amount;
                         System.out.println("total person = "+person+ "\r\ntotal kids = "+kids +"\r\nyou fare is: "+finalAmount);

                         break;
                     }
                     else{
                         System.out.println("enter the right input");
                         break;
                     }

                 }
             }
             if(station==2) {
                 if (st > 7) {
                     System.out.println("2 enter the valid input");
                     break;
                 } else {
                     if (st >= 0 && st < 7) {
                         System.out.println("enter the second station");
                         ent = in.nextInt();
                         int amount = stage[0][ent][st];
                         System.out.println("enter the number of person");
                         int person = in.nextInt();
                         System.out.println("enter the number of kids\r\n if kids equals to 0 to give 0");
                         int kids = in.nextInt();

                         int finalAmount = person*amount+kids*amount;
                         System.out.println("total person = "+person+ "\r\ntotal kids = "+kids +"\r\nyou fare is: "+finalAmount);
                         break;
                     }
                     else{
                         System.out.println("enter the right input");
                         break;
                     }

                 }
             }
          break;
         }

     }

        System.out.println(arr.length);

        System.out.println("enter the num ");
        //String s = "x";
         String input = in.next();
        int num = -1;
        try {
            while (in.hasNext()) {
                if (input.equals("w")) {
                    num++;
                } else if (input.equals("x")) {
                    num--;
                } else if(input.equals("!")){
                    System.exit(0);
                }
                if (num < 0) {
                    System.out.println("no negative value please ");
                    input = in.next();
                } else if (num > 11) {

                    System.out.println("out of limit ");
                    input = in.next();
                } else if (num > 0) {
                    for (int i = num; i < arr.length - 11 + num; i++) {
                        System.out.println(arr[i] + " ");
                    }
                    input = in.next();

                }
            }


        }
        catch (NoSuchElementException e){
            System.out.println(e +"in valid entry please give the right input and integer value");
        }
        catch (ArrayIndexOutOfBoundsException r){
            System.out.println(r+" array out of index ");
        }

    }

}
