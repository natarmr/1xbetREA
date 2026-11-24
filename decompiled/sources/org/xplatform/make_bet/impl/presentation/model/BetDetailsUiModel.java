package org.xplatform.make_bet.impl.presentation.model;

import a.b1j;
import a.brm0;
import a.ibw0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/make_bet/impl/presentation/model/BetDetailsUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<BetDetailsUiModel> CREATOR = new ibw0((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46770a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public BetDetailsUiModel(String str, String str2, String str3, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f46770a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BetDetailsUiModel)) {
            return false;
        }
        BetDetailsUiModel betDetailsUiModel = (BetDetailsUiModel) obj;
        return Intrinsics.d(this.f46770a, betDetailsUiModel.f46770a) && Intrinsics.d(this.b, betDetailsUiModel.b) && Intrinsics.d(this.c, betDetailsUiModel.c) && this.d == betDetailsUiModel.d && this.e == betDetailsUiModel.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(ua80.b(this.f46770a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetDetailsUiModel(betName=", this.f46770a, ", teamsName=", this.b, ", subgameText=");
        brm0.C(this.c, ", isDuelGame=", ", hasAutoSub=", sbN, this.d);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46770a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
