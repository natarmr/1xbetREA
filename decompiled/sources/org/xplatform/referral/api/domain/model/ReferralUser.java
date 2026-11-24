package org.xplatform.referral.api.domain.model;

import a.b1j;
import a.brm0;
import a.dw9;
import a.hne;
import a.sne0;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/referral/api/domain/model/ReferralUser;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ReferralUser implements Parcelable {
    public static final Parcelable.Creator<ReferralUser> CREATOR = new sne0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46843a;
    public final String b;
    public final String c;
    public final double d;
    public final int e;
    public final boolean f;

    public ReferralUser(String str, String str2, String str3, double d, int i, boolean z) {
        brm0.B(str, str2, str3);
        this.f46843a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = i;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralUser)) {
            return false;
        }
        ReferralUser referralUser = (ReferralUser) obj;
        return Intrinsics.d(this.f46843a, referralUser.f46843a) && Intrinsics.d(this.b, referralUser.b) && Intrinsics.d(this.c, referralUser.c) && Double.compare(this.d, referralUser.d) == 0 && this.e == referralUser.e && this.f == referralUser.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, brm0.d(this.d, ua80.b(ua80.b(this.f46843a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ReferralUser(referralNetworkSize=", this.f46843a, ", invitedUserId=", this.b, ", invitedUserRegistrationDate=");
        hne.A(sbN, this.c, ", invitedUserProfit=", this.d);
        dw9.v(this.e, ", invitedUserCountBets=", ", deleted=", sbN, this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46843a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeDouble(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
