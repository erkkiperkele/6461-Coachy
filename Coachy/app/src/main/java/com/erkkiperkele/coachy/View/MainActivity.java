package com.erkkiperkele.coachy.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.erkkiperkele.coachy.R;


public class MainActivity extends ActionBarActivity {

    public static final String EXTRA_MESSAGE = "com.erkkiperkele.coachy.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            case R.id.action_contacts:
                openContacts();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openContacts() {
        //TODO: open list of contacts
    }

    private void openSettings() {
        //TODO: open settings for coachy
    }

    private void openSearch() {
        //TODO: open search activity
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    //ListView Test

//    // This is the Adapter being used to display the list's data
//    SimpleCursorAdapter mAdapter;
//
//    // These are the Contacts rows that we will retrieve
//    static final String[] PROJECTION = new String[] {ContactsContract.Data._ID,
//            ContactsContract.Data.DISPLAY_NAME};
//
//    // This is the select criteria
//    static final String SELECTION = "((" +
//            ContactsContract.Data.DISPLAY_NAME + " NOTNULL) AND (" +
//            ContactsContract.Data.DISPLAY_NAME + " != '' ))";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
////        // Create a progress bar to display while the list loads
////        ProgressBar progressBar = new ProgressBar(this);
////        progressBar.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT,
////                AbsListView.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
////        progressBar.setIndeterminate(true);
////        getListView().setEmptyView(progressBar);
////
////        // Must add the progress bar to the root of the layout
//////        ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
////        ViewGroup root = (ViewGroup) findViewById(R.id.contact_listView);
////        root.addView(progressBar);
//
//        // For the cursor adapter, specify which columns go into which views
//        String[] fromColumns = {ContactsContract.Data.DISPLAY_NAME};
//        int[] toViews = {R.id.text1}; // The TextView in simple_list_item_1
//
//        // Create an empty adapter we will use to display the loaded data.
//        // We pass null for the cursor, then update it in onLoadFinished()
//        mAdapter = new SimpleCursorAdapter(this,
//                R.id.contact_listView, null,
//                fromColumns, toViews, 0);
//        setListAdapter(mAdapter);
//
//        // Prepare the loader.  Either re-connect with an existing one,
//        // or start a new one.
//        getLoaderManager().initLoader(0, null, this);
//    }
//
//    // Called when a new Loader needs to be created
//    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
//        // Now create and return a CursorLoader that will take care of
//        // creating a Cursor for the data being displayed.
//        return new CursorLoader(this, ContactsContract.Data.CONTENT_URI,
//                PROJECTION, SELECTION, null, null);
//    }
//
//    // Called when a previously created loader has finished loading
//    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
//        // Swap the new cursor in.  (The framework will take care of closing the
//        // old cursor once we return.)
//        mAdapter.swapCursor(data);
//    }
//
//    // Called when a previously created loader is reset, making the data unavailable
//    public void onLoaderReset(Loader<Cursor> loader) {
//        // This is called when the last Cursor provided to onLoadFinished()
//        // above is about to be closed.  We need to make sure we are no
//        // longer using it.
//        mAdapter.swapCursor(null);
//    }
}
