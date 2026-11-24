package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class b0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValorantGameScreenParams f1777a;
    public final gps b;
    public final jlr c;
    public final vxt0 d;
    public final ypl0 e;
    public final bqr f;
    public final xus g;
    public final boolean h;
    public final boolean i;
    public final vzt0 j;
    public final nxt0 k;
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

    public b0u0(ValorantGameScreenParams valorantGameScreenParams, gps gpsVar, jlr jlrVar, vxt0 vxt0Var, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, boolean z2, vzt0 vzt0Var, nxt0 nxt0Var, da10 da10Var, List list, List list2, boolean z3, boolean z4, List list3, sff0 sff0Var, List list4, boolean z5, boolean z6, boolean z7, yws ywsVar, szj0 szj0Var, boolean z8) {
        b1j.B(list, list3, list4);
        this.f1777a = valorantGameScreenParams;
        this.b = gpsVar;
        this.c = jlrVar;
        this.d = vxt0Var;
        this.e = ypl0Var;
        this.f = bqrVar;
        this.g = xusVar;
        this.h = z;
        this.i = z2;
        this.j = vzt0Var;
        this.k = nxt0Var;
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

    public static b0u0 a(b0u0 b0u0Var, gps gpsVar, jlr jlrVar, vxt0 vxt0Var, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, vzt0 vzt0Var, nxt0 nxt0Var, ArrayList arrayList, boolean z2, List list, boolean z3, boolean z4, yws ywsVar, szj0 szj0Var, int i) {
        da10 da10Var = da10.TIMER_ERROR;
        ValorantGameScreenParams valorantGameScreenParams = b0u0Var.f1777a;
        gps gpsVar2 = (i & 2) != 0 ? b0u0Var.b : gpsVar;
        jlr jlrVar2 = (i & 4) != 0 ? b0u0Var.c : jlrVar;
        vxt0 vxt0Var2 = (i & 8) != 0 ? b0u0Var.d : vxt0Var;
        ypl0 ypl0Var2 = (i & 16) != 0 ? b0u0Var.e : ypl0Var;
        bqr bqrVar2 = (i & 32) != 0 ? b0u0Var.f : bqrVar;
        xus xusVar2 = (i & 64) != 0 ? b0u0Var.g : xusVar;
        boolean z5 = b0u0Var.h;
        boolean z6 = (i & 256) != 0 ? b0u0Var.i : z;
        vzt0 vzt0Var2 = (i & 512) != 0 ? b0u0Var.j : vzt0Var;
        nxt0 nxt0Var2 = (i & 1024) != 0 ? b0u0Var.k : nxt0Var;
        if ((i & 2048) != 0) {
            da10Var = b0u0Var.l;
        }
        da10 da10Var2 = da10Var;
        List list2 = (i & 4096) != 0 ? b0u0Var.m : arrayList;
        List list3 = b0u0Var.n;
        boolean z7 = b0u0Var.o;
        boolean z8 = (i & 32768) != 0 ? b0u0Var.p : z2;
        List list4 = (i & 65536) != 0 ? b0u0Var.q : list;
        sff0 sff0Var = b0u0Var.r;
        List list5 = b0u0Var.s;
        boolean z9 = (i & 524288) != 0 ? b0u0Var.t : z3;
        boolean z10 = b0u0Var.u;
        boolean z11 = (i & 2097152) != 0 ? b0u0Var.v : z4;
        yws ywsVar2 = (i & 4194304) != 0 ? b0u0Var.w : ywsVar;
        szj0 szj0Var2 = (i & 8388608) != 0 ? b0u0Var.x : szj0Var;
        boolean z12 = b0u0Var.y;
        b0u0Var.getClass();
        ypl0Var2.getClass();
        bqrVar2.getClass();
        list2.getClass();
        list4.getClass();
        list5.getClass();
        return new b0u0(valorantGameScreenParams, gpsVar2, jlrVar2, vxt0Var2, ypl0Var2, bqrVar2, xusVar2, z5, z6, vzt0Var2, nxt0Var2, da10Var2, list2, list3, z7, z8, list4, sff0Var, list5, z9, z10, z11, ywsVar2, szj0Var2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0u0)) {
            return false;
        }
        b0u0 b0u0Var = (b0u0) obj;
        return this.f1777a.equals(b0u0Var.f1777a) && this.b.equals(b0u0Var.b) && this.c.equals(b0u0Var.c) && Intrinsics.d(this.d, b0u0Var.d) && this.e.equals(b0u0Var.e) && this.f.equals(b0u0Var.f) && this.g.equals(b0u0Var.g) && this.h == b0u0Var.h && this.i == b0u0Var.i && this.j.equals(b0u0Var.j) && this.k.equals(b0u0Var.k) && this.l == b0u0Var.l && Intrinsics.d(this.m, b0u0Var.m) && this.n.equals(b0u0Var.n) && this.o == b0u0Var.o && this.p == b0u0Var.p && Intrinsics.d(this.q, b0u0Var.q) && this.r.equals(b0u0Var.r) && Intrinsics.d(this.s, b0u0Var.s) && this.t == b0u0Var.t && this.u == b0u0Var.u && this.v == b0u0Var.v && Intrinsics.d(this.w, b0u0Var.w) && Intrinsics.d(this.x, b0u0Var.x) && this.y == b0u0Var.y;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f1777a.hashCode() * 31)) * 31)) * 31;
        vxt0 vxt0Var = this.d;
        int iE = brm0.e(brm0.e(brm0.e(dw9.a(cs0.c(this.r, dw9.a(brm0.e(brm0.e(dw9.a(dw9.a((this.l.hashCode() + twn.a(this.k.f24298a, (this.j.hashCode() + brm0.e(brm0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (vxt0Var == null ? 0 : vxt0Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        yws ywsVar = this.w;
        int iHashCode2 = (iE + (ywsVar == null ? 0 : ywsVar.hashCode())) * 31;
        szj0 szj0Var = this.x;
        return Boolean.hashCode(this.y) + ((iHashCode2 + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValorantState(screenParams=");
        sb.append(this.f1777a);
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
