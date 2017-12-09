/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

/**
 *
 * @author Jarod Navarro
 */
public class WorkInfo 
{
    String name;
    String meeting_days;
    String meeting_time;
    String reason;
    
    public WorkInfo(String name, String meeting_days, String meeting_time, String reason)
    {
        this.name = name;
        this.meeting_days = meeting_days;
        this.meeting_time = meeting_time;
        this.reason = reason;
                
    }
    public String getName()
    {
        return name;
    }
    public String getMeeting_days()
    {
        return meeting_days;
    }
    public String getMeeting_Time()
    {
        return meeting_time;
    }
    public String getReason()
    {
        return reason;
    }
}
