public class FamilyAccount {
    public static void main(String[] args){

        boolean isFlag = true;


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

            }
            else if(select == '2'){
                System.out.println(" 2，登记收入");


            }
            else if(select =='3'){
                System.out.println(" 3，登记支出");

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
