package com.company;
import java.util.ArrayList;
public class Bank {
    /*变量：用户帐号组(group)、用户序号(countId)、当前操作帐户(bankCount)
    方法：开户(public void openCount(BankCount))、
          进帐(public void moneyIn(int countId,double money))、
          出帐(public void moneyOut(int countId,double money))、
          查询(public void queryBalance(int countId))
    */
    ArrayList group = new ArrayList();
    static int countId = 0;
    BankCount bankCount;
    public void openCount(BankCount bankCount){
        countId++;
        group.add(bankCount);
    }

    public void moneyIn(int countId,double money){
        bankCount = (BankCount)group.get(countId);
        bankCount.saveMoney(money);
        System.out.println(bankCount.name + "存款" + money + "成功！");
        System.out.println(bankCount.name + "的帐户余额是" + bankCount.balance);
    }
    public void moneyOut(int countId,double money){
        bankCount = (BankCount)group.get(countId);
        boolean flag = bankCount.getMoney(money);
        if(flag){
            System.out.println(bankCount.name + "取款" + money + "成功！");
            System.out.println(bankCount.name + "的帐户余额是" + bankCount.balance);
        }else
            System.out.println("余额不足！" + money);
    }

    public void queryBalance(int countId){
        bankCount = (BankCount)group.get(countId);
        System.out.println(bankCount.name + "的帐户余额是" + bankCount.balance);
    }
}
