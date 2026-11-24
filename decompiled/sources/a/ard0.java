package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ard0 implements drd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f1341a;
    public final j9m0 b;
    public final boolean c;
    public final mdm d;

    public ard0(mdm mdmVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f1341a = zdm0Var;
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
        return this.f1341a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ard0)) {
            return false;
        }
        ard0 ard0Var = (ard0) obj;
        return this.f1341a.equals(ard0Var.f1341a) && this.b.equals(ard0Var.b) && this.c == ard0Var.c && this.d.equals(ard0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(w6x.h(this.b, this.f1341a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Empty(statisticHeaderUiModel=" + this.f1341a + ", statisticBackgroundUiModel=" + this.b + ", rtlSupport=" + this.c + ", lottieConfig=" + this.d + Separators.RPAREN;
    }
}
