package lesson7.exercise_2;

public enum City {
    CITY("Fairfield");
    private String city;
    City(String myCity){
        this.city=myCity;
    }
    public String city(){
        return this.city;
    }
}
