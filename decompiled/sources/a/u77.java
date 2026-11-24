package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u77 implements z77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on5 f35170a;
    public final w2w b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final mdm f;

    public u77(on5 on5Var, w2w w2wVar, boolean z, boolean z2, boolean z3, mdm mdmVar) {
        this.f35170a = on5Var;
        this.b = w2wVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = mdmVar;
    }

    @Override // a.z77
    public final on5 b() {
        return this.f35170a;
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
        if (!(obj instanceof u77)) {
            return false;
        }
        u77 u77Var = (u77) obj;
        return this.f35170a.equals(u77Var.f35170a) && this.b.equals(u77Var.b) && this.c == u77Var.c && this.d == u77Var.d && this.e == u77Var.e && this.f.equals(u77Var.f);
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
        return this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f35170a.hashCode() * 31)) * 31, 31, false), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty(balanceUiState=");
        sb.append(this.f35170a);
        sb.append(", historyHeaderUiModel=");
        sb.append(this.b);
        sb.append(", pullToRefreshState=false, scrollToTop=");
        ua80.u(", scrollToTopAnimated=", ", isFullScreenLoader=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", lottieConfigurator=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
