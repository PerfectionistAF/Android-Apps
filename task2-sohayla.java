package a;

public class Main {
    public static void main(String[] args) {
        Cat lion1 = new Cat(4, "long");
        Dog german_shep1 = new Dog("droopy", "hunting");

        System.out.printf("Cat: lion1\nno of claws: %d, whisker type: %s\n", lion1.getNoOfClaws(), lion1.getWhiskerType());
        System.out.printf("Dog: german_shep1\npurpose: %s, ear type: %s\n", german_shep1.getPurpose(), german_shep1.getEars());

    }
}

package a;

public class ZooAnimal{
    protected static int fed = 0;

    public ZooAnimal(){
        this.fed++;
    }
}


package a;


public class Dog extends ZooAnimal{
    private String ear_type;
    private String purpose;

    public Dog(String e, String p){
        ear_type = e;
        purpose = p;
    }
    //getter setter
    public void setEars(String m){
        ear_type = m;
    }
    public void setPurpose(String y){
        purpose = y;
    }
    public String getEars(){
        return this.ear_type;
    }
    public String getPurpose(){
        return this.purpose;
    }

    public void meow(){
        System.out.println("meow");
    }
    public void bark(){
        System.out.println("bark");
    }
}

package a;

public class Cat extends ZooAnimal{
    private int no_of_claws;
    private String whisker_type;

    public Cat(int c, String w){
        no_of_claws = c;
        whisker_type = w;
    }
    //getter setter

    public void setNoOfClaws(int n){
        no_of_claws = n;
    }
    public void setWhiskerType(String x){
        whisker_type = x;
    }
    public int getNoOfClaws(){
        return this.no_of_claws;
    }
    public String getWhiskerType(){
        return this.whisker_type;
    }

    public void meow(){
        System.out.println("meow");
    }

}



