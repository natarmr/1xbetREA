package org.xplatform.ufc.api.championship;

import a.axq;
import a.rdr0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UfcChampionshipParams implements Parcelable {
    public static final Parcelable.Creator<UfcChampionshipParams> CREATOR = new rdr0((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47168a;
    public final String b;

    public UfcChampionshipParams(long j, String str) {
        str.getClass();
        this.f47168a = j;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UfcChampionshipParams)) {
            return false;
        }
        UfcChampionshipParams ufcChampionshipParams = (UfcChampionshipParams) obj;
        return this.f47168a == ufcChampionshipParams.f47168a && Intrinsics.d(this.b, ufcChampionshipParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f47168a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f47168a, "UfcChampionshipParams(champId=", ", champName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47168a);
        parcel.writeString(this.b);
    }
}
