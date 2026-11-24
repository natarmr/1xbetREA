package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v77 implements z77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on5 f36910a;
    public final w2w b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final mdm f;

    public v77(on5 on5Var, w2w w2wVar, boolean z, boolean z2, boolean z3, mdm mdmVar) {
        this.f36910a = on5Var;
        this.b = w2wVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = mdmVar;
    }

    @Override // a.z77
    public final on5 b() {
        return this.f36910a;
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
        if (!(obj instanceof v77)) {
            return false;
        }
        v77 v77Var = (v77) obj;
        return this.f36910a.equals(v77Var.f36910a) && this.b.equals(v77Var.b) && this.c == v77Var.c && this.d == v77Var.d && this.e == v77Var.e && this.f.equals(v77Var.f);
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
        return this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f36910a.hashCode() * 31)) * 31, 31, false), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(balanceUiState=");
        sb.append(this.f36910a);
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
