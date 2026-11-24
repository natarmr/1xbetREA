package com.google.android.gms.cloudmessaging;

import a.lgw0;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new lgw0(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Messenger f45479a;

    public zzd(IBinder iBinder) {
        this.f45479a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f45479a.getBinder().equals(((zzd) obj).f45479a.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.f45479a.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f45479a.getBinder());
    }
}
