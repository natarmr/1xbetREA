package org.xplatform.cyber.game.rainbow.api;

import a.axq;
import a.d860;
import a.f140;
import a.kng0;
import a.ohs0;
import a.rw2;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RainbowPostGameScreenParams implements Parcelable {
    public static final Parcelable.Creator<RainbowPostGameScreenParams> CREATOR = new d860((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46521a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;

    public RainbowPostGameScreenParams(String str, long j, int i, int i2, String str2, String str3, String str4, String str5, long j2, String str6) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f46521a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = j2;
        this.j = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RainbowPostGameScreenParams)) {
            return false;
        }
        RainbowPostGameScreenParams rainbowPostGameScreenParams = (RainbowPostGameScreenParams) obj;
        return Intrinsics.d(this.f46521a, rainbowPostGameScreenParams.f46521a) && this.b == rainbowPostGameScreenParams.b && this.c == rainbowPostGameScreenParams.c && this.d == rainbowPostGameScreenParams.d && Intrinsics.d(this.e, rainbowPostGameScreenParams.e) && Intrinsics.d(this.f, rainbowPostGameScreenParams.f) && Intrinsics.d(this.g, rainbowPostGameScreenParams.g) && Intrinsics.d(this.h, rainbowPostGameScreenParams.h) && this.i == rainbowPostGameScreenParams.i && Intrinsics.d(this.j, rainbowPostGameScreenParams.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.d, twn.a(this.c, rw2.b(this.f46521a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "RainbowPostGameScreenParams(statId=", this.f46521a, ", subSportId=");
        rw2.s(this.c, this.d, ", selectedMapIndex=", ", globalChampId=", sbO);
        f140.v(sbO, ", firstTeamName=", this.e, ", secondTeamName=", this.f);
        f140.v(sbO, ", firstTeamImage=", this.g, ", secondTeamImage=", this.h);
        kng0.A(sbO, ", startDateMs=", this.i, ", score=");
        return axq.n(sbO, this.j, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46521a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
        parcel.writeString(this.j);
    }
}
