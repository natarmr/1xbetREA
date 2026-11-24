package com.google.android.gms.internal.measurement;

import a.lgw0;
import a.q5x;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new lgw0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45526a;
    public final String b;
    public final Intent c;

    public zzdd(int i, String str, Intent intent) {
        this.f45526a = i;
        this.b = str;
        this.c = intent;
    }

    public static zzdd m(Activity activity) {
        return new zzdd(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdd)) {
            return false;
        }
        zzdd zzddVar = (zzdd) obj;
        return this.f45526a == zzddVar.f45526a && Objects.equals(this.b, zzddVar.b) && Objects.equals(this.c, zzddVar.c);
    }

    public final int hashCode() {
        return this.f45526a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45526a);
        q5x.k0(parcel, 2, this.b);
        q5x.j0(parcel, 3, this.c, i);
        q5x.q0(parcel, iP0);
    }
}
