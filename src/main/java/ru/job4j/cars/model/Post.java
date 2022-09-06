package ru.job4j.cars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cars_post")
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private String text;

    private Timestamp created;

    private Integer autoUserId;

    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Integer getAutoUserId() {
        return autoUserId;
    }

    public void setAutoUserId(Integer autoUserId) {
        this.autoUserId = autoUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Post)) {
            return false;
        }
        Post post = (Post) o;
        return Objects.equals(id, post.id)
                && Objects.equals(text, post.text)
                && Objects.equals(autoUserId, post.autoUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, autoUserId);
    }

    @Override
    public String toString() {
        return "Post{"
                + "id="
                + id
                + ", text='"
                + text
                + '\''
                + ", created="
                + created
                + ", autoUserId="
                + autoUserId
                + '}';
    }
}
