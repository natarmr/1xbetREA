package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w6r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2v f38639a;
    public final boolean b;
    public final boolean c;
    public final m7r0 d;
    public final h8l0 e;
    public final g8l0 f;
    public final y78 g;
    public final v5l0 h;
    public final wcb i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final on00 p;
    public final odt q;
    public final odt r;
    public final boolean s;
    public final boolean t;
    public final zvh0 u;
    public final boolean v;
    public final boolean w;

    public w6r0(g2v g2vVar, boolean z, boolean z2, m7r0 m7r0Var, h8l0 h8l0Var, g8l0 g8l0Var, y78 y78Var, v5l0 v5l0Var, wcb wcbVar, Boolean bool, Boolean bool2, Boolean bool3, String str, boolean z3, boolean z4, on00 on00Var, odt odtVar, odt odtVar2, boolean z5, boolean z6, zvh0 zvh0Var, boolean z7, boolean z8) {
        m7r0Var.getClass();
        this.f38639a = g2vVar;
        this.b = z;
        this.c = z2;
        this.d = m7r0Var;
        this.e = h8l0Var;
        this.f = g8l0Var;
        this.g = y78Var;
        this.h = v5l0Var;
        this.i = wcbVar;
        this.j = bool;
        this.k = bool2;
        this.l = bool3;
        this.m = str;
        this.n = z3;
        this.o = z4;
        this.p = on00Var;
        this.q = odtVar;
        this.r = odtVar2;
        this.s = z5;
        this.t = z6;
        this.u = zvh0Var;
        this.v = z7;
        this.w = z8;
    }

    public static w6r0 a(w6r0 w6r0Var, boolean z, boolean z2, m7r0 m7r0Var, h8l0 h8l0Var, g8l0 g8l0Var, v5l0 v5l0Var, wcb wcbVar, Boolean bool, Boolean bool2, Boolean bool3, String str, boolean z3, boolean z4, hn00 hn00Var, odt odtVar, odt odtVar2, boolean z5, boolean z6, boolean z7, int i) {
        g2v g2vVar = w6r0Var.f38639a;
        boolean z8 = (i & 2) != 0 ? w6r0Var.b : z;
        boolean z9 = (i & 4) != 0 ? w6r0Var.c : z2;
        m7r0 m7r0Var2 = (i & 8) != 0 ? w6r0Var.d : m7r0Var;
        h8l0 h8l0Var2 = (i & 16) != 0 ? w6r0Var.e : h8l0Var;
        g8l0 g8l0Var2 = (i & 32) != 0 ? w6r0Var.f : g8l0Var;
        y78 y78Var = w6r0Var.g;
        v5l0 v5l0Var2 = (i & 128) != 0 ? w6r0Var.h : v5l0Var;
        wcb wcbVar2 = (i & 256) != 0 ? w6r0Var.i : wcbVar;
        Boolean bool4 = (i & 512) != 0 ? w6r0Var.j : bool;
        Boolean bool5 = (i & 1024) != 0 ? w6r0Var.k : bool2;
        Boolean bool6 = (i & 2048) != 0 ? w6r0Var.l : bool3;
        String str2 = (i & 4096) != 0 ? w6r0Var.m : str;
        boolean z10 = (i & 8192) != 0 ? w6r0Var.n : z3;
        boolean z11 = (i & 16384) != 0 ? w6r0Var.o : z4;
        on00 on00Var = (i & 32768) != 0 ? w6r0Var.p : hn00Var;
        odt odtVar3 = (i & 65536) != 0 ? w6r0Var.q : odtVar;
        odt odtVar4 = (i & 131072) != 0 ? w6r0Var.r : odtVar2;
        boolean z12 = (i & 262144) != 0 ? w6r0Var.s : z5;
        boolean z13 = (i & 524288) != 0 ? w6r0Var.t : z6;
        zvh0 zvh0Var = w6r0Var.u;
        boolean z14 = (i & 2097152) != 0 ? w6r0Var.v : z7;
        boolean z15 = (i & 4194304) != 0 ? w6r0Var.w : false;
        w6r0Var.getClass();
        m7r0Var2.getClass();
        return new w6r0(g2vVar, z8, z9, m7r0Var2, h8l0Var2, g8l0Var2, y78Var, v5l0Var2, wcbVar2, bool4, bool5, bool6, str2, z10, z11, on00Var, odtVar3, odtVar4, z12, z13, zvh0Var, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6r0)) {
            return false;
        }
        w6r0 w6r0Var = (w6r0) obj;
        return this.f38639a.equals(w6r0Var.f38639a) && this.b == w6r0Var.b && this.c == w6r0Var.c && this.d == w6r0Var.d && this.e == w6r0Var.e && this.f == w6r0Var.f && this.g.equals(w6r0Var.g) && this.h == w6r0Var.h && Intrinsics.d(this.i, w6r0Var.i) && Intrinsics.d(this.j, w6r0Var.j) && Intrinsics.d(this.k, w6r0Var.k) && Intrinsics.d(this.l, w6r0Var.l) && this.m.equals(w6r0Var.m) && this.n == w6r0Var.n && this.o == w6r0Var.o && this.p.equals(w6r0Var.p) && this.q.equals(w6r0Var.q) && this.r.equals(w6r0Var.r) && this.s == w6r0Var.s && this.t == w6r0Var.t && this.u == w6r0Var.u && this.v == w6r0Var.v && this.w == w6r0Var.w;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(this.f38639a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31;
        v5l0 v5l0Var = this.h;
        int iHashCode2 = (iHashCode + (v5l0Var == null ? 0 : v5l0Var.hashCode())) * 31;
        wcb wcbVar = this.i;
        int iHashCode3 = (iHashCode2 + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        return Boolean.hashCode(this.w) + brm0.e((this.u.hashCode() + brm0.e(brm0.e((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + brm0.e(brm0.e(ua80.b((iHashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 31, 31, this.m), 31, this.n), 31, this.o)) * 31)) * 31)) * 31, 31, this.s), 31, this.t)) * 31, 31, this.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopGamesContainerStateModel(lottieEmptyConfigurator=");
        sb.append(this.f38639a);
        sb.append(", activeStreamFilter=");
        sb.append(this.b);
        sb.append(", searchIsActive=");
        sb.append(this.c);
        sb.append(", currentTabType=");
        sb.append(this.d);
        sb.append(", headerStyle=");
        sb.append(this.e);
        sb.append(", filterStyle=");
        sb.append(this.f);
        sb.append(", gameUtilsProvider=");
        sb.append(this.g);
        sb.append(", sportEventCardStyle=");
        sb.append(this.h);
        sb.append(", champImagesHolder=");
        sb.append(this.i);
        sb.append(", bettingDisabled=");
        sb.append(this.j);
        sb.append(", hasStream=");
        defpackage.c.j(sb, this.k, ", isNewEventParams=", this.l, ", query=");
        brm0.C(this.m, ", connected=", ", needScrollToTop=", sb, this.n);
        sb.append(this.o);
        sb.append(", specialEventInfo=");
        sb.append(this.p);
        sb.append(", liveGamesState=");
        sb.append(this.q);
        sb.append(", lineGamesState=");
        sb.append(this.r);
        sb.append(", liveRefreshing=");
        ua80.u(", lineRefreshing=", ", segmentedControlStyle=", sb, this.s, this.t);
        sb.append(this.u);
        sb.append(", supportRtl=");
        sb.append(this.v);
        sb.append(", firstRequest=");
        return rw2.p(sb, this.w, Separators.RPAREN);
    }
}
