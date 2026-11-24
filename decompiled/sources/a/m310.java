package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.lol.api.LolScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class m310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LolScreenParams f21091a;
    public final gps b;
    public final jlr c;
    public final k4h d;
    public final ypl0 e;
    public final bqr f;
    public final xus g;
    public final boolean h;
    public final boolean i;
    public final g310 j;
    public final mz00 k;
    public final da10 l;
    public final List m;
    public final List n;
    public final boolean o;
    public final boolean p;
    public final List q;
    public final sff0 r;
    public final List s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final yws w;
    public final szj0 x;
    public final boolean y;

    public m310(LolScreenParams lolScreenParams, gps gpsVar, jlr jlrVar, k4h k4hVar, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, boolean z2, g310 g310Var, mz00 mz00Var, da10 da10Var, List list, List list2, boolean z3, boolean z4, List list3, sff0 sff0Var, List list4, boolean z5, boolean z6, boolean z7, yws ywsVar, szj0 szj0Var, boolean z8) {
        b1j.B(list, list3, list4);
        this.f21091a = lolScreenParams;
        this.b = gpsVar;
        this.c = jlrVar;
        this.d = k4hVar;
        this.e = ypl0Var;
        this.f = bqrVar;
        this.g = xusVar;
        this.h = z;
        this.i = z2;
        this.j = g310Var;
        this.k = mz00Var;
        this.l = da10Var;
        this.m = list;
        this.n = list2;
        this.o = z3;
        this.p = z4;
        this.q = list3;
        this.r = sff0Var;
        this.s = list4;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.w = ywsVar;
        this.x = szj0Var;
        this.y = z8;
    }

    public static m310 a(m310 m310Var, gps gpsVar, jlr jlrVar, k4h k4hVar, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, g310 g310Var, mz00 mz00Var, ArrayList arrayList, boolean z2, List list, boolean z3, boolean z4, yws ywsVar, szj0 szj0Var, int i) {
        da10 da10Var = da10.TIMER_ERROR;
        LolScreenParams lolScreenParams = m310Var.f21091a;
        gps gpsVar2 = (i & 2) != 0 ? m310Var.b : gpsVar;
        jlr jlrVar2 = (i & 4) != 0 ? m310Var.c : jlrVar;
        k4h k4hVar2 = (i & 8) != 0 ? m310Var.d : k4hVar;
        ypl0 ypl0Var2 = (i & 16) != 0 ? m310Var.e : ypl0Var;
        bqr bqrVar2 = (i & 32) != 0 ? m310Var.f : bqrVar;
        xus xusVar2 = (i & 64) != 0 ? m310Var.g : xusVar;
        boolean z5 = m310Var.h;
        boolean z6 = (i & 256) != 0 ? m310Var.i : z;
        g310 g310Var2 = (i & 512) != 0 ? m310Var.j : g310Var;
        mz00 mz00Var2 = (i & 1024) != 0 ? m310Var.k : mz00Var;
        if ((i & 2048) != 0) {
            da10Var = m310Var.l;
        }
        da10 da10Var2 = da10Var;
        List list2 = (i & 4096) != 0 ? m310Var.m : arrayList;
        List list3 = m310Var.n;
        boolean z7 = m310Var.o;
        boolean z8 = (i & 32768) != 0 ? m310Var.p : z2;
        List list4 = (i & 65536) != 0 ? m310Var.q : list;
        sff0 sff0Var = m310Var.r;
        List list5 = m310Var.s;
        boolean z9 = (i & 524288) != 0 ? m310Var.t : z3;
        boolean z10 = m310Var.u;
        boolean z11 = (i & 2097152) != 0 ? m310Var.v : z4;
        yws ywsVar2 = (i & 4194304) != 0 ? m310Var.w : ywsVar;
        szj0 szj0Var2 = (i & 8388608) != 0 ? m310Var.x : szj0Var;
        boolean z12 = m310Var.y;
        m310Var.getClass();
        ypl0Var2.getClass();
        bqrVar2.getClass();
        list2.getClass();
        list4.getClass();
        list5.getClass();
        return new m310(lolScreenParams, gpsVar2, jlrVar2, k4hVar2, ypl0Var2, bqrVar2, xusVar2, z5, z6, g310Var2, mz00Var2, da10Var2, list2, list3, z7, z8, list4, sff0Var, list5, z9, z10, z11, ywsVar2, szj0Var2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m310)) {
            return false;
        }
        m310 m310Var = (m310) obj;
        return this.f21091a.equals(m310Var.f21091a) && this.b.equals(m310Var.b) && this.c.equals(m310Var.c) && Intrinsics.d(this.d, m310Var.d) && this.e.equals(m310Var.e) && this.f.equals(m310Var.f) && this.g.equals(m310Var.g) && this.h == m310Var.h && this.i == m310Var.i && this.j.equals(m310Var.j) && this.k.equals(m310Var.k) && this.l == m310Var.l && Intrinsics.d(this.m, m310Var.m) && this.n.equals(m310Var.n) && this.o == m310Var.o && this.p == m310Var.p && Intrinsics.d(this.q, m310Var.q) && this.r.equals(m310Var.r) && Intrinsics.d(this.s, m310Var.s) && this.t == m310Var.t && this.u == m310Var.u && this.v == m310Var.v && Intrinsics.d(this.w, m310Var.w) && Intrinsics.d(this.x, m310Var.x) && this.y == m310Var.y;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f21091a.hashCode() * 31)) * 31)) * 31;
        k4h k4hVar = this.d;
        int iE = brm0.e(brm0.e(brm0.e(dw9.a(cs0.c(this.r, dw9.a(brm0.e(brm0.e(dw9.a(dw9.a((this.l.hashCode() + twn.a(this.k.f22629a, (this.j.hashCode() + brm0.e(brm0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (k4hVar == null ? 0 : k4hVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        yws ywsVar = this.w;
        int iHashCode2 = (iE + (ywsVar == null ? 0 : ywsVar.hashCode())) * 31;
        szj0 szj0Var = this.x;
        return Boolean.hashCode(this.y) + ((iHashCode2 + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LolState(screenParams=");
        sb.append(this.f21091a);
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
        sb.append(", selectedState=");
        sb.append(this.j);
        sb.append(", completedState=");
        sb.append(this.k);
        sb.append(", lottieButtonState=");
        sb.append(this.l);
        sb.append(", statisticBlocks=");
        b1j.y(", availableStats=", ", quickBetVisible=", sb, this.m, this.n);
        ua80.u(", quickBetEnabled=", ", favoriteTeams=", sb, this.o, this.p);
        sb.append(this.q);
        sb.append(", remoteConfig=");
        sb.append(this.r);
        sb.append(", specialEvents=");
        rz4.z(sb, ", broadcastingServiceIsRunning=", this.s, ", forceVideoPlayback=", this.t);
        ua80.u(", autoStartStreamEnabled=", ", video=", sb, this.u, this.v);
        sb.append(this.w);
        sb.append(", simulation=");
        sb.append(this.x);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.y, Separators.RPAREN);
    }
}
