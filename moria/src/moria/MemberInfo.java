/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

public class MemberInfo
{
    public String firstName;
    public String lastName;
    public String userName;
    
    public MemberInfo(String first, String last, String user)
    {
        this.firstName = first;
        this.lastName = last;
        this.userName = user;
    }
    public String getFristName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
        
    }
    
    public String getUsername()
    {
        return this.userName;
    }
}
