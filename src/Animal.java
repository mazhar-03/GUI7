public class Animal {
    String name;
    int weight;
    int height;
    int topSpeed;
    public Animal(String name, int weight, int height, int topSpeed){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.topSpeed = topSpeed;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Name: " + name + "\tHeight: " + height;
    }
}
