package me.marichely.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by stjep on 16/09/2017.
 */
@Entity
@Table(name = "Joke")
public class Joke {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "content", nullable = false, length = 255)
    private String content;
    @Basic
    @Column(name = "likes", nullable = true , columnDefinition = "int default 0")
    private Integer likes = 0;
    @Basic
    @Column(name = "dislikes", nullable = true, columnDefinition = "int default 0")
    private Integer dislikes = 0;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="category", nullable = false)
    @JsonIgnore
    private Category category;

    public Joke(){};

    /*public Joke(String content,Category category){
        this.content= content;
        this.category = category;
    };*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }


    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer difference(){
        return this.likes-this.dislikes;
    }




    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }


    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }




}
