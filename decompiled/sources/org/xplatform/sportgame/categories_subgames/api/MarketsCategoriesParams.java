package org.xplatform.sportgame.categories_subgames.api;

import a.brm0;
import a.imw;
import a.kng0;
import a.ms2;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketsCategoriesParams implements Parcelable {
    public static final Parcelable.Creator<MarketsCategoriesParams> CREATOR = new imw(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46990a;
    public final boolean b;
    public final long c;
    public final long d;
    public final ms2 e;
    public final String f;

    public MarketsCategoriesParams(long j, long j2, long j3, ms2 ms2Var, String str, boolean z) {
        ms2Var.getClass();
        str.getClass();
        this.f46990a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = ms2Var;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketsCategoriesParams)) {
            return false;
        }
        MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj;
        return this.f46990a == marketsCategoriesParams.f46990a && this.b == marketsCategoriesParams.b && this.c == marketsCategoriesParams.c && this.d == marketsCategoriesParams.d && Intrinsics.d(this.e, marketsCategoriesParams.e) && Intrinsics.d(this.f, marketsCategoriesParams.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + rw2.b(rw2.b(brm0.e(Long.hashCode(this.f46990a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46990a, "MarketsCategoriesParams(gameId=", ", live=", this.b);
        kng0.A(sbR, ", subGameId=", this.c, ", sportId=");
        sbR.append(this.d);
        sbR.append(", entryPointType=");
        sbR.append(this.e);
        return rw2.o(sbR, ", componentKey=", this.f, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46990a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeString(this.f);
    }
}
