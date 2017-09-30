public class Movie {

    private String title;
    private String studio;
    private String rating;
    private Holiday holiday;

    public Movie(String title, String studio, String rating, Holiday holiday) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
        this.holiday = holiday;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG13";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                ", holiday='" + holiday.getMonth() + '\'' +
                ", holiday='" + holiday.getName() + '\'' +
                ", holiday='" + holiday.getDate() + '\'' +
                '}';
    }
}

