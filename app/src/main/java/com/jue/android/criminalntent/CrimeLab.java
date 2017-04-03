package com.jue.android.criminalntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jue on 4/3/17.
 */

public class CrimeLab {
    private static CrimeLab crimeLab;
    private static List<Crime> crimeList;

    public CrimeLab(Context context) {
        crimeList = new ArrayList<>();
        for(int i =0 ; i<100; i++) {
            Crime c  = new Crime();
            c.setTitle( " Title " +  i );
            c.setSolved(false);
            crimeList.add(c);
        }
    }

    public static CrimeLab getInstance(Context context) {
        if(crimeLab == null ) {
         crimeLab = new CrimeLab(context);
        }
        return crimeLab;
    }

    public static List<Crime> getCrimes() {
        return crimeList;
    }

    public static Crime getCrime(UUID id) {
        for(Crime c : crimeList) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }
}
