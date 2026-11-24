package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cs2GameScreenParams f39404a;
    public final jlr b;
    public final bqr c;
    public final boolean d;
    public final boolean e;
    public final mrf f;
    public final boolean g;
    public final List h;
    public final ypl0 i;
    public final sff0 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final List n;
    public final da10 o;
    public final boolean p;
    public final List q;
    public final xus r;
    public final gps s;
    public final List t;
    public final qmf u;
    public final yws v;
    public final szj0 w;
    public final boolean x;

    public wmf(Cs2GameScreenParams cs2GameScreenParams, jlr jlrVar, bqr bqrVar, boolean z, boolean z2, mrf mrfVar, boolean z3, List list, ypl0 ypl0Var, sff0 sff0Var, boolean z4, boolean z5, boolean z6, List list2, da10 da10Var, boolean z7, List list3, xus xusVar, gps gpsVar, List list4, qmf qmfVar, yws ywsVar, szj0 szj0Var, boolean z8) {
        b1j.B(list, list2, list4);
        this.f39404a = cs2GameScreenParams;
        this.b = jlrVar;
        this.c = bqrVar;
        this.d = z;
        this.e = z2;
        this.f = mrfVar;
        this.g = z3;
        this.h = list;
        this.i = ypl0Var;
        this.j = sff0Var;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = list2;
        this.o = da10Var;
        this.p = z7;
        this.q = list3;
        this.r = xusVar;
        this.s = gpsVar;
        this.t = list4;
        this.u = qmfVar;
        this.v = ywsVar;
        this.w = szj0Var;
        this.x = z8;
    }

    public static wmf a(wmf wmfVar, jlr jlrVar, bqr bqrVar, boolean z, mrf mrfVar, List list, ypl0 ypl0Var, boolean z2, boolean z3, ArrayList arrayList, boolean z4, xus xusVar, gps gpsVar, qmf qmfVar, yws ywsVar, szj0 szj0Var, int i) {
        da10 da10Var = da10.TIMER_ERROR;
        Cs2GameScreenParams cs2GameScreenParams = wmfVar.f39404a;
        jlr jlrVar2 = (i & 2) != 0 ? wmfVar.b : jlrVar;
        bqr bqrVar2 = (i & 4) != 0 ? wmfVar.c : bqrVar;
        boolean z5 = wmfVar.d;
        boolean z6 = (i & 16) != 0 ? wmfVar.e : z;
        mrf mrfVar2 = (i & 32) != 0 ? wmfVar.f : mrfVar;
        boolean z7 = wmfVar.g;
        List list2 = (i & 128) != 0 ? wmfVar.h : list;
        ypl0 ypl0Var2 = (i & 256) != 0 ? wmfVar.i : ypl0Var;
        sff0 sff0Var = wmfVar.j;
        boolean z8 = (i & 1024) != 0 ? wmfVar.k : z2;
        boolean z9 = (i & 2048) != 0 ? wmfVar.l : z3;
        boolean z10 = wmfVar.m;
        List list3 = (i & 8192) != 0 ? wmfVar.n : arrayList;
        da10 da10Var2 = (i & 16384) != 0 ? wmfVar.o : da10Var;
        boolean z11 = (32768 & i) != 0 ? wmfVar.p : z4;
        List list4 = wmfVar.q;
        xus xusVar2 = (i & 131072) != 0 ? wmfVar.r : xusVar;
        gps gpsVar2 = (i & 262144) != 0 ? wmfVar.s : gpsVar;
        List list5 = wmfVar.t;
        qmf qmfVar2 = (i & 1048576) != 0 ? wmfVar.u : qmfVar;
        yws ywsVar2 = (i & 2097152) != 0 ? wmfVar.v : ywsVar;
        szj0 szj0Var2 = (i & 4194304) != 0 ? wmfVar.w : szj0Var;
        boolean z12 = wmfVar.x;
        wmfVar.getClass();
        bqrVar2.getClass();
        list2.getClass();
        ypl0Var2.getClass();
        list3.getClass();
        list5.getClass();
        return new wmf(cs2GameScreenParams, jlrVar2, bqrVar2, z5, z6, mrfVar2, z7, list2, ypl0Var2, sff0Var, z8, z9, z10, list3, da10Var2, z11, list4, xusVar2, gpsVar2, list5, qmfVar2, ywsVar2, szj0Var2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmf)) {
            return false;
        }
        wmf wmfVar = (wmf) obj;
        return this.f39404a.equals(wmfVar.f39404a) && this.b.equals(wmfVar.b) && this.c.equals(wmfVar.c) && this.d == wmfVar.d && this.e == wmfVar.e && Intrinsics.d(this.f, wmfVar.f) && this.g == wmfVar.g && Intrinsics.d(this.h, wmfVar.h) && this.i.equals(wmfVar.i) && this.j.equals(wmfVar.j) && this.k == wmfVar.k && this.l == wmfVar.l && this.m == wmfVar.m && Intrinsics.d(this.n, wmfVar.n) && this.o == wmfVar.o && this.p == wmfVar.p && this.q.equals(wmfVar.q) && this.r.equals(wmfVar.r) && this.s.equals(wmfVar.s) && Intrinsics.d(this.t, wmfVar.t) && this.u.equals(wmfVar.u) && Intrinsics.d(this.v, wmfVar.v) && Intrinsics.d(this.w, wmfVar.w) && this.x == wmfVar.x;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f39404a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        mrf mrfVar = this.f;
        int iHashCode = (this.u.hashCode() + dw9.a((this.s.hashCode() + ((this.r.hashCode() + dw9.a(brm0.e((this.o.hashCode() + dw9.a(brm0.e(brm0.e(brm0.e(cs0.c(this.j, (this.i.hashCode() + dw9.a(brm0.e((iE + (mrfVar == null ? 0 : mrfVar.hashCode())) * 31, 31, this.g), 31, this.h)) * 31, 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31, 31, this.p), 31, this.q)) * 31)) * 31, 31, this.t)) * 31;
        yws ywsVar = this.v;
        int iHashCode2 = (iHashCode + (ywsVar == null ? 0 : ywsVar.hashCode())) * 31;
        szj0 szj0Var = this.w;
        return Boolean.hashCode(this.x) + ((iHashCode2 + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2GameState(screenParams=");
        sb.append(this.f39404a);
        sb.append(", game=");
        sb.append(this.b);
        sb.append(", gameBackgroundModel=");
        sb.append(this.c);
        sb.append(", quickBetVisible=");
        sb.append(this.d);
        sb.append(", quickBetEnabled=");
        sb.append(this.e);
        sb.append(", statistic=");
        sb.append(this.f);
        sb.append(", bettingDisabled=");
        vqd.y(sb, ", favoriteTeams=", this.h, ", sportSimpleModel=", this.g);
        sb.append(this.i);
        sb.append(", remoteConfig=");
        sb.append(this.j);
        sb.append(", broadcastingServiceIsRunning=");
        ua80.u(", autoStartStreamEnabled=", ", forceVideoPlayback=", sb, this.k, this.l);
        vqd.y(sb, ", statisticBlocks=", this.n, ", lottieButtonState=", this.m);
        sb.append(this.o);
        sb.append(", resetScroll=");
        sb.append(this.p);
        sb.append(", availableStats=");
        sb.append(this.q);
        sb.append(", gameToolbarState=");
        sb.append(this.r);
        sb.append(", gameRequestState=");
        sb.append(this.s);
        sb.append(", specialEvents=");
        sb.append(this.t);
        sb.append(", selectedStateModel=");
        sb.append(this.u);
        sb.append(", video=");
        sb.append(this.v);
        sb.append(", simulation=");
        sb.append(this.w);
        sb.append(", supportRtl=");
        sb.append(this.x);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
