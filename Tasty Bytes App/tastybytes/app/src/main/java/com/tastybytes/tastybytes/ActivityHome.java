package com.tastybytes.tastybytes;

import java.util.ArrayList;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class ActivityHome extends Fragment implements OnItemClickListener {
	GridView gridview;
	AdapaterGridView gridviewAdapter;
	ArrayList<GridViewItem> data = new ArrayList<GridViewItem>();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.fragment_list, container, false);

		gridview = (GridView) v.findViewById(R.id.gridView1);
		gridview.setOnItemClickListener(this);

		data.add(new GridViewItem(getResources().getString(R.string.menu_product), getResources().getDrawable(R.drawable.ic_product)));
		data.add(new GridViewItem(getResources().getString(R.string.menu_cart), getResources().getDrawable(R.drawable.ic_cart)));
		data.add(new GridViewItem(getResources().getString(R.string.menu_checkout), getResources().getDrawable(R.drawable.ic_checkout)));
		data.add(new GridViewItem(getResources().getString(R.string.menu_about), getResources().getDrawable(R.drawable.ic_about)));



		setDataAdapter();

		return v;
	}

	// Set the Data Adapter
	private void setDataAdapter() {
		gridviewAdapter = new AdapaterGridView(getActivity(), R.layout.fragment_list_item, data);
		gridview.setAdapter(gridviewAdapter);
	}

	@Override
	public void onItemClick(final AdapterView<?> arg0, final View view, final int position, final long id) {
		if (position==0){
			startActivity(new Intent(getActivity(), ActivityCategoryList.class));
			getActivity().overridePendingTransition (R.anim.open_next, R.anim.close_next);
		}
		else if (position==1){
			startActivity(new Intent(getActivity(), ActivityCart.class));
			getActivity().overridePendingTransition (R.anim.open_next, R.anim.close_next);
		}
		else if (position==2){
			startActivity(new Intent(getActivity(), ActivityCheckout.class));
			getActivity().overridePendingTransition (R.anim.open_next, R.anim.close_next);
		}
		else if (position==3){
			startActivity(new Intent(getActivity(), ActivityAbout.class));
			getActivity().overridePendingTransition (R.anim.open_next, R.anim.close_next);

		}
		else if (position==4){

		}
		else if (position==5){

		}
		else if (position==6){

		}
		else {


		}

	}

}