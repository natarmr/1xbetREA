package org.xplatform.ufc.api.game;

import a.brm0;
import a.kng0;
import a.rdr0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ufc/api/game/UfcGameParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UfcGameParams implements Parcelable {
    public static final Parcelable.Creator<UfcGameParams> CREATOR = new rdr0((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47170a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public UfcGameParams(int i, long j, long j2, long j3, long j4, String str, boolean z) {
        str.getClass();
        this.f47170a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = str;
        this.g = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UfcGameParams)) {
            return false;
        }
        UfcGameParams ufcGameParams = (UfcGameParams) obj;
        return this.f47170a == ufcGameParams.f47170a && this.b == ufcGameParams.b && this.c == ufcGameParams.c && this.d == ufcGameParams.d && this.e == ufcGameParams.e && Intrinsics.d(this.f, ufcGameParams.f) && this.g == ufcGameParams.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ua80.b(rw2.b(rw2.b(rw2.b(brm0.e(Long.hashCode(this.f47170a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f47170a, "UfcGameParams(gameId=", ", live=", this.b);
        kng0.A(sbR, ", sportId=", this.c, ", subGameId=");
        sbR.append(this.d);
        kng0.A(sbR, ", champId=", this.e, ", champName=");
        return brm0.j(this.g, this.f, ", globalChampId=", Separators.RPAREN, sbR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47170a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
    }
}
