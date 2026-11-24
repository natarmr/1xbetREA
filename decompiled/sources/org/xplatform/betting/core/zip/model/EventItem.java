package org.xplatform.betting.core.zip.model;

import a.axq;
import a.brm0;
import a.dw9;
import a.f140;
import a.h9g;
import a.hne;
import a.kng0;
import a.lvn;
import a.ohs0;
import a.q4f;
import a.rw2;
import a.rz4;
import a.twn;
import a.ua80;
import a.vqd;
import a.w6x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.EventParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/EventItem;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventItem implements Parcelable {
    public static final Parcelable.Creator<EventItem> CREATOR = new h9g((byte) 28);
    public final boolean A;
    public final q4f B;
    public final String Y;
    public final String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46424a;
    public final String b;
    public final double c;
    public final String d;
    public final long e;
    public final boolean f;
    public final String f1;
    public final long g;
    public final double g1;
    public final long h;
    public final long h1;
    public final String i;
    public final long i1;
    public final lvn j;
    public final String j1;
    public final boolean k;
    public final int k1;
    public final String l;
    public final double l1;
    public final long m;
    public final EventParams m1;
    public final List n;
    public final String o;
    public final long p;
    public final List q;
    public final String r;
    public final long s;
    public final String t;
    public final int u;
    public final String v;
    public final long w;
    public final int x;
    public final double y;
    public final String z;

    public EventItem(long j, String str, double d, String str2, long j2, boolean z, long j3, long j4, String str3, lvn lvnVar, boolean z2, String str4, long j5, List list, String str5, long j6, List list2, String str6, long j7, String str7, int i, String str8, long j8, int i2, double d2, String str9, boolean z3, q4f q4fVar, String str10, String str11, String str12, double d3, long j9, long j10, String str13, int i3, double d4, EventParams eventParams) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        lvnVar.getClass();
        str4.getClass();
        list.getClass();
        str5.getClass();
        list2.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        q4fVar.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        eventParams.getClass();
        this.f46424a = j;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j2;
        this.f = z;
        this.g = j3;
        this.h = j4;
        this.i = str3;
        this.j = lvnVar;
        this.k = z2;
        this.l = str4;
        this.m = j5;
        this.n = list;
        this.o = str5;
        this.p = j6;
        this.q = list2;
        this.r = str6;
        this.s = j7;
        this.t = str7;
        this.u = i;
        this.v = str8;
        this.w = j8;
        this.x = i2;
        this.y = d2;
        this.z = str9;
        this.A = z3;
        this.B = q4fVar;
        this.Y = str10;
        this.Z = str11;
        this.f1 = str12;
        this.g1 = d3;
        this.h1 = j9;
        this.i1 = j10;
        this.j1 = str13;
        this.k1 = i3;
        this.l1 = d4;
        this.m1 = eventParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventItem)) {
            return false;
        }
        EventItem eventItem = (EventItem) obj;
        return this.f46424a == eventItem.f46424a && Intrinsics.d(this.b, eventItem.b) && Double.compare(this.c, eventItem.c) == 0 && Intrinsics.d(this.d, eventItem.d) && this.e == eventItem.e && this.f == eventItem.f && this.g == eventItem.g && this.h == eventItem.h && Intrinsics.d(this.i, eventItem.i) && this.j == eventItem.j && this.k == eventItem.k && Intrinsics.d(this.l, eventItem.l) && this.m == eventItem.m && Intrinsics.d(this.n, eventItem.n) && Intrinsics.d(this.o, eventItem.o) && this.p == eventItem.p && Intrinsics.d(this.q, eventItem.q) && Intrinsics.d(this.r, eventItem.r) && this.s == eventItem.s && Intrinsics.d(this.t, eventItem.t) && this.u == eventItem.u && Intrinsics.d(this.v, eventItem.v) && this.w == eventItem.w && this.x == eventItem.x && Double.compare(this.y, eventItem.y) == 0 && Intrinsics.d(this.z, eventItem.z) && this.A == eventItem.A && this.B == eventItem.B && Intrinsics.d(this.Y, eventItem.Y) && Intrinsics.d(this.Z, eventItem.Z) && Intrinsics.d(this.f1, eventItem.f1) && Double.compare(this.g1, eventItem.g1) == 0 && this.h1 == eventItem.h1 && this.i1 == eventItem.i1 && Intrinsics.d(this.j1, eventItem.j1) && this.k1 == eventItem.k1 && Double.compare(this.l1, eventItem.l1) == 0 && Intrinsics.d(this.m1, eventItem.m1);
    }

    public final int hashCode() {
        return this.m1.hashCode() + brm0.d(this.l1, twn.a(this.k1, ua80.b(rw2.b(rw2.b(brm0.d(this.g1, ua80.b(ua80.b(ua80.b(vqd.b(this.B, brm0.e(ua80.b(brm0.d(this.y, twn.a(this.x, rw2.b(ua80.b(twn.a(this.u, ua80.b(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b(dw9.a(rw2.b(ua80.b(brm0.e((this.j.hashCode() + ua80.b(rw2.b(rw2.b(brm0.e(rw2.b(ua80.b(brm0.d(this.c, ua80.b(Long.hashCode(this.f46424a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31), 31, this.v), 31, this.w), 31), 31), 31, this.z), 31, this.A), 31), 31, this.Y), 31, this.Z), 31, this.f1), 31), 31, this.h1), 31, this.i1), 31, this.j1), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f46424a, "EventItem(champId=", ", champName=", this.b);
        ohs0.A(sbO, this.c, ", coefficient=", ", coefficientString=");
        c.i(sbO, this.e, this.d, ", dateStart=");
        rz4.A(sbO, ", finish=", this.f, ", mainGameId=");
        sbO.append(this.g);
        kng0.A(sbO, ", gameId=", this.h, ", gameName=");
        sbO.append(this.i);
        sbO.append(", status=");
        sbO.append(this.j);
        sbO.append(", live=");
        f140.s(", teamOne=", this.l, ", teamOneId=", sbO, this.k);
        hne.x(sbO, this.m, ", teamOneImageList=", this.n);
        hne.B(sbO, ", teamSecond=", this.o, ", teamSecondId=");
        hne.x(sbO, this.p, ", teamSecondImageList=", this.q);
        hne.B(sbO, ", score=", this.r, ", sportId=");
        kng0.z(sbO, this.s, ", typeEventName=", this.t);
        w6x.w(this.u, ", typeEventId=", ", periodName=", this.v, sbO);
        kng0.A(sbO, ", liveTime=", this.w, ", blockLevel=");
        sbO.append(this.x);
        sbO.append(", blockValue=");
        sbO.append(this.y);
        w6x.z(", currency=", this.z, ", hasAlternativeInfo=", sbO, this.A);
        sbO.append(", type=");
        sbO.append(this.B);
        sbO.append(", additionalGameInfo=");
        sbO.append(this.Y);
        f140.v(sbO, ", gameVidName=", this.Z, ", gameTypeName=", this.f1);
        ohs0.A(sbO, this.g1, ", betEventParam=", ", groupId=");
        sbO.append(this.h1);
        kng0.A(sbO, ", playerId=", this.i1, ", playerName=");
        twn.w(this.k1, this.j1, ", subSportId=", ", total=", sbO);
        sbO.append(this.l1);
        sbO.append(", eventParams=");
        sbO.append(this.m1);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46424a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j.name());
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
        parcel.writeLong(this.m);
        parcel.writeStringList(this.n);
        parcel.writeString(this.o);
        parcel.writeLong(this.p);
        parcel.writeStringList(this.q);
        parcel.writeString(this.r);
        parcel.writeLong(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeLong(this.w);
        parcel.writeInt(this.x);
        parcel.writeDouble(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeString(this.B.name());
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f1);
        parcel.writeDouble(this.g1);
        parcel.writeLong(this.h1);
        parcel.writeLong(this.i1);
        parcel.writeString(this.j1);
        parcel.writeInt(this.k1);
        parcel.writeDouble(this.l1);
        this.m1.writeToParcel(parcel, i);
    }
}
