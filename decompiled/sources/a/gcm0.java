package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gcm0 implements jcm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f11071a;
    public final zdm0 b;
    public final boolean c;
    public final mdm d;

    public gcm0(mdm mdmVar, j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f11071a = j9m0Var;
        this.b = zdm0Var;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.jcm0
    public final boolean a() {
        return this.c;
    }

    @Override // a.jcm0
    public final zdm0 c() {
        return this.b;
    }

    @Override // a.jcm0
    public final j9m0 d() {
        return this.f11071a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcm0)) {
            return false;
        }
        gcm0 gcm0Var = (gcm0) obj;
        return this.f11071a.equals(gcm0Var.f11071a) && this.b.equals(gcm0Var.b) && this.c == gcm0Var.c && this.d.equals(gcm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(kng0.a(this.b, this.f11071a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Error(backgroundUiModel=" + this.f11071a + ", statisticHeaderUiModel=" + this.b + ", rtlSupport=" + this.c + ", lottieConfig=" + this.d + Separators.RPAREN;
    }
}
