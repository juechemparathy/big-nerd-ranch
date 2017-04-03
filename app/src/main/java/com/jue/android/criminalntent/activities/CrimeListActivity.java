package com.jue.android.criminalntent.activities;

import android.support.v4.app.Fragment;

import com.jue.android.criminalntent.fragments.CrimeListFragment;
import com.jue.android.criminalntent.fragments.SingleFragmentActivity;

/**
 * Created by jue on 4/3/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
