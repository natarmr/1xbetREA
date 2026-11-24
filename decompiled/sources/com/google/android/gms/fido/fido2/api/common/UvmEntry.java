package com.google.android.gms.fido.fido2.api.common;

import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new lgw0((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45508a;
    public final short b;
    public final short c;

    public UvmEntry(int i, short s, short s2) {
        this.f45508a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f45508a == uvmEntry.f45508a && this.b == uvmEntry.b && this.c == uvmEntry.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45508a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45508a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c);
        q5x.q0(parcel, iP0);
    }
}
