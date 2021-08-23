public class Planet {

    private String name;
    private Integer size;

    public Planet(String name, Integer size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public Integer getSize(){
        return this.size;
    }

    public String explode(){
        return String.format("Boom! %s has exploded! It was %s in size!", this.name, this.size);
    }

    public void setName(String name){
        this.name = name;
    }
}