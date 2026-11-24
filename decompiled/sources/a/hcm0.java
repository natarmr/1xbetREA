package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hcm0 implements jcm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f12830a;
    public final zdm0 b;
    public final boolean c;

    public hcm0(j9m0 j9m0Var, zdm0 zdm0Var, boolean z) {
        this.f12830a = j9m0Var;
        this.b = zdm0Var;
        this.c = z;
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
        return this.f12830a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcm0)) {
            return false;
        }
        hcm0 hcm0Var = (hcm0) obj;
        return this.f12830a.equals(hcm0Var.f12830a) && this.b.equals(hcm0Var.b) && this.c == hcm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kng0.a(this.b, this.f12830a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(backgroundUiModel=");
        sb.append(this.f12830a);
        sb.append(", statisticHeaderUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
