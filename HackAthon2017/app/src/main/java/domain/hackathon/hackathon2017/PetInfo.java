package domain.hackathon.hackathon2017;

/**
 * Created by Raj Chandan on 11/11/2017.
 */

public class PetInfo
{
    private  String imageid;
    private String age;

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public PetInfo()
    {

    }

    public PetInfo(String imageid, String age)
    {
        this.imageid = imageid;
        this.age = age;
    }
}
