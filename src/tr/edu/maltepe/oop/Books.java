package tr.edu.maltepe.oop;

public class Books{

    private String shelfNo;
    private String name;
    private int id;

    public Books(String name, int id){
        this.name= name;
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShelfNo(String name, int id) {
        shelfNo = this.getName().substring(0,1) + id;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
