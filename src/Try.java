interface Some{
    abstract public void printSomething();
}

public class Try extends TryAnon implements Some{
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printSomething(){
        System.out.print("implemented");
    }
}
