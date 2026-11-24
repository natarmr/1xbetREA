package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w77 implements z77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on5 f38658a;
    public final w2w b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public w77(on5 on5Var, w2w w2wVar, boolean z, boolean z2, boolean z3) {
        this.f38658a = on5Var;
        this.b = w2wVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // a.z77
    public final on5 b() {
        return this.f38658a;
    }

    @Override // a.z77
    public final boolean c() {
        return this.e;
    }

    @Override // a.z77
    public final boolean d() {
        return false;
    }

    @Override // a.z77
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w77)) {
            return false;
        }
        w77 w77Var = (w77) obj;
        return this.f38658a.equals(w77Var.f38658a) && this.b.equals(w77Var.b) && this.c == w77Var.c && this.d == w77Var.d && this.e == w77Var.e;
    }

    @Override // a.z77
    public final w2w f() {
        return this.b;
    }

    @Override // a.z77
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f38658a.hashCode() * 31)) * 31, 31, false), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(balanceUiState=");
        sb.append(this.f38658a);
        sb.append(", historyHeaderUiModel=");
        sb.append(this.b);
        sb.append(", pullToRefreshState=false, scrollToTop=");
        ua80.u(", scrollToTopAnimated=", ", isFullScreenLoader=", sb, this.c, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
