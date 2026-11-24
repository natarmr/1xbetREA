package org.xplatform.bethistory.domain.model;

import a.brm0;
import a.hne;
import a.ohs0;
import a.ua80;
import a.vqd;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GeneralBetInfoModel implements Parcelable {
    public static final Parcelable.Creator<GeneralBetInfoModel> CREATOR = new yoo(22);
    public static final GeneralBetInfoModel h = new GeneralBetInfoModel(0, "", "", 0.0d, 0.0d, 0.0d, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46409a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final double f;
    public final String g;

    public GeneralBetInfoModel(int i, String str, String str2, double d, double d2, double d3, String str3) {
        brm0.B(str, str2, str3);
        this.f46409a = i;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralBetInfoModel)) {
            return false;
        }
        GeneralBetInfoModel generalBetInfoModel = (GeneralBetInfoModel) obj;
        return this.f46409a == generalBetInfoModel.f46409a && Intrinsics.d(this.b, generalBetInfoModel.b) && Intrinsics.d(this.c, generalBetInfoModel.c) && Double.compare(this.d, generalBetInfoModel.d) == 0 && Double.compare(this.e, generalBetInfoModel.e) == 0 && Double.compare(this.f, generalBetInfoModel.f) == 0 && Intrinsics.d(this.g, generalBetInfoModel.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.d(this.f, brm0.d(this.e, brm0.d(this.d, ua80.b(ua80.b(Integer.hashCode(this.f46409a) * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46409a, "GeneralBetInfoModel(count=", ", startDate=", this.b, ", endDate=");
        hne.A(sbR, this.c, ", betsSum=", this.d);
        ohs0.A(sbR, this.e, ", payoutWithSellSum=", ", unsettledSum=");
        hne.w(sbR, this.f, ", currency=", this.g);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46409a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeString(this.g);
    }
}
