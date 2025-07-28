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
        name = "getOsaka",
        query = "SELECT m FROM Osaka AS m ORDER BY m.id ASC"
    )
})
@Table(name = "osaka")
public class Osaka {
    @Id
    @Column(name = "id")    // ID (始発列車を"ID=1"として入力)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type", length = 30, nullable = true)
    private String type;    // 種別

    @Column(name = "time", nullable = false)
    private Time time;      // 発車時刻

    @Column(name = "destination", length = 30, nullable = true)
    private String destination; // 行先

    @Column(name = "track", nullable = true)
    private Integer track;      // 発車のりば

    @Column(name = "remark", length = 50, nullable = true)
    private String remark;      // 注釈１・・・列車切り離し案内

    @Column(name = "remark2", length = 50, nullable = true)
    private String remark2;     // 注釈２・・・誤乗車防止案内


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getTrack() {
        return track;
    }

    public void setTrack(Integer track) {
        this.track = track;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
}