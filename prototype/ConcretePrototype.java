package prototype;

public class ConcretePrototype implements Prototype{
    private int id;

    public ConcretePrototype(int id){
        this.id = id; // copy members >> deep copy
    }

    @Override
    public Prototype clone(){
        return new ConcretePrototype(id);   // generate new instance
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
