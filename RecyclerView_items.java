package com.example.recyclerview;

public class Items {
    String name;
    String Description;
    String image;

    public Items(){
    }
    public Items(String name, String description,String image)
    {
        this.name=name;
        Description=description;
        this.image=image;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public String getDescription()
    {
        return Description;
    }
    public void setDescription(String description)
    {
        this.Description=description;
    }

    public String getImage()
    {
        return image;
    }
    public void setImage(String image)
    {
        this.image=image;
    }


}
