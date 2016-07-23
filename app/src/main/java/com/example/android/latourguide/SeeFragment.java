package com.example.android.latourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link SeeFragment} displays popular venues and museums in LA.
 */
public class SeeFragment extends Fragment {


    public SeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create a list of popular LA venues and museums
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.see_name_the_broad, R.string.see_description_the_broad, R.drawable.the_broad));
        places.add(new Place(R.string.see_name_dodgers_stadium, R.string.see_description_dodgers_stadium, R.drawable.dodgers_stadium));
        places.add(new Place(R.string.see_name_hollywood_bowl, R.string.see_description_hollywood_bowl, R.drawable.hollywood_bowl));
        places.add(new Place(R.string.see_name_lacma, R.string.see_description_lacma, R.drawable.lacma));
        places.add(new Place(R.string.see_name_pantages, R.string.see_description_pantages, R.drawable.pantages_theatre));
        places.add(new Place(R.string.see_name_staples, R.string.see_description_staples, R.drawable.staples_center));
        places.add(new Place(R.string.see_name_wdch, R.string.see_description_wdch, R.drawable.walt_disney_concert_hall));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView)rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
