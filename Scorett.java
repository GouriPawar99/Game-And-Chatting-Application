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
class Scorett {
    private String f,s;
private int no;
    Scorett(int no, String f, String s) {
        this.no=no;
        this.f=f;
        this.s=s;
    }
    public int getgame_no()
    {
        return no;
    }
    public String getfirst()
    {
        return f;
    }
    public String getsecond()
    {
        return s;
    }
    
}
