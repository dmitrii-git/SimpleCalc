package com.mcompany.simplecalc;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class ListParcelable implements Parcelable {
    private List result = new ArrayList();

    private ListParcelable(ArrayList<String> result) {
        this.result = result;
    }

    private ListParcelable(Parcel in) {
        result = in.createStringArrayList();

    }

    public static final Creator<ListParcelable> CREATOR = new Creator<ListParcelable>() {
        @Override
        public ListParcelable createFromParcel(Parcel in) {
            return new ListParcelable(in);
        }

        @Override
        public ListParcelable[] newArray(int size) {
            return new ListParcelable[size];
        }
    };

    public ListParcelable() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int i) {
        out.writeStringList(result);

    }

    public List getResult() {
        return result;
    }

    public void adResult(String x) {
        this.result.add(x);
    }

    public void clearResult() {
        this.result.clear();
    }

    public void removeResult() {
        if (this.result.size() > 0) {
            this.result.remove(this.result.size() - 1);
        } else {
            this.result.clear();
        }
    }
}
