package com.company;
public class BankCount {
    /*变量：账号(id)、储户姓名(name)、开户时间(openTime)、存款余额(balance)
    方法：构造方法、
            存款(public void saveMoney(double money))、
            取款(public boolean getMoney(double money),取款额低于余额时取款成功，返回值是取款是否成功)
        */
    int id;
    String name;
    String openTime;
    double balance;
    double money;

    public void BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void saveMoney(double money) {
        System.out.println("存入金额" + money);
        balance += money;
    }

    public boolean getMoney(double money) {
        if (balance > money) {
            balance -= money;
            System.out.println("取款成功");
        } else {
            System.out.println("取款不成功");
        }
        return false;
    }
}



