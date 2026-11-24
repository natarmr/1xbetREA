package org.xplatform.bet_history.history.presentation.dialog.bet_summary;

import a.b1j;
import a.f140;
import a.ohs0;
import a.qo7;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetsSummaryInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<BetsSummaryInfoUiModel> CREATOR = new qo7(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46396a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public BetsSummaryInfoUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        ohs0.z(str, str2, str3, str4, str5);
        ohs0.z(str6, str7, str8, str9, str10);
        this.f46396a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BetsSummaryInfoUiModel)) {
            return false;
        }
        BetsSummaryInfoUiModel betsSummaryInfoUiModel = (BetsSummaryInfoUiModel) obj;
        return Intrinsics.d(this.f46396a, betsSummaryInfoUiModel.f46396a) && Intrinsics.d(this.b, betsSummaryInfoUiModel.b) && Intrinsics.d(this.c, betsSummaryInfoUiModel.c) && Intrinsics.d(this.d, betsSummaryInfoUiModel.d) && Intrinsics.d(this.e, betsSummaryInfoUiModel.e) && Intrinsics.d(this.f, betsSummaryInfoUiModel.f) && Intrinsics.d(this.g, betsSummaryInfoUiModel.g) && Intrinsics.d(this.h, betsSummaryInfoUiModel.h) && Intrinsics.d(this.i, betsSummaryInfoUiModel.i) && Intrinsics.d(this.j, betsSummaryInfoUiModel.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f46396a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetsSummaryInfoUiModel(betPeriod=", this.f46396a, ", betCount=", this.b, ", betSum=");
        f140.v(sbN, this.c, ", betPaidOut=", this.d, ", betUnsettled=");
        f140.v(sbN, this.e, ", currency=", this.f, ", titleBetCount=");
        f140.v(sbN, this.g, ", titleBetSum=", this.h, ", titlePayout=");
        return ua80.m(sbN, this.i, ", titleUnsettled=", this.j, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46396a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }
}
