package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tl8 implements vl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34130a;
    public final imm b;
    public final boolean c;
    public final ijl d;
    public final jjl e;
    public final gjl f;
    public final bgi0 g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final hyl k;
    public final boolean l;
    public final boolean m;
    public final a4x n;

    public tl8(long j, imm immVar, boolean z, ijl ijlVar, jjl jjlVar, gjl gjlVar, bgi0 bgi0Var, long j2, boolean z2, boolean z3, hyl hylVar, boolean z4, boolean z5, a4x a4xVar) {
        immVar.getClass();
        ijlVar.getClass();
        jjlVar.getClass();
        gjlVar.getClass();
        bgi0Var.getClass();
        hylVar.getClass();
        a4xVar.getClass();
        this.f34130a = j;
        this.b = immVar;
        this.c = z;
        this.d = ijlVar;
        this.e = jjlVar;
        this.f = gjlVar;
        this.g = bgi0Var;
        this.h = j2;
        this.i = z2;
        this.j = z3;
        this.k = hylVar;
        this.l = z4;
        this.m = z5;
        this.n = a4xVar;
    }

    @Override // a.vl8
    public final imm a() {
        return this.b;
    }

    @Override // a.vl8
    public final ijl c() {
        return this.d;
    }

    @Override // a.vl8
    public final jjl d() {
        return this.e;
    }

    @Override // a.vl8
    public final gjl e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl8)) {
            return false;
        }
        tl8 tl8Var = (tl8) obj;
        long j = tl8Var.f34130a;
        int i = y3d.h;
        return h2t0.a(this.f34130a, j) && Intrinsics.d(this.b, tl8Var.b) && this.c == tl8Var.c && this.d == tl8Var.d && Intrinsics.d(this.e, tl8Var.e) && this.f == tl8Var.f && Intrinsics.d(this.g, tl8Var.g) && h2t0.a(this.h, tl8Var.h) && this.i == tl8Var.i && this.j == tl8Var.j && Intrinsics.d(this.k, tl8Var.k) && this.l == tl8Var.l && this.m == tl8Var.m && Intrinsics.d(this.n, tl8Var.n);
    }

    @Override // a.vl8
    public final boolean f() {
        return this.i;
    }

    @Override // a.vl8
    public final boolean g() {
        return this.c;
    }

    @Override // a.vl8
    public final long h() {
        return this.h;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.n.hashCode() + brm0.e(brm0.e((this.k.hashCode() + brm0.e(brm0.e(rw2.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(h97.a(this.b, Long.hashCode(this.f34130a) * 31, 31), 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m);
    }

    @Override // a.vl8
    public final long i() {
        return this.f34130a;
    }

    @Override // a.vl8
    public final bgi0 j() {
        return this.g;
    }

    public final String toString() {
        String strI = y3d.i(this.f34130a);
        String strI2 = y3d.i(this.h);
        StringBuilder sb = new StringBuilder("Content(screenBgColor=");
        sb.append(strI);
        sb.append(", navBarUiModel=");
        sb.append(this.b);
        sb.append(", accountSelectionVisible=");
        sb.append(this.c);
        sb.append(", accountSelectionStyle=");
        sb.append(this.d);
        sb.append(", accountSelectionUiModel=");
        sb.append(this.e);
        sb.append(", accountSelectionColorMode=");
        sb.append(this.f);
        sb.append(", topContentSeparatorStyle=");
        sb.append(this.g);
        sb.append(", systemBarsColor=");
        sb.append(strI2);
        sb.append(", tabBarVisible=");
        ua80.u(", isRefreshing=", ", chipsUiModel=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", chipsVisible=");
        sb.append(this.l);
        sb.append(", isRefreshable=");
        sb.append(this.m);
        sb.append(", content=");
        sb.append(this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
