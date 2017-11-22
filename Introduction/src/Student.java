/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prkmitl
 */
public class Student 
{
    String name;
    int     Age;
    
    public void setData() 
    {
        name = "JAVA";
        Age = 20;
    }
    public void getData()
    {
        System.out.println("ชื่อ: " +name);
        System.out.println("อายุ: " +Age);
    }
}

