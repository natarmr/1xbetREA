package org.xplatform.registration_default.impl.presentation.registration_bonus.models;

import a.brm0;
import a.dw9;
import a.hne;
import a.rw2;
import a.sne0;
import a.twn;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RegistrationBonusDefaultScreenParams implements Parcelable {
    public static final Parcelable.Creator<RegistrationBonusDefaultScreenParams> CREATOR = new sne0((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46870a;
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;

    public RegistrationBonusDefaultScreenParams(int i, int i2, int i3, long j, boolean z) {
        this.f46870a = i;
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
        if (!(obj instanceof RegistrationBonusDefaultScreenParams)) {
            return false;
        }
        RegistrationBonusDefaultScreenParams registrationBonusDefaultScreenParams = (RegistrationBonusDefaultScreenParams) obj;
        return this.f46870a == registrationBonusDefaultScreenParams.f46870a && this.b == registrationBonusDefaultScreenParams.b && this.c == registrationBonusDefaultScreenParams.c && this.d == registrationBonusDefaultScreenParams.d && this.e == registrationBonusDefaultScreenParams.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e(rw2.b(twn.a(this.b, Integer.hashCode(this.f46870a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("RegistrationBonusDefaultScreenParams(selectedBonusId=", this.f46870a, ", countryId=", ", currencyId=", this.b);
        hne.t(this.c, ", showRules=", sbT, this.d);
        return vqd.p(sbT, ", groupId=", this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46870a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
    }
}
