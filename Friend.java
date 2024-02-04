/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Lenovo
 */
class Friend {
private String name,dob;
private int id;
    Friend(int id, String name, String dob) {
        this.id=id;
        this.name=name;
        this.dob=dob;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getdob()
    {
        return dob;
    }
}
