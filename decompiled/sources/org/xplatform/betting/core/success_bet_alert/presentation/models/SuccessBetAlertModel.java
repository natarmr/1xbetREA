package org.xplatform.betting.core.success_bet_alert.presentation.models;

import a.b1j;
import a.cs0;
import a.h97;
import a.l7n0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SuccessBetAlertModel implements Parcelable {
    public static final Parcelable.Creator<SuccessBetAlertModel> CREATOR = new l7n0((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46420a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final List f;

    public SuccessBetAlertModel(String str, String str2, String str3, Long l, String str4, List list) {
        list.getClass();
        this.f46420a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = str4;
        this.f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessBetAlertModel)) {
            return false;
        }
        SuccessBetAlertModel successBetAlertModel = (SuccessBetAlertModel) obj;
        return Intrinsics.d(this.f46420a, successBetAlertModel.f46420a) && Intrinsics.d(this.b, successBetAlertModel.b) && Intrinsics.d(this.c, successBetAlertModel.c) && Intrinsics.d(this.d, successBetAlertModel.d) && Intrinsics.d(this.e, successBetAlertModel.e) && Intrinsics.d(this.f, successBetAlertModel.f);
    }

    public final int hashCode() {
        String str = this.f46420a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SuccessBetAlertModel(betType=", this.f46420a, ", betNumber=", this.b, ", requestKey=");
        h97.w(this.d, this.c, ", balanceId=", ", betMode=", sbN);
        return rw2.m(this.e, ", betInfoList=", Separators.RPAREN, sbN, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46420a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.e);
        Iterator itT = cs0.t(this.f, parcel);
        while (itT.hasNext()) {
            parcel.writeParcelable((Parcelable) itT.next(), i);
        }
    }
}
