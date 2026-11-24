package org.xplatform.sportgame.markets.categories.api.navigation;

import a.kng0;
import a.qo7;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/markets/categories/api/navigation/CategoryMarketsParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CategoryMarketsParams implements Parcelable {
    public static final Parcelable.Creator<CategoryMarketsParams> CREATOR = new qo7((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47010a;
    public final long b;
    public final long c;

    public CategoryMarketsParams(long j, long j2, long j3) {
        this.f47010a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryMarketsParams)) {
            return false;
        }
        CategoryMarketsParams categoryMarketsParams = (CategoryMarketsParams) obj;
        return this.f47010a == categoryMarketsParams.f47010a && this.b == categoryMarketsParams.b && this.c == categoryMarketsParams.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f47010a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f47010a, "CategoryMarketsParams(sportId=", ", gameId=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", subGameId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47010a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
