package com.keer.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by qinjh on 17-6-21.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
