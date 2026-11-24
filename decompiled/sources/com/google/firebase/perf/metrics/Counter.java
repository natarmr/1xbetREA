package com.google.firebase.perf.metrics;

import a.okc;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new okc((byte) 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45668a;
    public final AtomicLong b;

    public Counter(Parcel parcel) {
        this.f45668a = parcel.readString();
        this.b = new AtomicLong(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45668a);
        parcel.writeLong(this.b.get());
    }

    public Counter(String str) {
        this.f45668a = str;
        this.b = new AtomicLong(0L);
    }
}
