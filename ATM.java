// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class ATM {
   float Balance;

   ATM() {
   }

   public void checkPin() {
      System.out.println("Enter your pin");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 == 1234) {
         System.out.println("Welcome to our Bank");
         this.menu();
      } else {
         System.out.println("Enter a valid option");
         this.checkPin();
      }

   }

   public void menu() {
      System.out.println("1 for DepositCash");
      System.out.println("2 for WithDraw");
      System.out.println("3 for CheckBalance");
      System.out.println("4 for Exit");
      System.out.println("Enter your option");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 == 1) {
         this.depositCash();
      } else if (var2 == 2) {
         this.withDraw();
      } else if (var2 == 3) {
         this.CheckBalance();
      } else if (var2 == 4) {
         this.exit();
      }

   }

   public void depositCash() {
      System.out.println("Enter the amount you want to deposit");
      Scanner var1 = new Scanner(System.in);
      this.Balance = (float)var1.nextInt();
      System.out.println("Your new account balance is " + this.Balance);
      this.menu();
   }

   public void withDraw() {
      System.out.println("Enter the amount you want to Withdraw");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if ((float)var2 > this.Balance) {
         System.out.println("Sorry! you have insufficient balance");
         System.out.println("Enter less amount");
         this.menu();
      } else if ((float)var2 <= this.Balance) {
         Float var3 = this.Balance - (float)var2;
         System.out.println("Your withDraw amount is " + var2);
         System.out.println("Your account balance is " + var3);
      }

   }

   public void CheckBalance() {
      System.out.println("Your account balance is " + this.Balance);
   }

   public void exit() {
   }
}
