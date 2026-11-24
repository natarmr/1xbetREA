package org.xplatform.betting.core.success_bet_alert.presentation.models;

import a.b1j;
import a.l7n0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SuccessBetStringModel implements Parcelable {
    public static final Parcelable.Creator<SuccessBetStringModel> CREATOR = new l7n0((byte) 5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46423a;
    public final String b;
    public final String c;
    public final String d;

    public SuccessBetStringModel(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f46423a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
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
        return Intrinsics.d(this.f46423a, successBetStringModel.f46423a) && Intrinsics.d(this.b, successBetStringModel.b) && Intrinsics.d(this.c, successBetStringModel.c) && Intrinsics.d(this.d, successBetStringModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f46423a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("SuccessBetStringModel(titleName=", this.f46423a, ", titleNameSnackBar=", this.b, ", shareButtonName="), this.c, ", subTitle=", this.d, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46423a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
