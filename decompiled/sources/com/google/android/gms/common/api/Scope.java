package com.google.android.gms.common.api;

import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new lgw0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45485a;
    public final String b;

    public Scope(int i, String str) {
        s0x.F(str, "scopeUri must not be null or empty");
        this.f45485a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45485a);
        q5x.k0(parcel, 2, this.b);
        q5x.q0(parcel, iP0);
    }
}
