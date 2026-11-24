package com.github.mikephil.charting.data;

import a.h9g;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Entry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new h9g((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45454a;
    public Parcelable b;
    public float c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.c + " y: " + this.f45454a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.f45454a);
        if (this.b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.b, i);
        }
    }
}
