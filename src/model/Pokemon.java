package model;

public class Pokemon {

    private String name;
    private String category;
    private String desc;
    private String type;


    public Pokemon(){

    }

    public Pokemon(String name, String category, String type, String desc){
        this.name = name;
        this.category = category;
        this.desc = desc;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
