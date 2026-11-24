package com.google.firebase.auth.internal;

import a.equ0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzx implements AuthResult {
    public static final Parcelable.Creator<zzx> CREATOR = new equ0((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzad f45658a;
    public zzv b;
    public zzc c;

    public zzx(zzad zzadVar) {
        this.f45658a = zzadVar;
        ArrayList arrayList = zzadVar.e;
        this.b = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!TextUtils.isEmpty(((zzz) arrayList.get(i)).h)) {
                this.b = new zzv(((zzz) arrayList.get(i)).b, ((zzz) arrayList.get(i)).h, zzadVar.j);
            }
        }
        if (this.b == null) {
            this.b = new zzv(zzadVar.j);
        }
        this.c = zzadVar.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45658a, i);
        q5x.j0(parcel, 2, this.b, i);
        q5x.j0(parcel, 3, this.c, i);
        q5x.q0(parcel, iP0);
    }
}
