package it.unibo.collections.social.impl;

public class Bot extends UserImpl{
    private final int level;

    public Bot(String name, String username, String user, int level){
        super(name,username,user);
        this.level=level;
    }

    public int getLevel(){
        return this.level;
    }

    @Override
    public String toString(){
        return "[ " + super.getFirstName() + " " + super.getLastName() + " " + super.getAge() + " " + super.getUsername() + " "+this.level+"]";
        
    }
}
