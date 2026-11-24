package com.google.firebase.perf.util;

import a.l7n0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new l7n0((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45671a;
    public long b;

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), SystemClock.elapsedRealtimeNanos() / 1000);
    }

    public final long a() {
        return new Timer().b - this.b;
    }

    public final long b(Timer timer) {
        return timer.b - this.b;
    }

    public final void d() {
        this.f45671a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f45671a);
        parcel.writeLong(this.b);
    }

    public Timer(long j, long j2) {
        this.f45671a = j;
        this.b = j2;
    }
}
