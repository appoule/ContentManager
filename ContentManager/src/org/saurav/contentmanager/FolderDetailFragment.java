package org.saurav.contentmanager;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FolderDetailFragment extends DialogFragment
{
	
@Override
public void onCreate(Bundle savedInstanceState)
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	
}

@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
	 View rootView = inflater.inflate(R.layout.fragment_folderdetailrelative, container, false);
		//return super.onCreateView(inflater, container, savedInstanceState);
	 return rootView;
	}

}
