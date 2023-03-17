package backend.domain;

import javax.persistence.*;

@Entity
public class GameScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String score;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
