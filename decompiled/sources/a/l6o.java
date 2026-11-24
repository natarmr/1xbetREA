package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.universal.api.EsportsUniversalScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class l6o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsportsUniversalScreenParams f19516a;
    public final gps b;
    public final jlr c;
    public final tdt0 d;
    public final ypl0 e;
    public final bqr f;
    public final xus g;
    public final boolean h;
    public final boolean i;
    public final da10 j;
    public final boolean k;
    public final boolean l;
    public final List m;
    public final long n;
    public final String o;
    public final sff0 p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final yws u;
    public final szj0 v;
    public final boolean w;
    public final long x;
    public final boolean y;
    public final boolean z;

    public l6o(EsportsUniversalScreenParams esportsUniversalScreenParams, gps gpsVar, jlr jlrVar, tdt0 tdt0Var, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, boolean z2, da10 da10Var, boolean z3, boolean z4, List list, long j, String str, sff0 sff0Var, List list2, boolean z5, boolean z6, boolean z7, yws ywsVar, szj0 szj0Var, boolean z8, long j2, boolean z9, boolean z10) {
        list.getClass();
        str.getClass();
        list2.getClass();
        this.f19516a = esportsUniversalScreenParams;
        this.b = gpsVar;
        this.c = jlrVar;
        this.d = tdt0Var;
        this.e = ypl0Var;
        this.f = bqrVar;
        this.g = xusVar;
        this.h = z;
        this.i = z2;
        this.j = da10Var;
        this.k = z3;
        this.l = z4;
        this.m = list;
        this.n = j;
        this.o = str;
        this.p = sff0Var;
        this.q = list2;
        this.r = z5;
        this.s = z6;
        this.t = z7;
        this.u = ywsVar;
        this.v = szj0Var;
        this.w = z8;
        this.x = j2;
        this.y = z9;
        this.z = z10;
    }

    public static l6o a(l6o l6oVar, gps gpsVar, jlr jlrVar, tdt0 tdt0Var, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, List list, boolean z2, boolean z3, yws ywsVar, szj0 szj0Var, long j, boolean z4, int i) {
        EsportsUniversalScreenParams esportsUniversalScreenParams = l6oVar.f19516a;
        gps gpsVar2 = (i & 2) != 0 ? l6oVar.b : gpsVar;
        jlr jlrVar2 = (i & 4) != 0 ? l6oVar.c : jlrVar;
        tdt0 tdt0Var2 = (i & 8) != 0 ? l6oVar.d : tdt0Var;
        ypl0 ypl0Var2 = (i & 16) != 0 ? l6oVar.e : ypl0Var;
        bqr bqrVar2 = (i & 32) != 0 ? l6oVar.f : bqrVar;
        xus xusVar2 = (i & 64) != 0 ? l6oVar.g : xusVar;
        boolean z5 = l6oVar.h;
        boolean z6 = (i & 256) != 0 ? l6oVar.i : false;
        da10 da10Var = l6oVar.j;
        gps gpsVar3 = gpsVar2;
        jlr jlrVar3 = jlrVar2;
        tdt0 tdt0Var3 = tdt0Var2;
        ypl0 ypl0Var3 = ypl0Var2;
        bqr bqrVar3 = bqrVar2;
        xus xusVar3 = xusVar2;
        boolean z7 = z6;
        boolean z8 = l6oVar.k;
        boolean z9 = (i & 2048) != 0 ? l6oVar.l : z;
        List list2 = (i & 4096) != 0 ? l6oVar.m : list;
        long j2 = l6oVar.n;
        String str = l6oVar.o;
        sff0 sff0Var = l6oVar.p;
        List list3 = l6oVar.q;
        boolean z10 = (i & 131072) != 0 ? l6oVar.r : z2;
        boolean z11 = l6oVar.s;
        boolean z12 = (i & 524288) != 0 ? l6oVar.t : z3;
        yws ywsVar2 = (i & 1048576) != 0 ? l6oVar.u : ywsVar;
        szj0 szj0Var2 = (i & 2097152) != 0 ? l6oVar.v : szj0Var;
        boolean z13 = l6oVar.w;
        long j3 = (i & 8388608) != 0 ? l6oVar.x : j;
        boolean z14 = (i & 16777216) != 0 ? l6oVar.y : z4;
        boolean z15 = l6oVar.z;
        l6oVar.getClass();
        ypl0Var3.getClass();
        bqrVar3.getClass();
        list2.getClass();
        str.getClass();
        list3.getClass();
        return new l6o(esportsUniversalScreenParams, gpsVar3, jlrVar3, tdt0Var3, ypl0Var3, bqrVar3, xusVar3, z5, z7, da10Var, z8, z9, list2, j2, str, sff0Var, list3, z10, z11, z12, ywsVar2, szj0Var2, z13, j3, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6o)) {
            return false;
        }
        l6o l6oVar = (l6o) obj;
        return this.f19516a.equals(l6oVar.f19516a) && this.b.equals(l6oVar.b) && this.c.equals(l6oVar.c) && Intrinsics.d(this.d, l6oVar.d) && this.e.equals(l6oVar.e) && this.f.equals(l6oVar.f) && this.g.equals(l6oVar.g) && this.h == l6oVar.h && this.i == l6oVar.i && this.j == l6oVar.j && this.k == l6oVar.k && this.l == l6oVar.l && Intrinsics.d(this.m, l6oVar.m) && this.n == l6oVar.n && Intrinsics.d(this.o, l6oVar.o) && this.p.equals(l6oVar.p) && Intrinsics.d(this.q, l6oVar.q) && this.r == l6oVar.r && this.s == l6oVar.s && this.t == l6oVar.t && Intrinsics.d(this.u, l6oVar.u) && Intrinsics.d(this.v, l6oVar.v) && this.w == l6oVar.w && this.x == l6oVar.x && this.y == l6oVar.y && this.z == l6oVar.z;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f19516a.hashCode() * 31)) * 31)) * 31;
        tdt0 tdt0Var = this.d;
        int iE = brm0.e(brm0.e(brm0.e(dw9.a(cs0.c(this.p, ua80.b(rw2.b(dw9.a(brm0.e(brm0.e((this.j.hashCode() + brm0.e(brm0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (tdt0Var == null ? 0 : tdt0Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
        yws ywsVar = this.u;
        int iHashCode2 = (iE + (ywsVar == null ? 0 : ywsVar.hashCode())) * 31;
        szj0 szj0Var = this.v;
        return Boolean.hashCode(this.z) + brm0.e(rw2.b(brm0.e((iHashCode2 + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31, 31, this.w), 31, this.x), 31, this.y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsportsUniversalState(params=");
        sb.append(this.f19516a);
        sb.append(", gameRequestState=");
        sb.append(this.b);
        sb.append(", game=");
        sb.append(this.c);
        sb.append(", statistic=");
        sb.append(this.d);
        sb.append(", sportSimpleModel=");
        sb.append(this.e);
        sb.append(", gameBackgroundModel=");
        sb.append(this.f);
        sb.append(", gameToolbarState=");
        sb.append(this.g);
        sb.append(", bettingDisabled=");
        sb.append(this.h);
        sb.append(", resetScroll=");
        sb.append(this.i);
        sb.append(", lottieButtonState=");
        sb.append(this.j);
        sb.append(", quickBetVisible=");
        ua80.u(", quickBetEnabled=", ", favoriteTeams=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", champIdFromParams=");
        sb.append(this.n);
        sb.append(", champNameFromParams=");
        sb.append(this.o);
        sb.append(", remoteConfig=");
        sb.append(this.p);
        esw0.k(sb, ", specialEvents=", this.q, ", broadcastingServiceIsRunning=", this.r);
        w6x.A(", forceVideoPlayback=", ", autoStartStreamEnabled=", sb, this.s, this.t);
        sb.append(", video=");
        sb.append(this.u);
        sb.append(", simulation=");
        sb.append(this.v);
        rz4.A(sb, ", tablet=", this.w, ", selectedTabId=");
        hne.t(this.x, ", synthetic=", sb, this.y);
        return f140.n(sb, ", supportRtl=", this.z, Separators.RPAREN);
    }
}
