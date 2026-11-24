package org.xplatform.uikit.components.successbetalert.model;

import a.b1j;
import a.f140;
import a.l7n0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SuccessBetStringModel implements Parcelable {
    public static final Parcelable.Creator<SuccessBetStringModel> CREATOR = new l7n0((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47267a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public SuccessBetStringModel(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        this.f47267a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessBetStringModel)) {
            return false;
        }
        SuccessBetStringModel successBetStringModel = (SuccessBetStringModel) obj;
        return Intrinsics.d(this.f47267a, successBetStringModel.f47267a) && Intrinsics.d(this.b, successBetStringModel.b) && Intrinsics.d(this.c, successBetStringModel.c) && Intrinsics.d(this.d, successBetStringModel.d) && Intrinsics.d(this.e, successBetStringModel.e) && Intrinsics.d(this.f, successBetStringModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f47267a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SuccessBetStringModel(titleName=", this.f47267a, ", titleNameSnackBar=", this.b, ", historyButtonName=");
        f140.v(sbN, this.c, ", continueButtonName=", this.d, ", shareButtonName=");
        return ua80.m(sbN, this.e, ", subTitle=", this.f, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47267a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
