public class Tornado implements Spinnable{
    String name;
    int data;

    Tornado(String name, int data) {
        this.name = setName(name);
        this.data = setData(data);
    }

    private String setName(String name) {
        if (name.length() > 1) {
            this.name = name;
        } else {
            System.exit(5);
        }
        return name;
    }

    private int setData(int data) {
        if (data >= 1970 && data <= 2023) {
            this.data = data;
        } else {
            System.exit(6);
        }
        return data;
    }
}
