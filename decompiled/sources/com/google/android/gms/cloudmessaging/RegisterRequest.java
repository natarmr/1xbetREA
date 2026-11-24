package com.google.android.gms.cloudmessaging;

import a.q5x;
import a.zcx0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zcx0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45478a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public final String g;

    public RegisterRequest(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f45478a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45478a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.k0(parcel, 4, this.d);
        q5x.k0(parcel, 5, this.e);
        int i2 = this.f;
        q5x.o0(parcel, 6, 4);
        parcel.writeInt(i2);
        q5x.k0(parcel, 7, this.g);
        q5x.q0(parcel, iP0);
    }

    public RegisterRequest(String str, String str2, String str3, String str4, String str5) {
        this.f45478a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = "fcm-25.1.3";
    }
}
