package com.google.android.gms.common.api;

import a.dw9;
import a.lgw0;
import a.q5x;
import a.rw2;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = new lgw0(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45483a;
    public final int b;
    public final int c;
    public final boolean d;

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.f45483a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f45483a == complianceOptions.f45483a && this.b == complianceOptions.b && this.c == complianceOptions.c && this.d == complianceOptions.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45483a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.f45483a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        int length3 = String.valueOf(i3).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        rw2.s(i, i2, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb);
        dw9.v(i3, ", processingReason=", ", isUserData=", sb, z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45483a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
