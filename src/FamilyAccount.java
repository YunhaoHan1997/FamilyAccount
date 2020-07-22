public class FamilyAccount {
    public static void main(String[] args){

        boolean isFlag = true;
        String details = "收支\t\t账户余额\t\t收支金额\t\t备\t注\n";//用于记录用户收入支出详情1
        int money = 0;
        int balance = 0;
        String infomation = "";

        while (isFlag){
            System.out.println("家庭收支");
            System.out.println(" 1，收支明细");
            System.out.println(" 2，登记收入");
            System.out.println(" 3，登记支出");
            System.out.println(" 4， 退出\n");
            System.out.print(" 请选择1-4输入: ");

            //获取用户选择
            char select = Utility.readMenuSelection();

            if (select == '1'){
                System.out.println(" 1，收支明细");
                System.out.println("-------------------------收支明细-------------------------");
                System.out.println(details);
                System.out.println("----------------------------------------------------------");

            }
            else if(select == '2'){
                System.out.println(" 2，登记收入");
                System.out.println("-------------------------登记收入-------------------------");
                System.out.print("	           请输入本次收入金额： ");
                money = Utility.readNumber();
                balance += money;
                System.out.print("	           请输入本次收入说明： ");
                infomation = Utility.readString();
                details += ("收入\t\t" + balance + "\t\t" + money + "\t\t" + infomation + "\n");
                System.out.println("----------------------------------------------------------");

            }
            else if(select =='3'){
                System.out.println(" 3，登记支出");
                System.out.println(" 2，登记支出");
                System.out.println("-------------------------登记支出-------------------------");
                System.out.print("	           请输入本次支出金额： ");
                money = Utility.readNumber();
                balance -= money;
                System.out.print("	           请输入本次支出说明： ");
                infomation = Utility.readString();
                details += ("收入\t\t" + balance + "\t\t" + -money + "\t\t" + infomation + "\n");
                System.out.println("----------------------------------------------------------");

            }
            else {
                System.out.print("使用Y/N来确认是否退出");
                char confirm = Utility.readConfirmSelection();
                if (confirm == 'N') continue;
                else isFlag = false;

            }
        }

    }
}
