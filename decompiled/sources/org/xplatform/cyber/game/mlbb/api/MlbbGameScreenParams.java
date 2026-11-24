package org.xplatform.cyber.game.mlbb.api;

import a.brm0;
import a.grs;
import a.imw;
import a.k1g;
import a.kng0;
import a.rw2;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/mlbb/api/MlbbGameScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MlbbGameScreenParams implements Parcelable {
    public static final Parcelable.Creator<MlbbGameScreenParams> CREATOR = new imw((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46517a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final grs f;
    public final boolean g;
    public final String h;
    public final long i;
    public final int j;
    public final k1g k;

    public MlbbGameScreenParams(long j, boolean z, long j2, long j3, long j4, grs grsVar, boolean z2, String str, long j5, int i, k1g k1gVar) {
        grsVar.getClass();
        str.getClass();
        k1gVar.getClass();
        this.f46517a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = grsVar;
        this.g = z2;
        this.h = str;
        this.i = j5;
        this.j = i;
        this.k = k1gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MlbbGameScreenParams)) {
            return false;
        }
        MlbbGameScreenParams mlbbGameScreenParams = (MlbbGameScreenParams) obj;
        return this.f46517a == mlbbGameScreenParams.f46517a && this.b == mlbbGameScreenParams.b && this.c == mlbbGameScreenParams.c && this.d == mlbbGameScreenParams.d && this.e == mlbbGameScreenParams.e && this.f == mlbbGameScreenParams.f && this.g == mlbbGameScreenParams.g && Intrinsics.d(this.h, mlbbGameScreenParams.h) && this.i == mlbbGameScreenParams.i && this.j == mlbbGameScreenParams.j && this.k == mlbbGameScreenParams.k;
    }

    public final int hashCode() {
        return this.k.hashCode() + twn.a(this.j, rw2.b(ua80.b(brm0.e((this.f.hashCode() + rw2.b(rw2.b(rw2.b(brm0.e(Long.hashCode(this.f46517a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46517a, "MlbbGameScreenParams(gameId=", ", live=", this.b);
        kng0.A(sbR, ", subGameId=", this.c, ", subSportId=");
        sbR.append(this.d);
        kng0.A(sbR, ", sportId=", this.e, ", gameScreenInitialAction=");
        sbR.append(this.f);
        sbR.append(", forceVideoPlayback=");
        sbR.append(this.g);
        sbR.append(", champName=");
        c.i(sbR, this.i, this.h, ", champId=");
        sbR.append(", globalChampId=");
        sbR.append(this.j);
        sbR.append(", openScreenSubType=");
        sbR.append(this.k);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46517a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k.name());
    }
}
