package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hlr extends klr {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final CharSequence D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13276a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final ArrayList i;
    public final long j;
    public final String k;
    public final boolean l;
    public final tnq0 m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final d0t s;
    public final long t;
    public final boolean u;
    public final eus v;
    public final eus w;
    public final boolean x;
    public final String y;
    public final boolean z;

    public hlr(long j, long j2, long j3, String str, String str2, long j4, long j5, ArrayList arrayList, ArrayList arrayList2, long j6, String str3, boolean z, tnq0 tnq0Var, String str4, boolean z2, boolean z3, boolean z4, boolean z5, d0t d0tVar, boolean z6, eus eusVar, eus eusVar2, boolean z7, String str5, boolean z8, boolean z9, boolean z10, String str6, CharSequence charSequence) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        str.getClass();
        str5.getClass();
        this.f13276a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = j4;
        this.g = j5;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = j6;
        this.k = str3;
        this.l = z;
        this.m = tnq0Var;
        this.n = str4;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = d0tVar;
        this.t = jCurrentTimeMillis;
        this.u = z6;
        this.v = eusVar;
        this.w = eusVar2;
        this.x = z7;
        this.y = str5;
        this.z = z8;
        this.A = z9;
        this.B = z10;
        this.C = str6;
        this.D = charSequence;
    }

    @Override // a.klr
    public final boolean a(String str) {
        str.getClass();
        return StringsKt.O(this.d, str, true) || StringsKt.O(this.n, str, true) || StringsKt.O(this.v.b, str, true) || StringsKt.O(this.w.b, str, true);
    }

    @Override // a.klr
    public final String b() {
        return this.n;
    }

    @Override // a.klr
    public final String c() {
        return this.d;
    }

    @Override // a.klr
    public final boolean d() {
        return this.r;
    }

    @Override // a.klr
    public final boolean e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlr)) {
            return false;
        }
        hlr hlrVar = (hlr) obj;
        return this.f13276a == hlrVar.f13276a && this.b == hlrVar.b && this.c == hlrVar.c && Intrinsics.d(this.d, hlrVar.d) && this.e.equals(hlrVar.e) && this.f == hlrVar.f && this.g == hlrVar.g && this.h.equals(hlrVar.h) && this.i.equals(hlrVar.i) && this.j == hlrVar.j && this.k.equals(hlrVar.k) && this.l == hlrVar.l && this.m.equals(hlrVar.m) && this.n.equals(hlrVar.n) && this.o == hlrVar.o && this.p == hlrVar.p && this.q == hlrVar.q && this.r == hlrVar.r && this.s.equals(hlrVar.s) && this.t == hlrVar.t && this.u == hlrVar.u && this.v.equals(hlrVar.v) && this.w.equals(hlrVar.w) && this.x == hlrVar.x && Intrinsics.d(this.y, hlrVar.y) && this.z == hlrVar.z && this.A == hlrVar.A && this.B == hlrVar.B && this.C.equals(hlrVar.C) && this.D.equals(hlrVar.D);
    }

    @Override // a.klr
    public final String f() {
        return this.k;
    }

    @Override // a.klr
    public final long g() {
        return this.j;
    }

    @Override // a.klr
    public final d0t h() {
        return this.s;
    }

    @Override // a.klr
    public final int hashCode() {
        return this.D.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e((this.w.hashCode() + ((this.v.hashCode() + brm0.e(rw2.b((this.s.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b((this.m.hashCode() + brm0.e(ua80.b(rw2.b(twn.g(this.i, twn.g(this.h, rw2.b(rw2.b(ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f13276a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r)) * 31, 31, this.t), 31, this.u)) * 31)) * 31, 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C);
    }

    @Override // a.klr
    public final boolean i() {
        return this.p;
    }

    @Override // a.klr
    public final boolean j() {
        return this.o;
    }

    @Override // a.klr
    public final long k() {
        return this.f13276a;
    }

    @Override // a.klr
    public final long l() {
        return this.c;
    }

    @Override // a.klr
    public final long m() {
        return this.f;
    }

    @Override // a.klr
    public final boolean n() {
        return this.q;
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f13276a, "TwoTeamGame(id=", ", mainId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", champName=");
        f140.v(sbQ, this.d, ", matchName=", this.e, ", startTime=");
        sbQ.append(this.f);
        kng0.A(sbQ, ", timeBeforeStart=", this.g, ", subGames=");
        sbQ.append(this.h);
        sbQ.append(", betEventsGroups=");
        sbQ.append(this.i);
        sbQ.append(", gamePeriodTime=");
        kng0.z(sbQ, this.j, ", gamePeriodName=", this.k);
        sbQ.append(", gameFinished=");
        sbQ.append(this.l);
        sbQ.append(", timerType=");
        sbQ.append(this.m);
        w6x.z(", anyInfo=", this.n, ", hasVideo=", sbQ, this.o);
        w6x.A(", hasNotification=", ", subscribed=", sbQ, this.p, this.q);
        sbQ.append(", favorite=");
        sbQ.append(this.r);
        sbQ.append(", gameZip=");
        sbQ.append(this.s);
        kng0.A(sbQ, ", fetchRequestTime=", this.t, ", cyber=");
        sbQ.append(this.u);
        sbQ.append(", teamOne=");
        sbQ.append(this.v);
        sbQ.append(", teamTwo=");
        sbQ.append(this.w);
        sbQ.append(", teamMultiIcon=");
        sbQ.append(this.x);
        sbQ.append(", gameScore=");
        brm0.C(this.y, ", firstScoreChanged=", ", secondScoreChanged=", sbQ, this.z);
        ua80.u(", hasHostGuest=", ", periodFullScore=", sbQ, this.A, this.B);
        sbQ.append(this.C);
        sbQ.append(", gameSubtitle=");
        sbQ.append((Object) this.D);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
