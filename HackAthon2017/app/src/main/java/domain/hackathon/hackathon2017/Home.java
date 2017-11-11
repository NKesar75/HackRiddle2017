package domain.hackathon.hackathon2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {
    private String urlbase = "http://api.petfinder.com/";
    private String urlmethod = "pet.getRandom?";
    private String urlkey = "key=58fe2e272bebddbc0f5e66901f239055";
    private String urlarg = "&output=basic";
    private String urlShelter = "http://api.petfinder.com/shelter.get?key=58fe2e272bebddbc0f5e66901f239055&id=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
