package org.xplatform.cyber.game.valorant.api;

import a.brm0;
import a.hne;
import a.k1g;
import a.kng0;
import a.rdr0;
import a.rw2;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ValorantGameScreenParams implements Parcelable {
    public static final Parcelable.Creator<ValorantGameScreenParams> CREATOR = new rdr0((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46542a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final String g;
    public final long h;
    public final int i;
    public final k1g j;

    public ValorantGameScreenParams(int i, long j, long j2, long j3, long j4, long j5, k1g k1gVar, String str, boolean z, boolean z2) {
        str.getClass();
        k1gVar.getClass();
        this.f46542a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
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
        if (!(obj instanceof ValorantGameScreenParams)) {
            return false;
        }
        ValorantGameScreenParams valorantGameScreenParams = (ValorantGameScreenParams) obj;
        return this.f46542a == valorantGameScreenParams.f46542a && this.b == valorantGameScreenParams.b && this.c == valorantGameScreenParams.c && this.d == valorantGameScreenParams.d && this.e == valorantGameScreenParams.e && this.f == valorantGameScreenParams.f && Intrinsics.d(this.g, valorantGameScreenParams.g) && this.h == valorantGameScreenParams.h && this.i == valorantGameScreenParams.i && this.j == valorantGameScreenParams.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + twn.a(this.i, rw2.b(ua80.b(brm0.e(rw2.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f46542a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46542a, "ValorantGameScreenParams(gameId=", ", subGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", live=");
        rw2.v(this.e, ", sportId=", sbQ, this.d);
        hne.u(", forceVideoPlayback=", ", champName=", this.g, sbQ, this.f);
        kng0.A(sbQ, ", champId=", this.h, ", globalChampId=");
        sbQ.append(this.i);
        sbQ.append(", openScreenSubType=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46542a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j.name());
    }
}
