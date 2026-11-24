package org.xplatform.registration.success.api;

import a.b1j;
import a.dw9;
import a.f140;
import a.kng0;
import a.ohs0;
import a.q7f0;
import a.sne0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/success/api/RegistrationSuccessParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RegistrationSuccessParams implements Parcelable {
    public static final Parcelable.Creator<RegistrationSuccessParams> CREATOR = new sne0((byte) 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46859a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final q7f0 f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Integer m;

    public RegistrationSuccessParams(String str, String str2, String str3, String str4, Integer num, q7f0 q7f0Var, String str5, String str6, String str7, String str8, String str9, String str10, Integer num2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        q7f0Var.getClass();
        ohs0.z(str5, str6, str7, str8, str9);
        str10.getClass();
        this.f46859a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = q7f0Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistrationSuccessParams)) {
            return false;
        }
        RegistrationSuccessParams registrationSuccessParams = (RegistrationSuccessParams) obj;
        return Intrinsics.d(this.f46859a, registrationSuccessParams.f46859a) && Intrinsics.d(this.b, registrationSuccessParams.b) && Intrinsics.d(this.c, registrationSuccessParams.c) && Intrinsics.d(this.d, registrationSuccessParams.d) && Intrinsics.d(this.e, registrationSuccessParams.e) && this.f == registrationSuccessParams.f && Intrinsics.d(this.g, registrationSuccessParams.g) && Intrinsics.d(this.h, registrationSuccessParams.h) && Intrinsics.d(this.i, registrationSuccessParams.i) && Intrinsics.d(this.j, registrationSuccessParams.j) && Intrinsics.d(this.k, registrationSuccessParams.k) && Intrinsics.d(this.l, registrationSuccessParams.l) && Intrinsics.d(this.m, registrationSuccessParams.m);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(this.f46859a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        int iB2 = ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.f.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        Integer num2 = this.m;
        return iB2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RegistrationSuccessParams(login=", this.f46859a, ", password=", this.b, ", phoneCode=");
        f140.v(sbN, this.c, ", phoneBody=", this.d, ", countryId=");
        sbN.append(this.e);
        sbN.append(", regType=");
        sbN.append(this.f);
        sbN.append(", countryCode=");
        f140.v(sbN, this.g, ", promoCode=", this.h, ", countryName=");
        f140.v(sbN, this.i, ", currencyName=", this.j, ", bonusName=");
        f140.v(sbN, this.k, ", referralLink=", this.l, ", socialTypeId=");
        return dw9.q(sbN, this.m, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46859a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num);
        }
        parcel.writeString(this.f.name());
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        Integer num2 = this.m;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num2);
        }
    }
}
