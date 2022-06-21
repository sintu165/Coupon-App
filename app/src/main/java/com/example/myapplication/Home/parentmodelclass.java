package com.example.myapplication.Home;

import java.util.List;

public class parentmodelclass {
    String title;

    public parentmodelclass(String title, List<childmodelclass> childmodelclassList) {
        this.title = title;
        this.childmodelclassList = childmodelclassList;
    }

    List<childmodelclass> childmodelclassList;
}
