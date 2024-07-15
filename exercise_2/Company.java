package lesson7.exercise_2;

public enum Company {
    COMPANY("Microsoft");

    String company;
  Company(String companyName){
      company = companyName;
  }
  public String company(){
      return company;
  }
}


