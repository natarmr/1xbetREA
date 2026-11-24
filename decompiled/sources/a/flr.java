package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class flr extends klr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9753a;
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
    public final String t;
    public final long u;
    public final boolean v;

    public flr(long j, long j2, long j3, String str, String str2, long j4, long j5, ArrayList arrayList, ArrayList arrayList2, long j6, String str3, boolean z, tnq0 tnq0Var, String str4, boolean z2, boolean z3, boolean z4, boolean z5, d0t d0tVar, String str5, boolean z6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        str.getClass();
        str5.getClass();
        this.f9753a = j;
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
        this.t = str5;
        this.u = jCurrentTimeMillis;
        this.v = z6;
    }

    @Override // a.klr
    public final boolean a(String str) {
        str.getClass();
        return StringsKt.O(this.d, str, true) || StringsKt.O(this.t, str, true);
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
        Object next;
        flr flrVar = obj instanceof flr ? (flr) obj : null;
        if (flrVar == null) {
            return false;
        }
        ArrayList arrayList = flrVar.i;
        ArrayList arrayList2 = flrVar.h;
        if (this.f9753a != flrVar.f9753a || this.c != flrVar.c || !Intrinsics.d(this.d, flrVar.d) || this.f != flrVar.f) {
            return false;
        }
        ArrayList arrayList3 = this.h;
        if (arrayList3.size() != arrayList2.size() || !arrayList3.containsAll(arrayList2)) {
            return false;
        }
        ArrayList<wv6> arrayList4 = this.i;
        if (arrayList4.size() != arrayList.size()) {
            return false;
        }
        for (wv6 wv6Var : arrayList4) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                wv6 wv6Var2 = (wv6) next;
                if (wv6Var2.f39826a == wv6Var.f39826a && Intrinsics.d(wv6Var2.b, wv6Var.b) && wv6Var2.c.equals(wv6Var.c)) {
                    break;
                }
            }
            if (((wv6) next) == null) {
                return false;
            }
        }
        return this.j == flrVar.j && this.k.equals(flrVar.k) && this.l == flrVar.l && this.n.equals(flrVar.n) && this.o == flrVar.o && this.p == flrVar.p && this.q == flrVar.q && this.r == flrVar.r && Intrinsics.d(this.t, flrVar.t);
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
        return this.t.hashCode() + (super.hashCode() * 31);
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
        return this.f9753a;
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
        StringBuilder sbQ = kng0.q(this.f9753a, "SimpleGame(id=", ", mainId=");
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
        hne.B(sbQ, ", gameTitle=", this.t, ", fetchRequestTime=");
        hne.t(this.u, ", cyber=", sbQ, this.v);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
