package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y77 implements z77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on5 f42138a;
    public final w2w b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final mdm f;
    public final g7t0 g;

    public y77(on5 on5Var, w2w w2wVar, boolean z, boolean z2, boolean z3, mdm mdmVar, g7t0 g7t0Var) {
        this.f42138a = on5Var;
        this.b = w2wVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = mdmVar;
        this.g = g7t0Var;
    }

    @Override // a.z77
    public final on5 b() {
        return this.f42138a;
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
        if (!(obj instanceof y77)) {
            return false;
        }
        y77 y77Var = (y77) obj;
        return this.f42138a.equals(y77Var.f42138a) && this.b.equals(y77Var.b) && this.c == y77Var.c && this.d == y77Var.d && this.e == y77Var.e && this.f.equals(y77Var.f) && this.g.equals(y77Var.g);
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
        return this.g.hashCode() + f140.d(this.f, brm0.e(brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f42138a.hashCode() * 31)) * 31, 31, false), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnAuthorizationUiState(balanceUiState=");
        sb.append(this.f42138a);
        sb.append(", historyHeaderUiModel=");
        sb.append(this.b);
        sb.append(", pullToRefreshState=false, scrollToTop=");
        ua80.u(", scrollToTopAnimated=", ", isFullScreenLoader=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", lottieConfigurator=");
        sb.append(this.f);
        sb.append(", unAuthorizationUiModel=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
