package org.xplatform.wallet.impl.presentation.dialogs.accountactions.params;

import a.brm0;
import a.f140;
import a.hne;
import a.ibw0;
import a.kng0;
import a.ohs0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AccountActionsScreenParams implements Parcelable {
    public static final Parcelable.Creator<AccountActionsScreenParams> CREATOR = new ibw0((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47314a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final double f;
    public final boolean g;

    public AccountActionsScreenParams(String str, long j, String str2, long j2, String str3, double d, boolean z) {
        brm0.B(str, str2, str3);
        this.f47314a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
        this.e = str3;
        this.f = d;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountActionsScreenParams)) {
            return false;
        }
        AccountActionsScreenParams accountActionsScreenParams = (AccountActionsScreenParams) obj;
        return Intrinsics.d(this.f47314a, accountActionsScreenParams.f47314a) && this.b == accountActionsScreenParams.b && Intrinsics.d(this.c, accountActionsScreenParams.c) && this.d == accountActionsScreenParams.d && Intrinsics.d(this.e, accountActionsScreenParams.e) && Double.compare(this.f, accountActionsScreenParams.f) == 0 && this.g == accountActionsScreenParams.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.d(this.f, ua80.b(rw2.b(ua80.b(rw2.b(this.f47314a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "AccountActionsScreenParams(requestKey=", this.f47314a, ", balanceId=");
        hne.B(sbO, ", balanceName=", this.c, ", currencyId=");
        kng0.z(sbO, this.d, ", currencySymbol=", this.e);
        ohs0.A(sbO, this.f, ", money=", ", deletable=");
        return rw2.p(sbO, this.g, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47314a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeDouble(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
