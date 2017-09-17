package me.marichely.form;

/**
 * Created by stjep on 16/09/2017.
 */
public class NewJoke {
    private String content;
    private Integer category;

    public NewJoke(){};

    public NewJoke(String content,Integer category){
        this.content=content;
        this.category= category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCategory() {

        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
