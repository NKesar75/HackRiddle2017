package domain.hackathon.hackathon2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {
    private String urlbase = "http://api.petfinder.com/"; //base url
    private String urlkey = "key=58fe2e272bebddbc0f5e66901f239055"; //key for api
    private String urlmethodrandom = "pet.getRandom?"; //used for getting a random pet
    private String urlmethodfindmuiltplerecords = "pet.find"; //used for getting a random pet
    private String animaltype = "";
    private String size = "";
    private String breed = "";
    private String gender = "";
    private int offestformuiltplerecords = 0; //used to get more records if they want to keep looking
    private String urlargforpetrecord = "&output=basic"; //argumentpassedintoparmaert

    private String urlShelter = "http://api.petfinder.com/shelter.get?key=58fe2e272bebddbc0f5e66901f239055&id=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
