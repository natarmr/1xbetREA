package com.google.firebase.auth.internal;

import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaj extends MultiFactorResolver {
    public static final Parcelable.Creator<zzaj> CREATOR = new lgw0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45654a;
    public final zzao b;
    public final String c;
    public final zzc d;
    public final zzad e;
    public final List f;

    public zzaj(ArrayList arrayList, zzao zzaoVar, String str, zzc zzcVar, zzad zzadVar, ArrayList arrayList2) {
        s0x.H(arrayList);
        this.f45654a = arrayList;
        s0x.H(zzaoVar);
        this.b = zzaoVar;
        s0x.E(str);
        this.c = str;
        this.d = zzcVar;
        this.e = zzadVar;
        s0x.H(arrayList2);
        this.f = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.n0(parcel, 1, this.f45654a);
        q5x.j0(parcel, 2, this.b, i);
        q5x.k0(parcel, 3, this.c);
        q5x.j0(parcel, 4, this.d, i);
        q5x.j0(parcel, 5, this.e, i);
        q5x.n0(parcel, 6, this.f);
        q5x.q0(parcel, iP0);
    }
}
