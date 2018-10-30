package hoanglong.thesis.graduation.juncomputer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhoneCategory {

    List<PhoneCategory> mPhoneCategoryList;

    public PhoneCategory(List<PhoneCategory> phoneCategoryList) {
        mPhoneCategoryList = phoneCategoryList;
    }

    public List<PhoneCategory> getPhoneCategoryList() {
        return mPhoneCategoryList;
    }

    public void setPhoneCategoryList(List<PhoneCategory> phoneCategoryList) {
        mPhoneCategoryList = phoneCategoryList;
    }
}
