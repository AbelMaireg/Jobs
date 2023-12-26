package accounts;
import enums.profession;

import java.util.ArrayList;

public class User extends account{
    private int id;
    private profession jobType;
    private int experience;

    public ArrayList lookForEmployers(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public profession getJobType() {
        return jobType;
    }

    public void setJobType(profession jobType) {
        this.jobType = jobType;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
