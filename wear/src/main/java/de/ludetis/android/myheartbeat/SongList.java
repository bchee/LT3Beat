package de.ludetis.android.myheartbeat;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.TextView;

import java.util.Random;

public class SongList extends Activity {

    private TextView mTextView;
    public String[] musicArray = new String[] {"At Last - Megashira", "21 Questions - 50 Cent", "Ain't Nothin' but a She Thang - Salt 'N' Pepa", "Alive - Beastie Boys", "Drive Me Home - The Reason", "All About Soul - Billy Joel", "4 Minutes - Madonna", "Are You Ready For Love - Elton John", "A Little Love - Corey Hart", "Acperience - Hardfloor", "A Million Days - Big Wreck", "All Over You - Live", "A Fine Day - Kirsty Hawkshaw", "Continental Drift - The Rolling Stones", "All I Ever Wanted - Basshunter", "Free Bird - Lynyrd Skynyrd", "Been Away Too Long - Soundgarden", "Make It Easy - Yes", "Bad Boy - The Backbeat Band", "Can't Take It Anymore - David Wilcox", "Breathless - Jerry Lee Lewis"};
    public Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView.setText(returnMusicTitle());
            }
        });
    }

    public String returnMusicTitle()
    {
        return musicArray[0];
    }
}
