package com.google.android.gms.auth.api.signin.internal;

import a.equ0;
import a.q5x;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new equ0((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45475a;
    public final int b;
    public final Bundle c;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f45475a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45475a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.d0(parcel, 3, this.c);
        q5x.q0(parcel, iP0);
    }
}
