package com.google.android.gms.common.api;

import a.ibw0;
import a.l8x;
import a.q5x;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = ibw0.b;
    public static final ApiMetadata d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplianceOptions f45482a;
    public final boolean b;
    public boolean c;

    static {
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.c = false;
        d = apiMetadata;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.f45482a = complianceOptions;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return l8x.Z(this.f45482a, apiMetadata.f45482a) && this.c == apiMetadata.c && this.b == apiMetadata.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45482a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f45482a);
        return rw2.o(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45482a, i);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
