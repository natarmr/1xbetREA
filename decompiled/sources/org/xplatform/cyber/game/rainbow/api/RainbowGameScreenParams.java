package org.xplatform.cyber.game.rainbow.api;

import a.brm0;
import a.d860;
import a.f140;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RainbowGameScreenParams implements Parcelable {
    public static final Parcelable.Creator<RainbowGameScreenParams> CREATOR = new d860((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46520a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;
    public final long h;
    public final int i;
    public final k1g j;

    public RainbowGameScreenParams(int i, long j, long j2, long j3, long j4, long j5, k1g k1gVar, String str, boolean z, boolean z2) {
        str.getClass();
        k1gVar.getClass();
        this.f46520a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z2;
        this.g = str;
        this.h = j5;
        this.i = i;
        this.j = k1gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RainbowGameScreenParams)) {
            return false;
        }
        RainbowGameScreenParams rainbowGameScreenParams = (RainbowGameScreenParams) obj;
        return this.f46520a == rainbowGameScreenParams.f46520a && this.b == rainbowGameScreenParams.b && this.c == rainbowGameScreenParams.c && this.d == rainbowGameScreenParams.d && this.e == rainbowGameScreenParams.e && this.f == rainbowGameScreenParams.f && Intrinsics.d(this.g, rainbowGameScreenParams.g) && this.h == rainbowGameScreenParams.h && this.i == rainbowGameScreenParams.i && this.j == rainbowGameScreenParams.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + twn.a(this.i, rw2.b(ua80.b(brm0.e(rw2.b(rw2.b(rw2.b(brm0.e(Long.hashCode(this.f46520a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46520a, "RainbowGameScreenParams(gameId=", ", live=", this.b);
        kng0.A(sbR, ", subGameId=", this.c, ", subSportId=");
        sbR.append(this.d);
        kng0.A(sbR, ", sportId=", this.e, ", forceVideoPlayback=");
        f140.s(", champName=", this.g, ", champId=", sbR, this.f);
        ua80.v(sbR, this.h, ", globalChampId=", this.i);
        sbR.append(", openScreenSubType=");
        sbR.append(this.j);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46520a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j.name());
    }
}
