package jp.ac.it_college.std.s13005.androidchallenge;

import android.app.Activity;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            final Button button = (Button) rootView.findViewById(R.id.start_button);
            button.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                    DifficultyFragment fragment = DifficultyFragment.newInstance();
                    FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                    transaction.replace(R.id.start_fragment, fragment);
                    transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                    transaction.commit();
                    button.setVisibility(View.INVISIBLE);
                }
            });

            return rootView;

        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            new AlertDialog.Builder(this)
                    .setTitle("終了の確認")
                    .setMessage("本当に終了しますか")
                    .setPositiveButton("はい",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            })
                    .setNegativeButton("いいえ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            })
                    .show();
            return true;
        }
        else
            return false;
    }

    public static class DifficultyFragment extends Fragment {
        public static DifficultyFragment newInstance() {
            DifficultyFragment fragment = new DifficultyFragment();
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_difficulty, container, false);

            Button easyButton = (Button) rootView.findViewById(R.id.easy_button);
            Button normalButton = (Button) rootView.findViewById(R.id.normal_button);
            Button hardButton = (Button) rootView.findViewById(R.id.hard_button);

            easyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    difficultySelect("EASY");
                }
            });

            normalButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    difficultySelect("NORMAL");
                }
            });

            hardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    difficultySelect("HARD");
                }
            });

            return rootView;
        }

        private void difficultySelect(String difficulty) {

            Intent intent = new Intent(getActivity(), GameActivity.class);
            intent.putExtra("Difficulty", difficulty);
            startActivity(intent);
        }
    }
}
