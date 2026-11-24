package com.google.android.gms.auth.api.identity;

import a.equ0;
import a.l8x;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new equ0((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45470a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public GetSignInIntentRequest(int i, String str, String str2, String str3, String str4, boolean z) {
        s0x.H(str);
        this.f45470a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return l8x.Z(this.f45470a, getSignInIntentRequest.f45470a) && l8x.Z(this.d, getSignInIntentRequest.d) && l8x.Z(this.b, getSignInIntentRequest.b) && l8x.Z(Boolean.valueOf(this.e), Boolean.valueOf(getSignInIntentRequest.e)) && this.f == getSignInIntentRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45470a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45470a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.k0(parcel, 4, this.d);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        q5x.o0(parcel, 6, 4);
        parcel.writeInt(this.f);
        q5x.q0(parcel, iP0);
    }
}
