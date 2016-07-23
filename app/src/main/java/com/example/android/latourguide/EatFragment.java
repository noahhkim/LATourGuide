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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create a list of popular LA restaurants
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.eat_name_bestia, R.string.eat_description_bestia, R.drawable.bestia));
        places.add(new Place(R.string.eat_name_il_cha, R.string.eat_description_il_cha, R.drawable.il_cha));
        places.add(new Place(R.string.eat_name_larchmont_wine_cheese, R.string.eat_description_larchmont_wine_cheese, R.drawable.larchmont_wine_cheese));
        places.add(new Place(R.string.eat_name_mapo, R.string.eat_description_mapo, R.drawable.mapo));
        places.add(new Place(R.string.eat_name_pasta_sisters, R.string.eat_description_pasta_sisters, R.drawable.pasta_sisters));
        places.add(new Place(R.string.eat_name_tire_shop_taqueria, R.string.eat_description_tire_shop_taqueria, R.drawable.tire_shop_taqueria));
        places.add(new Place(R.string.eat_name_tsujita, R.string.eat_description_tsujita, R.drawable.tsujita));

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
