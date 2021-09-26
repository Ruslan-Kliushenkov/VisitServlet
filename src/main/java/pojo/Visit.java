package pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Visit implements Comparable<Visit>{
    private String name;
    private String date;
    private String city;

    public Visit(String name, String date, String city) {
        this.name = name;
        this.date = date;
        this.city = city;
    }

    @Override
    public int compareTo(Visit o) {
        return 0;
    }
}
