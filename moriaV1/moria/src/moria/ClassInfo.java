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
public class ClassInfo 
{
    private String professor, course, meeting_days, meeting_time;
    
    public ClassInfo(String professor, String course, String meeting_days, String meeting_time)
    {
        this.professor=professor;
        this.course=course;
        this.meeting_days=meeting_days;
        this.meeting_time=meeting_time;
    }
    public String getProfessor()
    {
        return professor;
    }
    public String getCourse()
    {
        return course;
    }
    public String getMeeting_days()
    {
        return meeting_days;
    }
    public String getMeeting_time()
    {
        return meeting_time;
    }
}
