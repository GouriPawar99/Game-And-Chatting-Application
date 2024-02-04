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
class l {
    private String f,s,t,fo;
private int no;
   l(int no, String f, String s,String t,String fo) {
        this.no=no;
        this.f=f;
        this.s=s;
        this.t=t;
        this.fo=fo;
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
     public String getthird()
    {
        return t;
    }
    public String getfourth()
    {
        return fo;
    }
}
