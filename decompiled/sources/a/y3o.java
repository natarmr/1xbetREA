package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class y3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsportsGamesScreenParams f41962a;
    public final j0g0 b;
    public final j0g0 c;
    public final boolean d;
    public final int e;
    public final sff0 f;
    public final boolean g;
    public final boolean h;
    public final ygq0 i;
    public final String j;
    public final long k;
    public final long l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public y3o(EsportsGamesScreenParams esportsGamesScreenParams, j0g0 j0g0Var, j0g0 j0g0Var2, boolean z, int i, sff0 sff0Var, boolean z2, boolean z3, ygq0 ygq0Var, String str, long j, long j2, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f41962a = esportsGamesScreenParams;
        this.b = j0g0Var;
        this.c = j0g0Var2;
        this.d = z;
        this.e = i;
        this.f = sff0Var;
        this.g = z2;
        this.h = z3;
        this.i = ygq0Var;
        this.j = str;
        this.k = j;
        this.l = j2;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
    }

    public static y3o a(y3o y3oVar, EsportsGamesScreenParams esportsGamesScreenParams, j0g0 j0g0Var, j0g0 j0g0Var2, int i, boolean z, boolean z2, ygq0 ygq0Var, String str, long j, long j2, boolean z3, boolean z4, boolean z5, int i2) {
        EsportsGamesScreenParams esportsGamesScreenParams2 = (i2 & 1) != 0 ? y3oVar.f41962a : esportsGamesScreenParams;
        j0g0 j0g0Var3 = (i2 & 2) != 0 ? y3oVar.b : j0g0Var;
        j0g0 j0g0Var4 = (i2 & 4) != 0 ? y3oVar.c : j0g0Var2;
        boolean z6 = y3oVar.d;
        int i3 = (i2 & 16) != 0 ? y3oVar.e : i;
        sff0 sff0Var = y3oVar.f;
        boolean z7 = (i2 & 64) != 0 ? y3oVar.g : z;
        boolean z8 = (i2 & 128) != 0 ? y3oVar.h : z2;
        ygq0 ygq0Var2 = (i2 & 256) != 0 ? y3oVar.i : ygq0Var;
        String str2 = (i2 & 512) != 0 ? y3oVar.j : str;
        long j3 = (i2 & 1024) != 0 ? y3oVar.k : j;
        long j4 = (i2 & 2048) != 0 ? y3oVar.l : j2;
        boolean z9 = (i2 & 4096) != 0 ? y3oVar.m : z3;
        boolean z10 = (i2 & 8192) != 0 ? y3oVar.n : z4;
        boolean z11 = (i2 & 16384) != 0 ? y3oVar.o : z5;
        boolean z12 = y3oVar.p;
        y3oVar.getClass();
        esportsGamesScreenParams2.getClass();
        ygq0Var2.getClass();
        str2.getClass();
        return new y3o(esportsGamesScreenParams2, j0g0Var3, j0g0Var4, z6, i3, sff0Var, z7, z8, ygq0Var2, str2, j3, j4, z9, z10, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3o)) {
            return false;
        }
        y3o y3oVar = (y3o) obj;
        return this.f41962a.equals(y3oVar.f41962a) && Intrinsics.d(this.b, y3oVar.b) && Intrinsics.d(this.c, y3oVar.c) && this.d == y3oVar.d && this.e == y3oVar.e && this.f.equals(y3oVar.f) && this.g == y3oVar.g && this.h == y3oVar.h && this.i == y3oVar.i && this.j.equals(y3oVar.j) && this.k == y3oVar.k && this.l == y3oVar.l && this.m == y3oVar.m && this.n == y3oVar.n && this.o == y3oVar.o && this.p == y3oVar.p;
    }

    public final int hashCode() {
        int iHashCode = this.f41962a.hashCode() * 31;
        j0g0 j0g0Var = this.b;
        int iB = (iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31;
        j0g0 j0g0Var2 = this.c;
        return Boolean.hashCode(this.p) + brm0.e(brm0.e(brm0.e(rw2.b(rw2.b(ua80.b((this.i.hashCode() + brm0.e(brm0.e(cs0.c(this.f, twn.a(this.e, brm0.e((iB + (j0g0Var2 != null ? j0g0.b(j0g0Var2.f15681a) : 0)) * 31, 31, this.d), 31), 31), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsportsGamesStateModel(params=");
        sb.append(this.f41962a);
        sb.append(", scenarioModelLive=");
        sb.append(this.b);
        sb.append(", scenarioModelLine=");
        sb.append(this.c);
        sb.append(", bettingDisabled=");
        sb.append(this.d);
        sb.append(", currentTab=");
        sb.append(this.e);
        sb.append(", remoteConfig=");
        sb.append(this.f);
        sb.append(", isRefreshing=");
        ua80.u(", searchEnabled=", ", timeFilter=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", query=");
        sb.append(this.j);
        sb.append(", startTime=");
        sb.append(this.k);
        kng0.A(sb, ", endTime=", this.l, ", streamEnable=");
        ua80.u(", multilineEnabled=", ", connected=", sb, this.m, this.n);
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.o, this.p);
    }
}
