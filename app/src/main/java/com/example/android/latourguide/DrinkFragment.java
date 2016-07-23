package com.example.android.latourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrinkFragment extends Fragment {


    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create a list of popular LA bars
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.drink_name_break_room_86, R.string.drink_description_break_room_86, R.drawable.break_room_86));
        places.add(new Place(R.string.drink_name_everson_royce_bar, R.string.drink_description_everson_royce_bar, R.drawable.everson_royce_bar));
        places.add(new Place(R.string.drink_name_fiscal_agent, R.string.drink_description_fiscal_agent, R.drawable.fiscal_agent));
        places.add(new Place(R.string.drink_name_highland_park_bowl, R.string.drink_description_highland_park_bowl, R.drawable.highland_park_bowl));
        places.add(new Place(R.string.drink_name_lincoln, R.string.drink_description_lincoln, R.drawable.lincoln));
        places.add(new Place(R.string.drink_name_paley, R.string.drink_description_paley, R.drawable.paley));

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
