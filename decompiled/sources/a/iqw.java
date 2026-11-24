package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iqw implements lqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f15230a;
    public final zdm0 b;
    public final j9m0 c;
    public final boolean d;

    public iqw(mdm mdmVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f15230a = mdmVar;
        this.b = zdm0Var;
        this.c = j9m0Var;
        this.d = z;
    }

    @Override // a.lqw
    public final boolean a() {
        return this.d;
    }

    @Override // a.lqw
    public final j9m0 b() {
        return this.c;
    }

    @Override // a.lqw
    public final zdm0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqw)) {
            return false;
        }
        iqw iqwVar = (iqw) obj;
        return this.f15230a.equals(iqwVar.f15230a) && this.b.equals(iqwVar.b) && this.c.equals(iqwVar.c) && this.d == iqwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + w6x.h(this.c, kng0.a(this.b, this.f15230a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Empty(lottieConfig=" + this.f15230a + ", statisticHeaderUiModel=" + this.b + ", statisticBackgroundUiModel=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
