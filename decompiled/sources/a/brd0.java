package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class brd0 implements drd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f3076a;
    public final j9m0 b;
    public final boolean c;
    public final mdm d;

    public brd0(mdm mdmVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f3076a = zdm0Var;
        this.b = j9m0Var;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.drd0
    public final boolean a() {
        return this.c;
    }

    @Override // a.drd0
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.drd0
    public final zdm0 c() {
        return this.f3076a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brd0)) {
            return false;
        }
        brd0 brd0Var = (brd0) obj;
        return this.f3076a.equals(brd0Var.f3076a) && this.b.equals(brd0Var.b) && this.c == brd0Var.c && this.d.equals(brd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(w6x.h(this.b, this.f3076a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Error(statisticHeaderUiModel=" + this.f3076a + ", statisticBackgroundUiModel=" + this.b + ", rtlSupport=" + this.c + ", lottieConfig=" + this.d + Separators.RPAREN;
    }
}
