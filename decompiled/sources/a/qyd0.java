package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class qyd0 {
    public final boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RainbowGameScreenParams f29527a;
    public final gps b;
    public final jlr c;
    public final vvd0 d;
    public final ypl0 e;
    public final bqr f;
    public final xus g;
    public final boolean h;
    public final boolean i;
    public final ixd0 j;
    public final rud0 k;
    public final da10 l;
    public final List m;
    public final List n;
    public final boolean o;
    public final boolean p;
    public final List q;
    public final long r;
    public final String s;
    public final sff0 t;
    public final List u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final yws y;
    public final szj0 z;

    public qyd0(RainbowGameScreenParams rainbowGameScreenParams, gps gpsVar, jlr jlrVar, vvd0 vvd0Var, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, boolean z2, ixd0 ixd0Var, rud0 rud0Var, da10 da10Var, List list, List list2, boolean z3, boolean z4, List list3, long j, String str, sff0 sff0Var, List list4, boolean z5, boolean z6, boolean z7, yws ywsVar, szj0 szj0Var, boolean z8) {
        list.getClass();
        list3.getClass();
        str.getClass();
        list4.getClass();
        this.f29527a = rainbowGameScreenParams;
        this.b = gpsVar;
        this.c = jlrVar;
        this.d = vvd0Var;
        this.e = ypl0Var;
        this.f = bqrVar;
        this.g = xusVar;
        this.h = z;
        this.i = z2;
        this.j = ixd0Var;
        this.k = rud0Var;
        this.l = da10Var;
        this.m = list;
        this.n = list2;
        this.o = z3;
        this.p = z4;
        this.q = list3;
        this.r = j;
        this.s = str;
        this.t = sff0Var;
        this.u = list4;
        this.v = z5;
        this.w = z6;
        this.x = z7;
        this.y = ywsVar;
        this.z = szj0Var;
        this.A = z8;
    }

    public static qyd0 a(qyd0 qyd0Var, gps gpsVar, jlr jlrVar, vvd0 vvd0Var, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, ixd0 ixd0Var, rud0 rud0Var, ArrayList arrayList, boolean z2, List list, boolean z3, boolean z4, yws ywsVar, szj0 szj0Var, int i) {
        da10 da10Var = da10.TIMER_ERROR;
        RainbowGameScreenParams rainbowGameScreenParams = qyd0Var.f29527a;
        gps gpsVar2 = (i & 2) != 0 ? qyd0Var.b : gpsVar;
        jlr jlrVar2 = (i & 4) != 0 ? qyd0Var.c : jlrVar;
        vvd0 vvd0Var2 = (i & 8) != 0 ? qyd0Var.d : vvd0Var;
        ypl0 ypl0Var2 = (i & 16) != 0 ? qyd0Var.e : ypl0Var;
        bqr bqrVar2 = (i & 32) != 0 ? qyd0Var.f : bqrVar;
        xus xusVar2 = (i & 64) != 0 ? qyd0Var.g : xusVar;
        boolean z5 = qyd0Var.h;
        boolean z6 = (i & 256) != 0 ? qyd0Var.i : z;
        ixd0 ixd0Var2 = (i & 512) != 0 ? qyd0Var.j : ixd0Var;
        rud0 rud0Var2 = (i & 1024) != 0 ? qyd0Var.k : rud0Var;
        if ((i & 2048) != 0) {
            da10Var = qyd0Var.l;
        }
        da10 da10Var2 = da10Var;
        List list2 = (i & 4096) != 0 ? qyd0Var.m : arrayList;
        List list3 = qyd0Var.n;
        boolean z7 = qyd0Var.o;
        boolean z8 = (i & 32768) != 0 ? qyd0Var.p : z2;
        List list4 = (i & 65536) != 0 ? qyd0Var.q : list;
        long j = qyd0Var.r;
        String str = qyd0Var.s;
        sff0 sff0Var = qyd0Var.t;
        List list5 = qyd0Var.u;
        boolean z9 = (i & 2097152) != 0 ? qyd0Var.v : z3;
        boolean z10 = qyd0Var.w;
        boolean z11 = (i & 8388608) != 0 ? qyd0Var.x : z4;
        yws ywsVar2 = (i & 16777216) != 0 ? qyd0Var.y : ywsVar;
        szj0 szj0Var2 = (i & 33554432) != 0 ? qyd0Var.z : szj0Var;
        boolean z12 = qyd0Var.A;
        qyd0Var.getClass();
        ypl0Var2.getClass();
        bqrVar2.getClass();
        list2.getClass();
        list4.getClass();
        str.getClass();
        list5.getClass();
        return new qyd0(rainbowGameScreenParams, gpsVar2, jlrVar2, vvd0Var2, ypl0Var2, bqrVar2, xusVar2, z5, z6, ixd0Var2, rud0Var2, da10Var2, list2, list3, z7, z8, list4, j, str, sff0Var, list5, z9, z10, z11, ywsVar2, szj0Var2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyd0)) {
            return false;
        }
        qyd0 qyd0Var = (qyd0) obj;
        return this.f29527a.equals(qyd0Var.f29527a) && this.b.equals(qyd0Var.b) && this.c.equals(qyd0Var.c) && Intrinsics.d(this.d, qyd0Var.d) && this.e.equals(qyd0Var.e) && this.f.equals(qyd0Var.f) && this.g.equals(qyd0Var.g) && this.h == qyd0Var.h && this.i == qyd0Var.i && this.j.equals(qyd0Var.j) && this.k.equals(qyd0Var.k) && this.l == qyd0Var.l && Intrinsics.d(this.m, qyd0Var.m) && this.n.equals(qyd0Var.n) && this.o == qyd0Var.o && this.p == qyd0Var.p && Intrinsics.d(this.q, qyd0Var.q) && this.r == qyd0Var.r && Intrinsics.d(this.s, qyd0Var.s) && this.t.equals(qyd0Var.t) && Intrinsics.d(this.u, qyd0Var.u) && this.v == qyd0Var.v && this.w == qyd0Var.w && this.x == qyd0Var.x && Intrinsics.d(this.y, qyd0Var.y) && Intrinsics.d(this.z, qyd0Var.z) && this.A == qyd0Var.A;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f29527a.hashCode() * 31)) * 31)) * 31;
        vvd0 vvd0Var = this.d;
        int iE = brm0.e(brm0.e(brm0.e(dw9.a(cs0.c(this.t, ua80.b(rw2.b(dw9.a(brm0.e(brm0.e(dw9.a(dw9.a((this.l.hashCode() + twn.a(this.k.f31122a, (this.j.hashCode() + brm0.e(brm0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (vvd0Var == null ? 0 : vvd0Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
        yws ywsVar = this.y;
        int iHashCode2 = (iE + (ywsVar == null ? 0 : ywsVar.hashCode())) * 31;
        szj0 szj0Var = this.z;
        return Boolean.hashCode(this.A) + ((iHashCode2 + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RainbowState(screenParams=");
        sb.append(this.f29527a);
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
        sb.append(", champIdFromParams=");
        sb.append(this.r);
        sb.append(", champNameFromParams=");
        sb.append(this.s);
        sb.append(", remoteConfig=");
        sb.append(this.t);
        esw0.k(sb, ", specialEvents=", this.u, ", broadcastingServiceIsRunning=", this.v);
        w6x.A(", forceVideoPlayback=", ", autoStartStreamEnabled=", sb, this.w, this.x);
        sb.append(", video=");
        sb.append(this.y);
        sb.append(", simulation=");
        sb.append(this.z);
        return f140.n(sb, ", supportRtl=", this.A, Separators.RPAREN);
    }
}
