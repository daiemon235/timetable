package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tokyo")
public class Tokyo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Float id;

    @Column(name = "hour", length = 10, nullable = false)
    private int hour;

    @Column(name = "min", length = 10, nullable = false)
    private int min;

    @Column(name = "destination", length = 30, nullable = true)
    private String destination;

    @Column(name = "track", length = 10, nullable = true)
    private String track;


    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.hour = min;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }


}