package com.jue.android.criminalntent.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Menu;

import com.jue.android.criminalntent.fragments.CrimeFragment;
import com.jue.android.criminalntent.fragments.SingleFragmentActivity;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity implements CrimeFragment.OnFragmentInteractionListener {

    private String TAG = CrimeActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "CrimeActivity. onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return  new CrimeFragment();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "CrimeActivity. onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "CrimeActivity. onResume");
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        Log.d(TAG, "CrimeActivity. onPostResume");
        super.onPostResume();
    }

    @Override
    public void onAttachedToWindow() {
        Log.d(TAG, "CrimeActivity. onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "CrimeActivity. onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onUserLeaveHint() {
        Log.d(TAG, "CrimeActivity. onUserLeaveHint");
        super.onUserLeaveHint();
    }

    @Override
    public void onUserInteraction() {
        Log.d(TAG, "CrimeActivity. onUserInteraction");
        super.onUserInteraction();
    }
    /**
     * This method is called at anytime before onDestroy is called.
     *
     * @param outState
     * @param outPersistentState
     */
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.d(TAG, "CrimeActivity. onSaveInstanceState");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "CrimeActivity. onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "CrimeActivity. onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "CrimeActivity. onStop");
        super.onStop();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(TAG, "CrimeActivity. onActivityResult");
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        Log.d(TAG, "CrimeActivity. onAttachFragment");
        super.onAttachFragment(fragment);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "CrimeActivity. onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        Log.d(TAG, "CrimeActivity. onPostCreate");
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onContentChanged() {
        Log.d(TAG, "CrimeActivity. onContentChanged");
        super.onContentChanged();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "CrimeActivity. onDestroy");
        super.onDestroy();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public static String EXTRA_CRIME_ID = "extra_crime_id";
    public static Intent newIntent(Context context, UUID crimeId) {
        Intent intent = new Intent(context, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

}
