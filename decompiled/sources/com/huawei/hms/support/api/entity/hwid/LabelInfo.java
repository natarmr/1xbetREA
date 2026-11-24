package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class LabelInfo implements Parcelable {
    public static final Parcelable.Creator<LabelInfo> CREATOR = new Parcelable.Creator<LabelInfo>() { // from class: com.huawei.hms.support.api.entity.hwid.LabelInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo createFromParcel(Parcel parcel) {
            return new LabelInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo[] newArray(int i) {
            return new LabelInfo[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45979a;
    private String b;

    public LabelInfo(Parcel parcel) {
        this.f45979a = parcel.readInt();
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getLabelName() {
        return this.b;
    }

    public int getLabelType() {
        return this.f45979a;
    }

    public boolean isEquals(LabelInfo labelInfo) {
        return labelInfo != null && getLabelType() == labelInfo.getLabelType() && getLabelName().equals(labelInfo.getLabelName());
    }

    public void setLabelName(String str) {
        this.b = str;
    }

    public void setLabelType(int i) {
        this.f45979a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45979a);
        parcel.writeString(this.b);
    }

    public LabelInfo() {
        this.f45979a = -1;
        this.b = "";
    }
}
