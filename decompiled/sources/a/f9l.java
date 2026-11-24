package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class f9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberGameDotaScreenParams f9159a;
    public final gps b;
    public final jlr c;
    public final x9l d;
    public final ypl0 e;
    public final bqr f;
    public final xus g;
    public final boolean h;
    public final boolean i;
    public final z6l j;
    public final da10 k;
    public final List l;
    public final List m;
    public final boolean n;
    public final boolean o;
    public final List p;
    public final sff0 q;
    public final List r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final yws v;
    public final int w;
    public final int x;
    public final szj0 y;
    public final boolean z;

    public f9l(CyberGameDotaScreenParams cyberGameDotaScreenParams, gps gpsVar, jlr jlrVar, x9l x9lVar, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, boolean z2, z6l z6lVar, da10 da10Var, List list, List list2, boolean z3, boolean z4, List list3, sff0 sff0Var, List list4, boolean z5, boolean z6, boolean z7, yws ywsVar, int i, int i2, szj0 szj0Var, boolean z8) {
        b1j.B(list, list3, list4);
        this.f9159a = cyberGameDotaScreenParams;
        this.b = gpsVar;
        this.c = jlrVar;
        this.d = x9lVar;
        this.e = ypl0Var;
        this.f = bqrVar;
        this.g = xusVar;
        this.h = z;
        this.i = z2;
        this.j = z6lVar;
        this.k = da10Var;
        this.l = list;
        this.m = list2;
        this.n = z3;
        this.o = z4;
        this.p = list3;
        this.q = sff0Var;
        this.r = list4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = ywsVar;
        this.w = i;
        this.x = i2;
        this.y = szj0Var;
        this.z = z8;
    }

    public static f9l a(f9l f9lVar, gps gpsVar, jlr jlrVar, x9l x9lVar, ypl0 ypl0Var, bqr bqrVar, xus xusVar, boolean z, z6l z6lVar, ArrayList arrayList, boolean z2, List list, boolean z3, boolean z4, yws ywsVar, int i, int i2, szj0 szj0Var, int i3) {
        da10 da10Var = da10.TIMER_ERROR;
        CyberGameDotaScreenParams cyberGameDotaScreenParams = f9lVar.f9159a;
        gps gpsVar2 = (i3 & 2) != 0 ? f9lVar.b : gpsVar;
        jlr jlrVar2 = (i3 & 4) != 0 ? f9lVar.c : jlrVar;
        x9l x9lVar2 = (i3 & 8) != 0 ? f9lVar.d : x9lVar;
        ypl0 ypl0Var2 = (i3 & 16) != 0 ? f9lVar.e : ypl0Var;
        bqr bqrVar2 = (i3 & 32) != 0 ? f9lVar.f : bqrVar;
        xus xusVar2 = (i3 & 64) != 0 ? f9lVar.g : xusVar;
        boolean z5 = f9lVar.h;
        boolean z6 = (i3 & 256) != 0 ? f9lVar.i : z;
        z6l z6lVar2 = (i3 & 512) != 0 ? f9lVar.j : z6lVar;
        if ((i3 & 1024) != 0) {
            da10Var = f9lVar.k;
        }
        da10 da10Var2 = da10Var;
        List list2 = (i3 & 2048) != 0 ? f9lVar.l : arrayList;
        List list3 = f9lVar.m;
        boolean z7 = f9lVar.n;
        boolean z8 = (i3 & 16384) != 0 ? f9lVar.o : z2;
        List list4 = (32768 & i3) != 0 ? f9lVar.p : list;
        sff0 sff0Var = f9lVar.q;
        List list5 = f9lVar.r;
        boolean z9 = (i3 & 262144) != 0 ? f9lVar.s : z3;
        boolean z10 = f9lVar.t;
        boolean z11 = (i3 & 1048576) != 0 ? f9lVar.u : z4;
        yws ywsVar2 = (i3 & 2097152) != 0 ? f9lVar.v : ywsVar;
        int i4 = (i3 & 4194304) != 0 ? f9lVar.w : i;
        int i5 = (i3 & 8388608) != 0 ? f9lVar.x : i2;
        szj0 szj0Var2 = (i3 & 16777216) != 0 ? f9lVar.y : szj0Var;
        boolean z12 = f9lVar.z;
        f9lVar.getClass();
        ypl0Var2.getClass();
        bqrVar2.getClass();
        list2.getClass();
        list4.getClass();
        list5.getClass();
        return new f9l(cyberGameDotaScreenParams, gpsVar2, jlrVar2, x9lVar2, ypl0Var2, bqrVar2, xusVar2, z5, z6, z6lVar2, da10Var2, list2, list3, z7, z8, list4, sff0Var, list5, z9, z10, z11, ywsVar2, i4, i5, szj0Var2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9l)) {
            return false;
        }
        f9l f9lVar = (f9l) obj;
        return this.f9159a.equals(f9lVar.f9159a) && this.b.equals(f9lVar.b) && this.c.equals(f9lVar.c) && Intrinsics.d(this.d, f9lVar.d) && this.e.equals(f9lVar.e) && this.f.equals(f9lVar.f) && this.g.equals(f9lVar.g) && this.h == f9lVar.h && this.i == f9lVar.i && this.j.equals(f9lVar.j) && this.k == f9lVar.k && Intrinsics.d(this.l, f9lVar.l) && this.m.equals(f9lVar.m) && this.n == f9lVar.n && this.o == f9lVar.o && Intrinsics.d(this.p, f9lVar.p) && this.q.equals(f9lVar.q) && Intrinsics.d(this.r, f9lVar.r) && this.s == f9lVar.s && this.t == f9lVar.t && this.u == f9lVar.u && Intrinsics.d(this.v, f9lVar.v) && this.w == f9lVar.w && this.x == f9lVar.x && Intrinsics.d(this.y, f9lVar.y) && this.z == f9lVar.z;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f9159a.hashCode() * 31)) * 31)) * 31;
        x9l x9lVar = this.d;
        int iE = brm0.e(brm0.e(brm0.e(dw9.a(cs0.c(this.q, dw9.a(brm0.e(brm0.e(dw9.a(dw9.a((this.k.hashCode() + ((this.j.hashCode() + brm0.e(brm0.e((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (x9lVar == null ? 0 : x9lVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
        yws ywsVar = this.v;
        int iA = twn.a(this.x, twn.a(this.w, (iE + (ywsVar == null ? 0 : ywsVar.hashCode())) * 31, 31), 31);
        szj0 szj0Var = this.y;
        return Boolean.hashCode(this.z) + ((iA + (szj0Var != null ? szj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DotaState(screenParams=");
        sb.append(this.f9159a);
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
        sb.append(", lottieButtonState=");
        sb.append(this.k);
        sb.append(", statisticBlocks=");
        sb.append(this.l);
        sb.append(", availableStats=");
        rz4.z(sb, ", quickBetVisible=", this.m, ", quickBetEnabled=", this.n);
        vqd.y(sb, ", favoriteTeams=", this.p, ", remoteConfig=", this.o);
        sb.append(this.q);
        sb.append(", specialEvents=");
        sb.append(this.r);
        sb.append(", broadcastingServiceIsRunning=");
        ua80.u(", forceVideoPlayback=", ", autoStartStreamEnabled=", sb, this.s, this.t);
        sb.append(this.u);
        sb.append(", video=");
        sb.append(this.v);
        sb.append(", numberOfPreviousMaps=");
        axq.r(this.w, this.x, ", numberOfMapWithStatistics=", ", simulation=", sb);
        sb.append(this.y);
        sb.append(", supportRtl=");
        sb.append(this.z);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
