public class DVD implements Spinnable {
    String name;
    int data;

    DVD(String name, int data) {
        this.name = setName(name);
        this.data = setData(data);
    }

    private String setName(String name) {
        if (name.length() > 1) {
            this.name = name;
        } else {
            System.exit(2);
        }
        return name;
    }

    private int setData(int data) {
        if (data >= 1970 && data <= 2023) {
            this.data = data;
        } else {
            System.exit(2);
        }
        return data;
    }

}