package com.company;
    public class Test {
        public static void main(String args[]) {
	/*（1） main方法中创建一个Bank对象bank，再创建两个BankCount对象bankCount1和bankCount2,调用bank对象的openCount()方法，将bankCount1和bankCount2加入用户帐号组group。
	（2）将两个帐户各存入500元，再将第一个帐户取出600元，第二个帐户继续存入350元。
    （3）查询两个帐户的余额。
*/
            Bank bank=new Bank();
            BankCount bankCount1=new BankCount();
            BankCount bankCount2=new BankCount();
            bankCount1.name="张三";
            bankCount2.name="李四";
            bank.openCount(bankCount1);
            bank.openCount(bankCount2);
            bankCount1.balance=10.0;
            bankCount2.balance=0.0;
            bankCount1.saveMoney(500);
            bankCount2.saveMoney(500);
            bankCount1.getMoney(600);
            bankCount2.saveMoney(350);
            bank.queryBalance(0);
            bank.queryBalance(1);
        }
}

