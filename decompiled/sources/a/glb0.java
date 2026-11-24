package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class glb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11483a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final urd f;
    public final y78 g;
    public final urd h;
    public final g2v i;
    public final ctf0 j;
    public final urd k;
    public final urd l;
    public final urd m;
    public final rn00 n;
    public final rn00 o;
    public final rn00 p;
    public final rn00 q;
    public final rn00 r;
    public final rn00 s;
    public final rn00 t;
    public final rn00 u;
    public final rn00 v;
    public final List w;
    public final skb0 x;
    public final boolean y;

    public glb0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, urd urdVar, y78 y78Var, urd urdVar2, g2v g2vVar, ctf0 ctf0Var, urd urdVar3, urd urdVar4, urd urdVar5, rn00 rn00Var, rn00 rn00Var2, rn00 rn00Var3, rn00 rn00Var4, rn00 rn00Var5, rn00 rn00Var6, rn00 rn00Var7, rn00 rn00Var8, rn00 rn00Var9, List list, skb0 skb0Var, boolean z6) {
        ctf0Var.getClass();
        list.getClass();
        this.f11483a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = urdVar;
        this.g = y78Var;
        this.h = urdVar2;
        this.i = g2vVar;
        this.j = ctf0Var;
        this.k = urdVar3;
        this.l = urdVar4;
        this.m = urdVar5;
        this.n = rn00Var;
        this.o = rn00Var2;
        this.p = rn00Var3;
        this.q = rn00Var4;
        this.r = rn00Var5;
        this.s = rn00Var6;
        this.t = rn00Var7;
        this.u = rn00Var8;
        this.v = rn00Var9;
        this.w = list;
        this.x = skb0Var;
        this.y = z6;
    }

    public static glb0 a(glb0 glb0Var, boolean z, boolean z2, trd trdVar, trd trdVar2, trd trdVar3, trd trdVar4, trd trdVar5, rn00 rn00Var, rn00 rn00Var2, rn00 rn00Var3, rn00 rn00Var4, rn00 rn00Var5, rn00 rn00Var6, rn00 rn00Var7, rn00 rn00Var8, rn00 rn00Var9, List list, skb0 skb0Var, boolean z3, int i) {
        boolean z4 = (i & 1) != 0 ? glb0Var.f11483a : false;
        boolean z5 = (i & 2) != 0 ? glb0Var.b : false;
        boolean z6 = (i & 4) != 0 ? glb0Var.c : z;
        boolean z7 = (i & 8) != 0 ? glb0Var.d : z2;
        boolean z8 = glb0Var.e;
        urd urdVar = (i & 32) != 0 ? glb0Var.f : trdVar;
        y78 y78Var = glb0Var.g;
        urd urdVar2 = (i & 128) != 0 ? glb0Var.h : trdVar2;
        g2v g2vVar = glb0Var.i;
        ctf0 ctf0Var = glb0Var.j;
        urd urdVar3 = (i & 1024) != 0 ? glb0Var.k : trdVar3;
        urd urdVar4 = (i & 2048) != 0 ? glb0Var.l : trdVar4;
        urd urdVar5 = (i & 4096) != 0 ? glb0Var.m : trdVar5;
        rn00 rn00Var10 = (i & 8192) != 0 ? glb0Var.n : rn00Var;
        rn00 rn00Var11 = (i & 16384) != 0 ? glb0Var.o : rn00Var2;
        rn00 rn00Var12 = (32768 & i) != 0 ? glb0Var.p : rn00Var3;
        rn00 rn00Var13 = (65536 & i) != 0 ? glb0Var.q : rn00Var4;
        rn00 rn00Var14 = (131072 & i) != 0 ? glb0Var.r : rn00Var5;
        rn00 rn00Var15 = (262144 & i) != 0 ? glb0Var.s : rn00Var6;
        rn00 rn00Var16 = (524288 & i) != 0 ? glb0Var.t : rn00Var7;
        rn00 rn00Var17 = (1048576 & i) != 0 ? glb0Var.u : rn00Var8;
        rn00 rn00Var18 = (2097152 & i) != 0 ? glb0Var.v : rn00Var9;
        List list2 = (4194304 & i) != 0 ? glb0Var.w : list;
        skb0 skb0Var2 = (8388608 & i) != 0 ? glb0Var.x : skb0Var;
        boolean z9 = (i & 16777216) != 0 ? glb0Var.y : z3;
        glb0Var.getClass();
        ctf0Var.getClass();
        list2.getClass();
        return new glb0(z4, z5, z6, z7, z8, urdVar, y78Var, urdVar2, g2vVar, ctf0Var, urdVar3, urdVar4, urdVar5, rn00Var10, rn00Var11, rn00Var12, rn00Var13, rn00Var14, rn00Var15, rn00Var16, rn00Var17, rn00Var18, list2, skb0Var2, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glb0)) {
            return false;
        }
        glb0 glb0Var = (glb0) obj;
        return this.f11483a == glb0Var.f11483a && this.b == glb0Var.b && this.c == glb0Var.c && this.d == glb0Var.d && this.e == glb0Var.e && this.f.equals(glb0Var.f) && this.g.equals(glb0Var.g) && this.h.equals(glb0Var.h) && this.i.equals(glb0Var.i) && Intrinsics.d(this.j, glb0Var.j) && this.k.equals(glb0Var.k) && this.l.equals(glb0Var.l) && this.m.equals(glb0Var.m) && this.n.equals(glb0Var.n) && this.o.equals(glb0Var.o) && this.p.equals(glb0Var.p) && this.q.equals(glb0Var.q) && this.r.equals(glb0Var.r) && this.s.equals(glb0Var.s) && this.t.equals(glb0Var.t) && this.u.equals(glb0Var.u) && this.v.equals(glb0Var.v) && Intrinsics.d(this.w, glb0Var.w) && this.x == glb0Var.x && this.y == glb0Var.y;
    }

    public final int hashCode() {
        int iA = dw9.a((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f11483a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.w);
        skb0 skb0Var = this.x;
        return Boolean.hashCode(this.y) + ((iA + (skb0Var == null ? 0 : skb0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PopularSportTabState(initRequest=", ", needToCheckOnboardingState=", ", sportFeedEnable=", this.f11483a, this.b);
        ua80.u(", connected=", ", bettingDisabled=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", hasStream=");
        sbQ.append(this.f);
        sbQ.append(", gameUtilsProvider=");
        sbQ.append(this.g);
        sbQ.append(", champsImageHolder=");
        sbQ.append(this.h);
        sbQ.append(", lottieEmptyConfigurator=");
        sbQ.append(this.i);
        sbQ.append(", resourceManager=");
        sbQ.append(this.j);
        sbQ.append(", sportsCollectionType=");
        sbQ.append(this.k);
        sbQ.append(", sportEventCardStyle=");
        sbQ.append(this.l);
        sbQ.append(", expressCardStyle=");
        sbQ.append(this.m);
        sbQ.append(", sportCollectionState=");
        sbQ.append(this.n);
        sbQ.append(", specialEventInfoList=");
        sbQ.append(this.o);
        sbQ.append(", topLiveGames=");
        sbQ.append(this.p);
        sbQ.append(", topLineGames=");
        sbQ.append(this.q);
        sbQ.append(", topLiveChamps=");
        sbQ.append(this.r);
        sbQ.append(", topLineChamps=");
        sbQ.append(this.s);
        sbQ.append(", topLiveExpress=");
        sbQ.append(this.t);
        sbQ.append(", topLineExpress=");
        sbQ.append(this.u);
        sbQ.append(", highRatedChamps=");
        sbQ.append(this.v);
        sbQ.append(", subSports=");
        sbQ.append(this.w);
        sbQ.append(", onboardingStep=");
        sbQ.append(this.x);
        sbQ.append(", supportRtl=");
        return rw2.p(sbQ, this.y, Separators.RPAREN);
    }
}
