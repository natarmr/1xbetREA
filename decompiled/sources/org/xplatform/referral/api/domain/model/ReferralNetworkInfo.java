package org.xplatform.referral.api.domain.model;

import a.brm0;
import a.cs0;
import a.d860;
import a.ohs0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ReferralNetworkInfo implements Parcelable {
    public static final Parcelable.Creator<ReferralNetworkInfo> CREATOR = new d860((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f46842a;
    public final double b;
    public final double c;
    public final String d;
    public final List e;

    public ReferralNetworkInfo(double d, double d2, double d3, String str, List list) {
        str.getClass();
        list.getClass();
        this.f46842a = d;
        this.b = d2;
        this.c = d3;
        this.d = str;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralNetworkInfo)) {
            return false;
        }
        ReferralNetworkInfo referralNetworkInfo = (ReferralNetworkInfo) obj;
        return Double.compare(this.f46842a, referralNetworkInfo.f46842a) == 0 && Double.compare(this.b, referralNetworkInfo.b) == 0 && Double.compare(this.c, referralNetworkInfo.c) == 0 && Intrinsics.d(this.d, referralNetworkInfo.d) && Intrinsics.d(this.e, referralNetworkInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(brm0.d(this.c, brm0.d(this.b, Double.hashCode(this.f46842a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f46842a, "ReferralNetworkInfo(userBalance=", ", userFullBalance=");
        sbP.append(this.b);
        ohs0.A(sbP, this.c, ", userHoldBalance=", ", referralUrl=");
        return rw2.m(this.d, ", referralUsers=", Separators.RPAREN, sbP, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.f46842a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeString(this.d);
        Iterator itT = cs0.t(this.e, parcel);
        while (itT.hasNext()) {
            ((ReferralUser) itT.next()).writeToParcel(parcel, i);
        }
    }
}
