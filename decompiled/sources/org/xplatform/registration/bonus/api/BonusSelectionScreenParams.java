package org.xplatform.registration.bonus.api;

import a.brm0;
import a.dw9;
import a.hne;
import a.qo7;
import a.rw2;
import a.twn;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BonusSelectionScreenParams implements Parcelable {
    public static final Parcelable.Creator<BonusSelectionScreenParams> CREATOR = new qo7((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46849a;
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;

    public BonusSelectionScreenParams(int i, int i2, int i3, long j, boolean z) {
        this.f46849a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusSelectionScreenParams)) {
            return false;
        }
        BonusSelectionScreenParams bonusSelectionScreenParams = (BonusSelectionScreenParams) obj;
        return this.f46849a == bonusSelectionScreenParams.f46849a && this.b == bonusSelectionScreenParams.b && this.c == bonusSelectionScreenParams.c && this.d == bonusSelectionScreenParams.d && this.e == bonusSelectionScreenParams.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e(rw2.b(twn.a(this.b, Integer.hashCode(this.f46849a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BonusSelectionScreenParams(selectedBonusId=", this.f46849a, ", countryId=", ", currencyId=", this.b);
        hne.t(this.c, ", showRules=", sbT, this.d);
        return vqd.p(sbT, ", groupId=", this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46849a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
    }
}
