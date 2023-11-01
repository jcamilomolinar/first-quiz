package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements Drink, VendingMachine {
  public double CurrentMoney = 0;
  public String LastDrinkName;

  final double ScottColaPrice = 0.75;
  final double KarenTeaPrice = 1;

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  public void insertQuarter(){
    this.CurrentMoney = this.CurrentMoney + 0.25;
  }

  public String getName(){
    return this.LastDrinkName;
  }

  public boolean isFizzy(){
    if(this.getName().equals("ScottCola")) {
      return true;
    } else {
      return false;
    }
  }

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException{
    if (!(name.equals("ScottCola")||name.equals("KarenTea"))){
      throw new UnknownDrinkException();
    } else if ( (name.equals("ScottCola") && this.CurrentMoney < ScottColaPrice) || (name.equals("KarenTea") && this.CurrentMoney < KarenTeaPrice)) {
      throw  new NotEnoughMoneyException();
    } else {
      if (name.equals("ScottCola")){
        this.CurrentMoney = this.CurrentMoney - ScottColaPrice;
      } else {
        this.CurrentMoney = this.CurrentMoney - KarenTeaPrice;
      }
      this.LastDrinkName = name;
    }
    return this;
  }
}
