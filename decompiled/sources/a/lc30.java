package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lc30 implements oc30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad30 f19781a;
    public final mdm b;
    public final boolean c;

    public lc30(ad30 ad30Var, mdm mdmVar, boolean z) {
        this.f19781a = ad30Var;
        this.b = mdmVar;
        this.c = z;
    }

    @Override // a.oc30
    public final boolean a() {
        return this.c;
    }

    @Override // a.oc30
    public final ad30 b() {
        return this.f19781a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc30)) {
            return false;
        }
        lc30 lc30Var = (lc30) obj;
        return this.f19781a.equals(lc30Var.f19781a) && this.b.equals(lc30Var.b) && this.c == lc30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f140.d(this.b, this.f19781a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f19781a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
