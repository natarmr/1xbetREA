package com.huawei.hms.support.account.result;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class AccountIcon implements Parcelable {
    public static final Parcelable.Creator<AccountIcon> CREATOR = new Parcelable.Creator<AccountIcon>() { // from class: com.huawei.hms.support.account.result.AccountIcon.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon createFromParcel(Parcel parcel) {
            return new AccountIcon(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon[] newArray(int i) {
            return new AccountIcon[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45962a;
    private Bitmap b;

    private AccountIcon(Parcel parcel) {
        this.f45962a = parcel.readString();
        this.b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.f45962a;
    }

    public Bitmap getIcon() {
        return this.b;
    }

    public void setDescription(String str) {
        this.f45962a = str;
    }

    public void setIcon(Bitmap bitmap) {
        this.b = bitmap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45962a);
        parcel.writeParcelable(this.b, i);
    }

    public AccountIcon() {
    }

    public AccountIcon(String str, Bitmap bitmap) {
        this.f45962a = str;
        this.b = bitmap;
    }
}
