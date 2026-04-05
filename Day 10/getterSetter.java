class Name{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class getterSetter{
    public static void main(String[] args) {
        Name n = new Name();
        n.setName("Lingeshraj");
        System.out.println(n.getName());
    }
}