package com.google.firebase.auth.internal;

import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.MultiFactorSession;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends MultiFactorSession {
    public static final Parcelable.Creator<zzao> CREATOR = new lgw0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45655a;
    public String b;
    public ArrayList c;
    public ArrayList d;
    public zzad e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45655a);
        q5x.k0(parcel, 2, this.b);
        q5x.n0(parcel, 3, this.c);
        q5x.n0(parcel, 4, this.d);
        q5x.j0(parcel, 5, this.e, i);
        q5x.q0(parcel, iP0);
    }
}
