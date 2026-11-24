package org.xplatform.cyber.game.universal.api;

import a.brm0;
import a.f140;
import a.grs;
import a.h9g;
import a.k1g;
import a.kng0;
import a.rw2;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EsportsUniversalScreenParams implements Parcelable {
    public static final Parcelable.Creator<EsportsUniversalScreenParams> CREATOR = new h9g((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46523a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final grs f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final long j;
    public final int k;
    public final k1g l;

    public EsportsUniversalScreenParams(long j, boolean z, long j2, long j3, long j4, grs grsVar, boolean z2, boolean z3, String str, long j5, int i, k1g k1gVar) {
        grsVar.getClass();
        str.getClass();
        k1gVar.getClass();
        this.f46523a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = grsVar;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = j5;
        this.k = i;
        this.l = k1gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EsportsUniversalScreenParams)) {
            return false;
        }
        EsportsUniversalScreenParams esportsUniversalScreenParams = (EsportsUniversalScreenParams) obj;
        return this.f46523a == esportsUniversalScreenParams.f46523a && this.b == esportsUniversalScreenParams.b && this.c == esportsUniversalScreenParams.c && this.d == esportsUniversalScreenParams.d && this.e == esportsUniversalScreenParams.e && this.f == esportsUniversalScreenParams.f && this.g == esportsUniversalScreenParams.g && this.h == esportsUniversalScreenParams.h && Intrinsics.d(this.i, esportsUniversalScreenParams.i) && this.j == esportsUniversalScreenParams.j && this.k == esportsUniversalScreenParams.k && this.l == esportsUniversalScreenParams.l;
    }

    public final int hashCode() {
        return this.l.hashCode() + twn.a(this.k, rw2.b(ua80.b(brm0.e(brm0.e((this.f.hashCode() + rw2.b(rw2.b(rw2.b(brm0.e(Long.hashCode(this.f46523a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46523a, "EsportsUniversalScreenParams(gameId=", ", live=", this.b);
        kng0.A(sbR, ", subGameId=", this.c, ", sportId=");
        sbR.append(this.d);
        kng0.A(sbR, ", subSportId=", this.e, ", gameScreenInitialAction=");
        sbR.append(this.f);
        sbR.append(", synthetics=");
        sbR.append(this.g);
        sbR.append(", forceVideoPlayback=");
        f140.s(", champName=", this.i, ", champId=", sbR, this.h);
        ua80.v(sbR, this.j, ", globalChampId=", this.k);
        sbR.append(", openScreenSubType=");
        sbR.append(this.l);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46523a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeString(this.l.name());
    }
}
