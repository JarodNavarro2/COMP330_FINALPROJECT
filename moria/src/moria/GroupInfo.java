/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

/**
 *
 * @author The_Master
 */
public class GroupInfo 
{
    private String professor, course, meeting_days, meeting_time, userID;
    
    public GroupInfo(String professor, String course, String meeting_days, String meeting_time, String userID)
    {
        this.professor = professor;
        this.course=course;
        this.meeting_days = meeting_days;
        this.meeting_time = meeting_time;
        this.userID = userID;
    }
    
    String getProfessor()
    {
        return professor;
    }
    String getCourse()
    {
        return course;
    }
    String getMeeting_days()
    {
        return meeting_days;
    }
    String getMeeting_time()
    {
        return meeting_time;
    }
    String getUserID()
    {
        return userID;
    }
}
