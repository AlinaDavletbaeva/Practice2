public class Ball {
    //заготовка абстрактного мяча
    private String type; //тип мяча
    private float radius; //всегда с маленькой буквы
    private String color; //цвет

    public String toString() {
        String s = "Тип мяча: " + type + "\n" + "Радиус мяча: " + radius + "\n" + "Цвет мяча: " + color;  //конкретинация строчек - объединение
        return s;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getRadius() {

        return radius;
    }

    public void setRadius(float radius){
        this.radius=radius;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}
