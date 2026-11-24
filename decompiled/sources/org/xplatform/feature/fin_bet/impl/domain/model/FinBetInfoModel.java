package org.xplatform.feature.fin_bet.impl.domain.model;

import a.brm0;
import a.fcq;
import a.hne;
import a.kng0;
import a.ohs0;
import a.rw2;
import a.rz4;
import a.twn;
import a.ua80;
import a.vqd;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FinBetInfoModel implements Parcelable {
    public static final Parcelable.Creator<FinBetInfoModel> CREATOR = new yoo((byte) 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46646a;
    public final String b;
    public final double c;
    public final String d;
    public final fcq e;
    public final double f;
    public final int g;
    public final long h;
    public final double i;
    public final double j;
    public final boolean k;
    public final int l;
    public final long m;

    public FinBetInfoModel(int i, String str, double d, String str2, fcq fcqVar, double d2, int i2, long j, double d3, double d4, boolean z, int i3, long j2) {
        str.getClass();
        str2.getClass();
        fcqVar.getClass();
        this.f46646a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = fcqVar;
        this.f = d2;
        this.g = i2;
        this.h = j;
        this.i = d3;
        this.j = d4;
        this.k = z;
        this.l = i3;
        this.m = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinBetInfoModel)) {
            return false;
        }
        FinBetInfoModel finBetInfoModel = (FinBetInfoModel) obj;
        return this.f46646a == finBetInfoModel.f46646a && Intrinsics.d(this.b, finBetInfoModel.b) && Double.compare(this.c, finBetInfoModel.c) == 0 && Intrinsics.d(this.d, finBetInfoModel.d) && this.e == finBetInfoModel.e && Double.compare(this.f, finBetInfoModel.f) == 0 && this.g == finBetInfoModel.g && this.h == finBetInfoModel.h && Double.compare(this.i, finBetInfoModel.i) == 0 && Double.compare(this.j, finBetInfoModel.j) == 0 && this.k == finBetInfoModel.k && this.l == finBetInfoModel.l && this.m == finBetInfoModel.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + twn.a(this.l, brm0.e(brm0.d(this.j, brm0.d(this.i, rw2.b(twn.a(this.g, brm0.d(this.f, (this.e.hashCode() + ua80.b(brm0.d(this.c, ua80.b(Integer.hashCode(this.f46646a) * 31, 31, this.b), 31), 31, this.d)) * 31, 31), 31), 31, this.h), 31), 31), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46646a, "FinBetInfoModel(instrumentId=", ", coefViewName=", this.b, ", coef=");
        hne.w(sbR, this.c, ", instrumentName=", this.d);
        sbR.append(", instrumentType=");
        sbR.append(this.e);
        sbR.append(", price=");
        rz4.w(sbR, this.f, ", decimals=", this.g);
        kng0.A(sbR, ", seconds=", this.h, ", higherCoefficient=");
        sbR.append(this.i);
        ohs0.A(sbR, this.j, ", lowerCoefficient=", ", higher=");
        ua80.q(this.l, ", index=", ", closeTime=", sbR, this.k);
        return brm0.k(this.m, Separators.RPAREN, sbR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46646a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeDouble(this.f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeDouble(this.i);
        parcel.writeDouble(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeLong(this.m);
    }
}
