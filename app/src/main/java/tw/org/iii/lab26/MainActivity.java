package tw.org.iii.lab26;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test1(View v){
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute("Brad","Tony","Eric","Mary","Peter");
    }
    private class MyAsyncTask extends AsyncTask<String, Void, Void>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.v("brad","onPreExecute()");
        }
        @Override
        protected Void doInBackground(String... params) {
            Log.v("brad","doInBackground()");
            for (String s : params) {
                Log.v("brad",s);
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.v("brad","onPostExecute()");
        }


        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Log.v("brad","onProgressUpdate()");
        }
        @Override
        protected void onCancelled(Void aVoid) {
            super.onCancelled(aVoid);
            Log.v("brad","onCancelled()");
        }
    }
}
