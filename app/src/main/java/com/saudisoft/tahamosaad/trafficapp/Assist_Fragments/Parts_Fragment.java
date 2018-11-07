package com.saudisoft.tahamosaad.trafficapp.Assist_Fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.saudisoft.tahamosaad.trafficapp.Parts_album;
import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.View_adaptors.AlbumsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Parts_Fragment extends Fragment {


    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Parts_album> albumList;
    private ActionBar toolbar;
    BottomNavigationView bnv ;

    public Parts_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_parts, container, false);

//        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        initCollapsingToolbar(rootView);
        toolbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(getActivity(), albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);




        prepareAlbums();

        try {
            Glide.with(this).load(R.mipmap.car).into((ImageView) rootView.findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rootView;
    }

    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] part_img = new int[]{
                R.drawable.battery,
                R.drawable.brake,
                R.drawable.oil_sump,
                R.drawable.gaskets,
                R.drawable.flywheel,
                R.drawable.engine,
                R.drawable.silencer,
                R.drawable.zipper,
                R.drawable.plug_roto,
                R.drawable.piston_rings};

        albumList.add(new Parts_album("Battery", 1, part_img[0]));
        albumList.add(new Parts_album("Brake", 8, part_img[1]));
        albumList.add(new Parts_album("Oil Sump", 11, part_img[2]));
        albumList.add(new Parts_album("Gaskets", 12, part_img[3]));
        albumList.add(new Parts_album("Flywheel", 14, part_img[4]));
        albumList.add(new Parts_album("Car Engine", 120, part_img[5]));
        albumList.add(new Parts_album("silencer", 4, part_img[6]));
        albumList.add(new Parts_album("Car Assistants", 3, part_img[7]));
        albumList.add(new Parts_album("Spark Plug", 11, part_img[8]));
        albumList.add(new Parts_album("Piston rings", 17, part_img[9]));

        albumList.add(new Parts_album("Spark Plug", 11, part_img[8]));
        albumList.add(new Parts_album("Battery", 1, part_img[0]));
        albumList.add(new Parts_album("Brake", 8, part_img[1]));
        albumList.add(new Parts_album("Oil Sump", 11, part_img[2]));
        albumList.add(new Parts_album("Gaskets", 12, part_img[3]));
        albumList.add(new Parts_album("Flywheel", 14, part_img[4]));
        albumList.add(new Parts_album("Car Engine", 120, part_img[5]));
        albumList.add(new Parts_album("silencer", 4, part_img[6]));
        albumList.add(new Parts_album("Car Assistants", 3, part_img[7]));
        albumList.add(new Parts_album("Spark Plug", 11, part_img[8]));
        albumList.add(new Parts_album("Piston rings", 17, part_img[9]));
        albumList.add(new Parts_album("Spark Plug", 11, part_img[8]));
        adapter.notifyDataSetChanged();
    }
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round( TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }



    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar(View v) {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) v.findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) v.findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.parts_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }



}
