package com.google.android.gms.fido.fido2.api.common;

import a.erw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new erw0((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45501a;

    public AuthenticationExtensionsCredPropsOutputs(boolean z) {
        this.f45501a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f45501a == ((AuthenticationExtensionsCredPropsOutputs) obj).f45501a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45501a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45501a ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
