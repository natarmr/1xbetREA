package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gtp0 implements itp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csp0 f11891a;
    public final mdm b;
    public final boolean c;

    public gtp0(csp0 csp0Var, mdm mdmVar, boolean z) {
        this.f11891a = csp0Var;
        this.b = mdmVar;
        this.c = z;
    }

    @Override // a.itp0
    public final boolean a() {
        return this.c;
    }

    @Override // a.itp0
    public final csp0 b() {
        return this.f11891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtp0)) {
            return false;
        }
        gtp0 gtp0Var = (gtp0) obj;
        return this.f11891a.equals(gtp0Var.f11891a) && this.b.equals(gtp0Var.b) && this.c == gtp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f140.d(this.b, this.f11891a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f11891a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
