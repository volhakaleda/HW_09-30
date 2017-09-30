public class Holiday {

    private String name;
    private int date;
    private String month;

    public Holiday(String name, int date, String month) {
        this.name = name;
        this.date = date;
        this.month = month;
    }

    public String getMonth () {
        return month;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }
}

