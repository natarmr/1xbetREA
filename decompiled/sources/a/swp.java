package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class swp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32932a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final long o;
    public final String p;
    public final Map q;
    public final int r;
    public final int s;
    public final String t;
    public final boolean u;
    public final int v;

    public swp(long j, long j2, long j3, String str, String str2, String str3, List list, List list2, List list3, List list4, String str4, String str5, String str6, List list5, long j4, String str7, Map map, int i, int i2, String str8, boolean z, int i3) {
        rz4.B(list, list2, list3, list4, list5);
        this.f32932a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = list4;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = list5;
        this.o = j4;
        this.p = str7;
        this.q = map;
        this.r = i;
        this.s = i2;
        this.t = str8;
        this.u = z;
        this.v = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swp)) {
            return false;
        }
        swp swpVar = (swp) obj;
        return this.f32932a == swpVar.f32932a && this.b == swpVar.b && this.c == swpVar.c && this.d.equals(swpVar.d) && this.e.equals(swpVar.e) && this.f.equals(swpVar.f) && Intrinsics.d(this.g, swpVar.g) && Intrinsics.d(this.h, swpVar.h) && Intrinsics.d(this.i, swpVar.i) && Intrinsics.d(this.j, swpVar.j) && this.k.equals(swpVar.k) && this.l.equals(swpVar.l) && this.m.equals(swpVar.m) && Intrinsics.d(this.n, swpVar.n) && this.o == swpVar.o && this.p.equals(swpVar.p) && this.q.equals(swpVar.q) && this.r == swpVar.r && this.s == swpVar.s && this.t.equals(swpVar.t) && this.u == swpVar.u && this.v == swpVar.v;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + brm0.e(ua80.b(twn.a(this.s, twn.a(this.r, ohs0.f(this.q, ua80.b(rw2.b(dw9.a(ua80.b(ua80.b(ua80.b(dw9.a(dw9.a(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f32932a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), 31), 31), 31, this.t), 31, this.u);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32932a, "FighterResultsModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champName=");
        f140.v(sbQ, this.d, ", firstOpponentName=", this.e, ", secondOpponentName=");
        cs0.y(this.f, ", firstOpponentImageList=", ", secondOpponentImageList=", sbQ, this.g);
        b1j.y(", firstOpponentIds=", ", secondOpponentIds=", sbQ, this.h, this.i);
        h97.y(", scoreBase=", this.k, ", scoreAdd=", sbQ, this.j);
        f140.v(sbQ, this.l, ", dopInfo=", this.m, ", videos=");
        sbQ.append(this.n);
        sbQ.append(", dateStart=");
        sbQ.append(this.o);
        sbQ.append(", status=");
        sbQ.append(this.p);
        sbQ.append(", matchInfos=");
        sbQ.append(this.q);
        rw2.s(this.r, this.s, ", stadiumId=", ", globalChampId=", sbQ);
        w6x.z(", statId=", this.t, ", homeAwayFlag=", sbQ, this.u);
        return vqd.p(sbQ, ", matchStatus=", this.v, Separators.RPAREN);
    }
}
