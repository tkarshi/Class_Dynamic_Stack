public class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId(){
        return id;   
    }

    public String getName(){
        return name;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "id: " + this.id + ", Name: " + this.name;
    }
}
