package lösungen.t3;

import javax.swing.plaf.PanelUI;

public class Month {
    private final int month;

    public Month(int m) {
        month = m;
    }

    public static void main(String[] args) {
        Month month = new Month(0);
        System.out.println(month.checkMonth(month.translateNumber(month.month)));
        System.out.println(month.isRMonth());
    }

        public boolean isRMonth(){
        if(checkMonth(translateNumber(this.month)).contains("r")){
            return true;
        }else return false;
        }

    public String checkMonth(int month) {
        switch (month) {
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "März";
            case 4:
                return "April";
            case 5:
                return "Mai";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "August";
            case 9:
                return "september";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Dezember";
            default:
                return "";
        }
    }
    int translateNumber(int number) {
        int counter = 0;
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                if (counter >= 12) {
                    counter = 1;
                } else counter++;
            }
        }
        else {
            if (number < 1){
                return translateNumber(number + 12);

            }
                }
        return counter;
    }

}

