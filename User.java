/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase3_softwareengineering1;

/**
 *
 * @author hp
 */
public class User {
    private String Name;
    private String Email;
    private String Password;
    private int Phone;
    private float Age;
    void setName(String n)
    {
        Name=n;
    }
    String getName()
    {
        return Name;
    }
    void setEmail(String E)
    {
        Email=E;
    }
    String getEmail()
    {
        return Email;
    }
    void setPhone(int P)
    {
        Phone=P;
    }
    int getPhone()
    {
        return Phone;
    }
    void setAge(float A)
    {
        Age=A;
    }
    float getAge()
    {
        return Age;
    }
    void setPassword(String P)
    {
        Password=P;
    }
    String getPassword()
    {
        return Password;
    }
}
