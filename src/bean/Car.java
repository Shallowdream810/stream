package bean;

/**
 * @author ghh
 * @Description:
 * @date Created on 2020/4/10
 */
public class Car {
    private Integer id;
    private String name;
    private String color;

    public Car(Integer id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
    }
}
