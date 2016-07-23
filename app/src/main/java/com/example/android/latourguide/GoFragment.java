package com.example.android.latourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link GoFragment} displays places go-to attractions in LA.
 */
public class GoFragment extends Fragment {


    public GoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create a list of popular LA go-to attractions
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.attraction_name_echo_park, R.string.attraction_description_echo_park, R.drawable.echo_park));
        places.add(new Place(R.string.attraction_name_farmers_market, R.string.attraction_description_farmers_market, R.drawable.farmers_market));
        places.add(new Place(R.string.attraction_name_getty_villa, R.string.attraction_description_getty_villa, R.drawable.getty_villa));
        places.add(new Place(R.string.attraction_name_griffith_observatory, R.string.attraction_description_griffith_observatory, R.drawable.griffith_observatory));
        places.add(new Place(R.string.attraction_name_runyon_canyon_park, R.string.attraction_description_runyon_canyon_park, R.drawable.runyon_canyon));
        places.add(new Place(R.string.attraction_name_santa_monica_pier, R.string.attraction_description_santa_monica_pier, R.drawable.santa_monica_pier));
        places.add(new Place(R.string.attraction_name_universal_citywalk, R.string.attraction_description_universal_citywalk, R.drawable.universal_citywalk));

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
