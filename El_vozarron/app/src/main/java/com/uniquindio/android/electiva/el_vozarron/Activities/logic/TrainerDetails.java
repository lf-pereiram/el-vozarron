package com.uniquindio.android.electiva.el_vozarron.Activities.logic;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Trainer;
import com.uniquindio.android.electiva.el_vozarron.R;

import org.w3c.dom.Text;

public class TrainerDetails extends Activity implements View.OnClickListener {
    private TextView textNext1;
    private TextView textPreviou;
    private ImageView  imagen;// 1: Adele, 2:Rihanna, 3: Madonna
    private int current;
    private TextView biographyText;
    private TextView generText;
    private TextView nameText;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_details);
        setCurrent(1);
        textNext1 = (TextView) findViewById(R.id.TexViewNext);
        textNext1.setOnClickListener(this);

        textPreviou = (TextView) findViewById(R.id.textViewPrevious);
        textPreviou.setOnClickListener(this);


        imagen=(ImageView) findViewById(R.id.imageView3);
        biographyText=(TextView) findViewById(R.id.textView15Biography);

        generText=(TextView) findViewById(R.id.textView17Genero);
        nameText=(TextView) findViewById(R.id.textView14NombreTrainer);

        nameText.setText("Adele");
       generText.setText("Generes: Soul pop blue-eyed soul and R&B ");
        biographyText.setText("Adele was born in North London, England, on May 5, 1988, " +
                "eventually attending the performing arts BRIT School. Her first two albums," +
                " 19 and 21, earned her critical praise and a level of commercial success " +
                "unsurpassed among her peers, with the artist selling millions of albums " +
                "worldwide and winning multiple Grammys. She also received a songwriting" +
                " Oscar for the James Bond track \"Skyfall.\" After becoming a mom, Adele" +
                " returned to the charts in autumn 2015 with the ballad \"Hello,\" the lead " +
                "single for her forthcoming album 25.");


    }

    @Override
    public void onClick(View v) {

        if( textNext1.getId() == v.getId()){
            //Ejecutar tarea 1
            if(getCurrent()==1){

                nameText.setText("Rihanna");
                imagen.setImageResource(R.drawable.rihanna);
                generText.setText("Generes: Pop, R&B, reggae, dancehall, hip hop and  dance");
                biographyText.setText("Robyn Rihanna Fenty (/riˈænə/;[2] born February 20, 1988)" +
                        " is a Barbadian singer and songwriter. Born in Saint Michael and raised" +
                        " in Bridgetown, she first entered the music industry by recording demo " +
                        "tapes under the direction of record producer Evan Rogers in 2003." +
                        " She ultimately signed a recording contract with Def Jam Recordings" +
                        " after auditioning for its then-president, hip hop producer and rapper " +
                        "Jay Z. In 2005, Rihanna rose to fame with the release of her debut studio " +
                        "album Music of the Sun and its follow-up A Girl like Me (2006), which charted" +
                        " on the top 10 of the U.S. Billboard 200 and respectively produced the hit" +
                        " singles \"Pon de Replay\" and \"SOS\".");




                setCurrent(2);
            }else{
                if(getCurrent()==2){
                    imagen.setImageResource(R.drawable.madonna);

                    nameText.setText("Madonna");
                    generText.setText("Generes: Pop, dance, electronic and rock");
                    biographyText.setText("RMadonna Louise Ciccone (/tʃɪˈkoʊni/; born August 16, 1958) " +
                            "is an American singer, songwriter, dancer, actress, and businesswoman. " +
                            "She achieved popularity by pushing the boundaries of lyrical content in " +
                            "mainstream popular music and imagery in her music videos, which became " +
                            "a fixture on MTV. Madonna is known for reinventing both her music and image, " +
                            "and for maintaining her autonomy within the recording industry. Music critics" +
                            " have acclaimed her musical productions, which have generated some controversy." +
                            " Referred to as the \"Queen of Pop\", Madonna is often cited as an influence by " +
                            "other artists.");

                    setCurrent(3);
                }
                else{
                    if(getCurrent()==3){
                        imagen.setImageResource(R.drawable.adele);

                        nameText.setText("Adele");
                        generText.setText("Generes: Soul pop blue-eyed soul and R&B");
                        biographyText.setText("Adele was born in North London, England, on May 5, 1988," +
                                " eventually attending the performing arts BRIT School. Her first two " +
                                "albums, 19 and 21, earned her critical praise and a level of commercial " +
                                "success unsurpassed among her peers, with the artist selling millions of" +
                                " albums worldwide and winning multiple Grammys. She also received a songwriting " +
                                "Oscar for the James Bond track \"Skyfall.\" After becoming a mom, Adele returned" +
                                " to the charts in autumn 2015 with the ballad \"Hello,\" the lead single for her " +
                                "forthcoming album 25.");


                        setCurrent(1);
                    }
                }
            }




        }
        if( textPreviou.getId() == v.getId()){
            //Ejecutar tarea 1
            //Ejecutar tarea 1
            if(getCurrent()==1){
                imagen.setImageResource(R.drawable.madonna);

                nameText.setText("Madonna");
                generText.setText("Generes: Pop, dance, electronic, and rock");
                biographyText.setText("Madonna Louise Ciccone (/tʃɪˈkoʊni/; born August 16, 1958) " +
                        "is an American singer, songwriter, dancer, actress, and businesswoman. " +
                        "She achieved popularity by pushing the boundaries of lyrical content in " +
                        "mainstream popular music and imagery in her music videos, which became " +
                        "a fixture on MTV. Madonna is known for reinventing both her music and image, " +
                        "and for maintaining her autonomy within the recording industry. Music critics" +
                        " have acclaimed her musical productions, which have generated some controversy." +
                        " Referred to as the \"Queen of Pop\", Madonna is often cited as an influence by " +
                        "other artists.");

                setCurrent(3);
            }else{
                if(getCurrent()==3){
                    imagen.setImageResource(R.drawable.rihanna);

                    nameText.setText("Rihanna");
                    generText.setText("Generes: Pop, R&B, reggae, dancehall, hip hop and  dance");
                    biographyText.setText("Robyn Rihanna Fenty (/riˈænə/;[2] born February 20, 1988)" +
                            " is a Barbadian singer and songwriter. Born in Saint Michael and raised" +
                            " in Bridgetown, she first entered the music industry by recording demo " +
                            "tapes under the direction of record producer Evan Rogers in 2003." +
                            " She ultimately signed a recording contract with Def Jam Recordings" +
                            " after auditioning for its then-president, hip hop producer and rapper " +
                            "Jay Z. In 2005, Rihanna rose to fame with the release of her debut studio " +
                            "album Music of the Sun and its follow-up A Girl like Me (2006), which charted" +
                            " on the top 10 of the U.S. Billboard 200 and respectively produced the hit" +
                            " singles \"Pon de Replay\" and \"SOS\".");
                    setCurrent(2);
                }
                else{
                    if(getCurrent()==2){
                        imagen.setImageResource(R.drawable.adele);


                        nameText.setText("Adele");
                        generText.setText("Generes: Soul pop blue-eyed soul and R&B ");
                        biographyText.setText("Adele was born in North London, England, on May 5, 1988, " +
                                "eventually attending the performing arts BRIT School. Her first two albums," +
                                " 19 and 21, earned her critical praise and a level of commercial success " +
                                "unsurpassed among her peers, with the artist selling millions of albums " +
                                "worldwide and winning multiple Grammys. She also received a songwriting" +
                                " Oscar for the James Bond track \"Skyfall.\" After becoming a mom, Adele" +
                                " returned to the charts in autumn 2015 with the ballad \"Hello,\" the lead " +
                                "single for her forthcoming album 25.");
                        setCurrent(1);
                    }
                }
            }


        }

    }
}
