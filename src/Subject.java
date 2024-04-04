public class Subject {
    private String name;
    private String type;
    private int rate;
    public Subject(String name, String type, int rate){
        this.name=name;
        this.type=type;
        this.rate=rate;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
