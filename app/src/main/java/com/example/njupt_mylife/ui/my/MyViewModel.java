package com.example.njupt_mylife.ui.my;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is my fragment！测试");
    }

    public LiveData<String> getText() {
        return mText;
    }
}