package org.xplatform.make_bet.impl.presentation.model;

import a.brm0;
import a.f140;
import a.l0d;
import a.okc;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/make_bet/impl/presentation/model/CoefUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CoefUiModel implements Parcelable {
    public static final Parcelable.Creator<CoefUiModel> CREATOR = new okc((byte) 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46772a;
    public final double b;
    public final String c;
    public final l0d d;
    public final Double e;
    public final String f;
    public final String g;
    public final l0d h;
    public final boolean i;

    public CoefUiModel(String str, double d, String str2, l0d l0dVar, Double d2, String str3, String str4, l0d l0dVar2, boolean z) {
        str.getClass();
        l0dVar.getClass();
        l0dVar2.getClass();
        this.f46772a = str;
        this.b = d;
        this.c = str2;
        this.d = l0dVar;
        this.e = d2;
        this.f = str3;
        this.g = str4;
        this.h = l0dVar2;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoefUiModel)) {
            return false;
        }
        CoefUiModel coefUiModel = (CoefUiModel) obj;
        return Intrinsics.d(this.f46772a, coefUiModel.f46772a) && Double.compare(this.b, coefUiModel.b) == 0 && Intrinsics.d(this.c, coefUiModel.c) && this.d == coefUiModel.d && Intrinsics.d(this.e, coefUiModel.e) && Intrinsics.d(this.f, coefUiModel.f) && Intrinsics.d(this.g, coefUiModel.g) && this.h == coefUiModel.h && this.i == coefUiModel.i;
    }

    public final int hashCode() {
        int iD = brm0.d(this.b, this.f46772a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Double d = this.e;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoefUiModel(currentCoefView=");
        sb.append(this.f46772a);
        sb.append(", currentCoefValue=");
        sb.append(this.b);
        sb.append(", oldCoefView=");
        sb.append(this.c);
        sb.append(", coefChangeType=");
        sb.append(this.d);
        sb.append(", optiCoefValue=");
        sb.append(this.e);
        sb.append(", optiCoefView=");
        sb.append(this.f);
        sb.append(", oldOptiCoefView=");
        sb.append(this.g);
        sb.append(", optiCoefState=");
        sb.append(this.h);
        return f140.n(sb, ", isOptiCoef=", this.i, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46772a);
        parcel.writeDouble(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        Double d = this.e;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h.name());
        parcel.writeInt(this.i ? 1 : 0);
    }
}
