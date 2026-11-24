package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d5k0 implements f5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4k0 f5510a;
    public final mdm b;
    public final boolean c;

    public d5k0(z4k0 z4k0Var, mdm mdmVar, boolean z) {
        this.f5510a = z4k0Var;
        this.b = mdmVar;
        this.c = z;
    }

    @Override // a.f5k0
    public final boolean a() {
        return this.c;
    }

    @Override // a.f5k0
    public final z4k0 b() {
        return this.f5510a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5k0)) {
            return false;
        }
        d5k0 d5k0Var = (d5k0) obj;
        return this.f5510a.equals(d5k0Var.f5510a) && this.b.equals(d5k0Var.b) && this.c == d5k0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f140.d(this.b, this.f5510a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f5510a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
