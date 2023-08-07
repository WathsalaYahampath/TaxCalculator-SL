package com.company;

public class Main {

    public static void main(String[] args) {
        int x=Menu.showFirstMenu();
        switch (x) {
            case 1 :
                int y= Menu.WithholdingMenu();
                switch (y) {
                    case 1:
                        Menu.RentTaxMenu();
                    case 2:
                        Menu.BankInterestTaxMenu();
                    case 3:
                        Menu.DivindendTaxMenu();
                }
            case 2 :
                Menu.PayableTaxMenu();
            case 3 :
                Menu.IncomeTaxMenu();
            case 4 :
                Menu.SSCLTaxMenu();
            case 5 :
                int a= Menu.LeasingMenu();
                switch (a) {
                    case 1:
                       // Menu.CalculateLeasig();
                    case 2:
                       // Menu.SearchLeasingCategory();
                    case 3:
                       // Menu.FindLeasingAmount();
                    case 4 :
                       // Menu.Exit();
                }
        }
    }
}
