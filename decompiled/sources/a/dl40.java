package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class dl40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlbbGameScreenParams f6261a;
    public final gps b;
    public final jlr c;
    public final mi40 d;
    public final ypl0 e;
    public final bqr f;
    public final boolean g;
    public final da10 h;
    public final boolean i;
    public final boolean j;
    public final uaq0 k;
    public final List l;
    public final sff0 m;
    public final List n;
    public final boolean o;
    public final boolean p;
    public final yws q;
    public final szj0 r;
    public final o4i0 s;
    public final boolean t;
    public final boolean u;
    public final List v;
    public final List w;
    public final long x;

    public dl40(MlbbGameScreenParams mlbbGameScreenParams, gps gpsVar, jlr jlrVar, mi40 mi40Var, ypl0 ypl0Var, bqr bqrVar, boolean z, da10 da10Var, boolean z2, boolean z3, uaq0 uaq0Var, List list, sff0 sff0Var, List list2, boolean z4, boolean z5, yws ywsVar, szj0 szj0Var, o4i0 o4i0Var, boolean z6, boolean z7, List list3, List list4, long j) {
        b1j.B(list, list2, list3);
        this.f6261a = mlbbGameScreenParams;
        this.b = gpsVar;
        this.c = jlrVar;
        this.d = mi40Var;
        this.e = ypl0Var;
        this.f = bqrVar;
        this.g = z;
        this.h = da10Var;
        this.i = z2;
        this.j = z3;
        this.k = uaq0Var;
        this.l = list;
        this.m = sff0Var;
        this.n = list2;
        this.o = z4;
        this.p = z5;
        this.q = ywsVar;
        this.r = szj0Var;
        this.s = o4i0Var;
        this.t = z6;
        this.u = z7;
        this.v = list3;
        this.w = list4;
        this.x = j;
    }

    public static dl40 a(dl40 dl40Var, gps gpsVar, jlr jlrVar, mi40 mi40Var, ypl0 ypl0Var, bqr bqrVar, boolean z, List list, boolean z2, boolean z3, yws ywsVar, szj0 szj0Var, o4i0 o4i0Var, boolean z4, ArrayList arrayList, long j, int i) {
        da10 da10Var = da10.TIMER_ERROR;
        MlbbGameScreenParams mlbbGameScreenParams = dl40Var.f6261a;
        gps gpsVar2 = (i & 2) != 0 ? dl40Var.b : gpsVar;
        jlr jlrVar2 = (i & 4) != 0 ? dl40Var.c : jlrVar;
        mi40 mi40Var2 = (i & 8) != 0 ? dl40Var.d : mi40Var;
        ypl0 ypl0Var2 = (i & 16) != 0 ? dl40Var.e : ypl0Var;
        bqr bqrVar2 = (i & 32) != 0 ? dl40Var.f : bqrVar;
        boolean z5 = dl40Var.g;
        if ((i & 128) != 0) {
            da10Var = dl40Var.h;
        }
        da10 da10Var2 = da10Var;
        boolean z6 = dl40Var.i;
        boolean z7 = (i & 512) != 0 ? dl40Var.j : z;
        uaq0 uaq0Var = dl40Var.k;
        List list2 = (i & 2048) != 0 ? dl40Var.l : list;
        sff0 sff0Var = dl40Var.m;
        List list3 = dl40Var.n;
        boolean z8 = (i & 16384) != 0 ? dl40Var.o : z2;
        boolean z9 = (32768 & i) != 0 ? dl40Var.p : z3;
        yws ywsVar2 = (65536 & i) != 0 ? dl40Var.q : ywsVar;
        szj0 szj0Var2 = (131072 & i) != 0 ? dl40Var.r : szj0Var;
        o4i0 o4i0Var2 = (262144 & i) != 0 ? dl40Var.s : o4i0Var;
        boolean z10 = dl40Var.t;
        boolean z11 = (i & 1048576) != 0 ? dl40Var.u : z4;
        List list4 = (i & 2097152) != 0 ? dl40Var.v : arrayList;
        List list5 = dl40Var.w;
        long j2 = (i & 8388608) != 0 ? dl40Var.x : j;
        dl40Var.getClass();
        ypl0Var2.getClass();
        bqrVar2.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new dl40(mlbbGameScreenParams, gpsVar2, jlrVar2, mi40Var2, ypl0Var2, bqrVar2, z5, da10Var2, z6, z7, uaq0Var, list2, sff0Var, list3, z8, z9, ywsVar2, szj0Var2, o4i0Var2, z10, z11, list4, list5, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl40)) {
            return false;
        }
        dl40 dl40Var = (dl40) obj;
        return this.f6261a.equals(dl40Var.f6261a) && this.b.equals(dl40Var.b) && this.c.equals(dl40Var.c) && Intrinsics.d(this.d, dl40Var.d) && this.e.equals(dl40Var.e) && this.f.equals(dl40Var.f) && this.g == dl40Var.g && this.h == dl40Var.h && this.i == dl40Var.i && this.j == dl40Var.j && this.k == dl40Var.k && Intrinsics.d(this.l, dl40Var.l) && this.m.equals(dl40Var.m) && Intrinsics.d(this.n, dl40Var.n) && this.o == dl40Var.o && this.p == dl40Var.p && Intrinsics.d(this.q, dl40Var.q) && Intrinsics.d(this.r, dl40Var.r) && this.s.equals(dl40Var.s) && this.t == dl40Var.t && this.u == dl40Var.u && Intrinsics.d(this.v, dl40Var.v) && this.w.equals(dl40Var.w) && this.x == dl40Var.x;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f6261a.hashCode() * 31)) * 31)) * 31;
        mi40 mi40Var = this.d;
        int iE = brm0.e(brm0.e(dw9.a(cs0.c(this.m, dw9.a((this.k.hashCode() + brm0.e(brm0.e((this.h.hashCode() + brm0.e((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (mi40Var == null ? 0 : mi40Var.hashCode())) * 31)) * 31)) * 31, 31, this.g)) * 31, 31, this.i), 31, this.j)) * 31, 31, this.l), 31), 31, this.n), 31, this.o), 31, this.p);
        yws ywsVar = this.q;
        int iHashCode2 = (iE + (ywsVar == null ? 0 : ywsVar.hashCode())) * 31;
        szj0 szj0Var = this.r;
        return Long.hashCode(this.x) + dw9.a(dw9.a(brm0.e(brm0.e((this.s.hashCode() + ((iHashCode2 + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31)) * 31, 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MlbbState(screenParams=");
        sb.append(this.f6261a);
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
        sb.append(", bettingDisabled=");
        sb.append(this.g);
        sb.append(", lottieButtonState=");
        sb.append(this.h);
        sb.append(", quickBetVisible=");
        ua80.u(", quickBetEnabled=", ", theme=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", favoriteTeams=");
        sb.append(this.l);
        sb.append(", remoteConfig=");
        sb.append(this.m);
        sb.append(", specialEvents=");
        sb.append(this.n);
        sb.append(", broadcastingServiceIsRunning=");
        ua80.u(", autoStartStreamEnabled=", ", video=", sb, this.o, this.p);
        sb.append(this.q);
        sb.append(", simulation=");
        sb.append(this.r);
        sb.append(", selectedPlayers=");
        sb.append(this.s);
        sb.append(", supportRtl=");
        sb.append(this.t);
        sb.append(", resetScroll=");
        vqd.y(sb, ", statisticBlocks=", this.v, ", availableStats=", this.u);
        sb.append(this.w);
        sb.append(", selectedPlayersStatisticTabId=");
        sb.append(this.x);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
