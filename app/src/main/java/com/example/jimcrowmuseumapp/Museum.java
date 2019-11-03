/*
Richie Tarkowski
November 6, 2019
Professor Hira Herrington
ISYS 221 001
The Jim Crow Museum App displays four digital exhibits from the Jim Crow Museum at Ferris State University
Variable List:
    ITEMS (Type: ArrayList<MuseumItem>) All default Museum Items in the app
    ITEMS_MAP (Type: HashMap<UUID, MuseumItem>) All default Museum Items in the app, each mapped to its ID (UUID)
*/

package com.example.jimcrowmuseumapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Museum {

    public static final List<MuseumItem> ITEMS = new ArrayList<>();
    public static final Map<UUID, MuseumItem> ITEM_MAP = new HashMap<>();

    static {
        addItem(new MuseumItem(UUID.randomUUID(), "Stub A", R.layout.exhibit1));
        addItem(new MuseumItem(UUID.randomUUID(), "Stub B", R.layout.exhibit1));
        addItem(new MuseumItem(UUID.randomUUID(), "Stub C", R.layout.exhibit1));
        addItem(new MuseumItem(UUID.randomUUID(), "Stub D", R.layout.exhibit1));
        addItem(new MuseumItem(UUID.randomUUID(), "Jim Crow Site", "https://www.ferris.edu/HTMLS/news/jimcrow/"));
    }

    private static void addItem(MuseumItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class MuseumItem {
        public final UUID id;
        public final String name;
        public final String url;
        public final Integer resId;
        private Boolean isWebView = false;

        public MuseumItem(UUID id, String content, Integer resId) {
            this.id = id;
            this.name = content;
            this.resId = resId;
            this.url = null;
        }

        public MuseumItem(UUID id, String content, String url){
            this.id = id;
            this.name = content;
            this.url = url;
            this.resId = null;
            this.isWebView = true;
        }

        @Override
        public String toString() {
            return name;
        }

        public Boolean IsWebView(){
            return this.isWebView;
        }
    }
}
