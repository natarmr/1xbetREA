package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ufc.api.game.UfcGameParams;

/* JADX INFO: loaded from: classes6.dex */
public final class wrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UfcGameParams f39660a;
    public final gps b;
    public final jlr c;
    public final ypl0 d;
    public final bqr e;
    public final xus f;
    public final String g;
    public final List h;
    public final boolean i;
    public final rsp j;
    public final lov k;
    public final List l;
    public final yws m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final sff0 s;
    public final da10 t;
    public final List u;
    public final List v;
    public final boolean w;
    public final long x;
    public final long y;
    public final boolean z;

    public wrs(UfcGameParams ufcGameParams, gps gpsVar, jlr jlrVar, ypl0 ypl0Var, bqr bqrVar, xus xusVar, String str, List list, boolean z, rsp rspVar, lov lovVar, List list2, yws ywsVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, sff0 sff0Var, da10 da10Var, List list3, List list4, boolean z7, long j, long j2, boolean z8) {
        b1j.B(list, list2, list3);
        this.f39660a = ufcGameParams;
        this.b = gpsVar;
        this.c = jlrVar;
        this.d = ypl0Var;
        this.e = bqrVar;
        this.f = xusVar;
        this.g = str;
        this.h = list;
        this.i = z;
        this.j = rspVar;
        this.k = lovVar;
        this.l = list2;
        this.m = ywsVar;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.s = sff0Var;
        this.t = da10Var;
        this.u = list3;
        this.v = list4;
        this.w = z7;
        this.x = j;
        this.y = j2;
        this.z = z8;
    }

    public static wrs a(wrs wrsVar, gps gpsVar, jlr jlrVar, ypl0 ypl0Var, bqr bqrVar, xus xusVar, String str, List list, rsp rspVar, lov lovVar, List list2, yws ywsVar, boolean z, boolean z2, boolean z3, ArrayList arrayList, boolean z4, long j, long j2, int i) {
        da10 da10Var = da10.TIMER_ERROR;
        UfcGameParams ufcGameParams = wrsVar.f39660a;
        gps gpsVar2 = (i & 2) != 0 ? wrsVar.b : gpsVar;
        jlr jlrVar2 = (i & 4) != 0 ? wrsVar.c : jlrVar;
        ypl0 ypl0Var2 = (i & 8) != 0 ? wrsVar.d : ypl0Var;
        bqr bqrVar2 = (i & 16) != 0 ? wrsVar.e : bqrVar;
        xus xusVar2 = (i & 32) != 0 ? wrsVar.f : xusVar;
        String str2 = (i & 64) != 0 ? wrsVar.g : str;
        List list3 = (i & 128) != 0 ? wrsVar.h : list;
        boolean z5 = (i & 256) != 0 ? wrsVar.i : true;
        rsp rspVar2 = (i & 512) != 0 ? wrsVar.j : rspVar;
        lov lovVar2 = (i & 1024) != 0 ? wrsVar.k : lovVar;
        List list4 = (i & 2048) != 0 ? wrsVar.l : list2;
        yws ywsVar2 = (i & 4096) != 0 ? wrsVar.m : ywsVar;
        boolean z6 = wrsVar.n;
        boolean z7 = wrsVar.o;
        boolean z8 = (i & 32768) != 0 ? wrsVar.p : z;
        boolean z9 = (i & 65536) != 0 ? wrsVar.q : z2;
        boolean z10 = (i & 131072) != 0 ? wrsVar.r : z3;
        sff0 sff0Var = wrsVar.s;
        if ((i & 524288) != 0) {
            da10Var = wrsVar.t;
        }
        da10 da10Var2 = da10Var;
        List list5 = (i & 1048576) != 0 ? wrsVar.u : arrayList;
        List list6 = wrsVar.v;
        boolean z11 = (i & 4194304) != 0 ? wrsVar.w : z4;
        long j3 = (i & 8388608) != 0 ? wrsVar.x : j;
        long j4 = (i & 16777216) != 0 ? wrsVar.y : j2;
        boolean z12 = wrsVar.z;
        wrsVar.getClass();
        ypl0Var2.getClass();
        bqrVar2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new wrs(ufcGameParams, gpsVar2, jlrVar2, ypl0Var2, bqrVar2, xusVar2, str2, list3, z5, rspVar2, lovVar2, list4, ywsVar2, z6, z7, z8, z9, z10, sff0Var, da10Var2, list5, list6, z11, j3, j4, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrs)) {
            return false;
        }
        wrs wrsVar = (wrs) obj;
        return this.f39660a.equals(wrsVar.f39660a) && this.b.equals(wrsVar.b) && this.c.equals(wrsVar.c) && this.d.equals(wrsVar.d) && this.e.equals(wrsVar.e) && this.f.equals(wrsVar.f) && this.g.equals(wrsVar.g) && Intrinsics.d(this.h, wrsVar.h) && this.i == wrsVar.i && Intrinsics.d(this.j, wrsVar.j) && Intrinsics.d(this.k, wrsVar.k) && Intrinsics.d(this.l, wrsVar.l) && Intrinsics.d(this.m, wrsVar.m) && this.n == wrsVar.n && this.o == wrsVar.o && this.p == wrsVar.p && this.q == wrsVar.q && this.r == wrsVar.r && this.s.equals(wrsVar.s) && this.t == wrsVar.t && Intrinsics.d(this.u, wrsVar.u) && this.v.equals(wrsVar.v) && this.w == wrsVar.w && this.x == wrsVar.x && this.y == wrsVar.y && this.z == wrsVar.z;
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(ua80.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f39660a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
        rsp rspVar = this.j;
        int iHashCode = (iE + (rspVar == null ? 0 : rspVar.hashCode())) * 31;
        lov lovVar = this.k;
        int iA = dw9.a((iHashCode + (lovVar == null ? 0 : lovVar.hashCode())) * 31, 31, this.l);
        yws ywsVar = this.m;
        return Boolean.hashCode(this.z) + rw2.b(rw2.b(brm0.e(dw9.a(dw9.a((this.t.hashCode() + cs0.c(this.s, brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iA + (ywsVar != null ? ywsVar.hashCode() : 0)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31)) * 31, 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameStateModel(screenParams=");
        sb.append(this.f39660a);
        sb.append(", gameRequestState=");
        sb.append(this.b);
        sb.append(", game=");
        sb.append(this.c);
        sb.append(", sportSimpleModel=");
        sb.append(this.d);
        sb.append(", gameBackgroundModel=");
        sb.append(this.e);
        sb.append(", gameToolbarState=");
        sb.append(this.f);
        sb.append(", statId=");
        cs0.y(this.g, ", fighterStats=", ", fighterStatsLoadAttempted=", sb, this.h);
        sb.append(this.i);
        sb.append(", fightInfo=");
        sb.append(this.j);
        sb.append(", headToHeadModel=");
        sb.append(this.k);
        sb.append(", favoriteTeams=");
        sb.append(this.l);
        sb.append(", video=");
        sb.append(this.m);
        sb.append(", bettingDisabled=");
        sb.append(this.n);
        sb.append(", quickBetVisible=");
        ua80.u(", quickBetEnabled=", ", broadcastingServiceIsRunning=", sb, this.o, this.p);
        ua80.u(", autoStartStreamEnabled=", ", remoteConfig=", sb, this.q, this.r);
        sb.append(this.s);
        sb.append(", lottieButtonState=");
        sb.append(this.t);
        sb.append(", statisticBlocks=");
        b1j.y(", availableStats=", ", resetScroll=", sb, this.u, this.v);
        rw2.v(this.x, ", generalStatisticTabIdSelected=", sb, this.w);
        kng0.A(sb, ", headToHeadStatisticTabIdSelected=", this.y, ", supportRtl=");
        return rw2.p(sb, this.z, Separators.RPAREN);
    }
}
