package org.xplatform.responsible_game.impl.presentation.limits.deposit_limit.gambling_exam.models;

import a.h9g;
import a.ohs0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/DepositLimitScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DepositLimitScreenParams implements Parcelable {
    public static final Parcelable.Creator<DepositLimitScreenParams> CREATOR = new h9g((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46893a;
    public final int b;

    public DepositLimitScreenParams(int i, int i2) {
        this.f46893a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositLimitScreenParams)) {
            return false;
        }
        DepositLimitScreenParams depositLimitScreenParams = (DepositLimitScreenParams) obj;
        return this.f46893a == depositLimitScreenParams.f46893a && this.b == depositLimitScreenParams.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f46893a) * 31);
    }

    public final String toString() {
        return ohs0.m("DepositLimitScreenParams(limitType=", this.f46893a, ", limitValue=", Separators.RPAREN, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46893a);
        parcel.writeInt(this.b);
    }
}
