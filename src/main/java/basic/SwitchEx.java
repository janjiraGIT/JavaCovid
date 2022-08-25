package basic;

public class SwitchEx {
    public void Run(EnumEx day) {
        int money = 0;
        switch(day) {
            case MONDAY:
                money += 100;
                System.out.println("You work on Monday and you will earn :" + money );
                break;
            case TUESDAY:
                money += 150;
                System.out.println("You work on Tuesday and you will earn :" + money );
                break;
            case WEDNESDAY:
                money += 60;
                System.out.println("You work on Wednesday and you will earn :" + money );
                break;
            case THURSDAY:
                money += 300;
                System.out.println("You work on Thuesday and you will earn :" + money );
                break;
            case FRIDAY:
                money += 500;
                System.out.println("You work on Friday and you will earn :" + money );
                break;
            case SATURDAY:
                money += 1700;
                System.out.println("You work on SATURDAY and you will earn :" + money );
                break;
            case SUNDAY:
                money += 3000;
                System.out.println("You work on Sunday and you will earn :" + money );
                break;
        }
    }
}
