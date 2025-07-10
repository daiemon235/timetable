package models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@NamedQueries({
    @NamedQuery(
        name = "getTokyo",
        query = "SELECT m FROM Tokyo AS m ORDER BY m.id ASC"
    )
})
@Table(name = "tokyo")
public class Tokyo {
    @Id
    @Column(name = "id")    // ID (始発列車を"ID=1"として入力)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "time", nullable = false)
    private Time time;      // 発車時刻

    @Column(name = "destination", length = 30, nullable = true)
    private String destination; // 行先

    @Column(name = "track", length = 10, nullable = true)
    private String track;   // 発車番線


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
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