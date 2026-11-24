package org.xplatform.betting.core.zip.model.zip;

import a.brm0;
import a.hne;
import a.izc;
import a.kng0;
import a.qo7;
import a.rw2;
import a.rz4;
import a.ua80;
import a.uoy;
import a.w6x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/BetZip;", "Landroid/os/Parcelable;", "a/y860", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetZip implements Parcelable {
    public static final Parcelable.Creator<BetZip> CREATOR = new qo7((byte) 1);
    public final String A;
    public final boolean B;
    public final boolean Y;
    public final String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46426a;
    public final double b;
    public final long c;
    public final double d;
    public final String e;
    public final boolean f;
    public final boolean f1;
    public final String g;
    public final boolean g1;
    public final String h;
    public final boolean h1;
    public final BetPlayerZip i;
    public final EventParams i1;
    public final int j;
    public final long k;
    public final uoy l;
    public final long m;
    public final int n;
    public final long o;
    public final boolean p;
    public final long q;
    public final boolean r;
    public final PlayersDuelZip s;
    public final String t;
    public final String u;
    public final izc v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public BetZip(long j, double d, long j2, double d2, String str, boolean z, String str2, String str3, BetPlayerZip betPlayerZip, int i, long j3, uoy uoyVar, long j4, int i2, long j5, boolean z2, long j6, boolean z3, PlayersDuelZip playersDuelZip, String str4, String str5, izc izcVar, boolean z4, boolean z5, boolean z6, boolean z7, String str6, boolean z8, boolean z9, String str7, boolean z10, boolean z11, boolean z12, EventParams eventParams) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        betPlayerZip.getClass();
        uoyVar.getClass();
        playersDuelZip.getClass();
        str4.getClass();
        str5.getClass();
        izcVar.getClass();
        str6.getClass();
        str7.getClass();
        eventParams.getClass();
        this.f46426a = j;
        this.b = d;
        this.c = j2;
        this.d = d2;
        this.e = str;
        this.f = z;
        this.g = str2;
        this.h = str3;
        this.i = betPlayerZip;
        this.j = i;
        this.k = j3;
        this.l = uoyVar;
        this.m = j4;
        this.n = i2;
        this.o = j5;
        this.p = z2;
        this.q = j6;
        this.r = z3;
        this.s = playersDuelZip;
        this.t = str4;
        this.u = str5;
        this.v = izcVar;
        this.w = z4;
        this.x = z5;
        this.y = z6;
        this.z = z7;
        this.A = str6;
        this.B = z8;
        this.Y = z9;
        this.Z = str7;
        this.f1 = z10;
        this.g1 = z11;
        this.h1 = z12;
        this.i1 = eventParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BetZip.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        BetZip betZip = (BetZip) obj;
        return this.f46426a == betZip.f46426a && this.c == betZip.c && this.d == betZip.d && Intrinsics.d(this.i, betZip.i) && this.b == betZip.b && Intrinsics.d(this.g, betZip.g) && Intrinsics.d(this.t, betZip.t) && this.v == betZip.v && this.w == betZip.w && this.y == betZip.y && this.f == betZip.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((((this.i.hashCode() + ((this.v.hashCode() + ua80.b((brm0.d(this.d, ((((int) this.f46426a) * 31) + ((int) this.c)) * 31, 31) + ((int) this.b)) * 31, 31, this.t)) * 31)) * 31) + (this.y ? 31 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46426a, "BetZip(id=", ", coef=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", groupId=", this.c, ", param=");
        hne.w(sbQ, this.d, ", paramStr=", this.e);
        hne.u(", blocked=", ", coefV=", this.g, sbQ, this.f);
        sbQ.append(", marketName=");
        sbQ.append(this.h);
        sbQ.append(", player=");
        sbQ.append(this.i);
        rw2.x(sbQ, ", eventId=", this.j, ", marketId=");
        sbQ.append(this.k);
        sbQ.append(", kind=");
        sbQ.append(this.l);
        kng0.A(sbQ, ", gameId=", this.m, ", relation=");
        sbQ.append(this.n);
        sbQ.append(", playerId=");
        sbQ.append(this.o);
        rz4.A(sbQ, ", gameFinished=", this.p, ", subSportId=");
        hne.t(this.q, ", bannedExpress=", sbQ, this.r);
        sbQ.append(", playersDuelZip=");
        sbQ.append(this.s);
        sbQ.append(", name=");
        sbQ.append(this.t);
        sbQ.append(", groupName=");
        sbQ.append(this.u);
        sbQ.append(", coefState=");
        sbQ.append(this.v);
        w6x.A(", isTracked=", ", startingPrice=", sbQ, this.w, this.x);
        w6x.A(", addedToCoupon=", ", isEmptyCoef=", sbQ, this.y, this.z);
        w6x.z(", playerName=", this.A, ", isRelation=", sbQ, this.B);
        hne.u(", notValid=", ", paramName=", this.Z, sbQ, this.Y);
        w6x.A(", isCanBet=", ", center=", sbQ, this.f1, this.g1);
        sbQ.append(", specialSign=");
        sbQ.append(this.h1);
        sbQ.append(", eventParams=");
        sbQ.append(this.i1);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46426a);
        parcel.writeDouble(this.b);
        parcel.writeLong(this.c);
        parcel.writeDouble(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        this.i.writeToParcel(parcel, i);
        parcel.writeInt(this.j);
        parcel.writeLong(this.k);
        parcel.writeString(this.l.name());
        parcel.writeLong(this.m);
        parcel.writeInt(this.n);
        parcel.writeLong(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r ? 1 : 0);
        this.s.writeToParcel(parcel, i);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v.name());
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeString(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeString(this.Z);
        parcel.writeInt(this.f1 ? 1 : 0);
        parcel.writeInt(this.g1 ? 1 : 0);
        parcel.writeInt(this.h1 ? 1 : 0);
        this.i1.writeToParcel(parcel, i);
    }
}
