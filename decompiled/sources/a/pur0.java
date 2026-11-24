package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rjr0 f27632a;
    public final String b;

    public pur0(rjr0 rjr0Var, String str) {
        this.f27632a = rjr0Var;
        this.b = str;
    }

    public static pur0 a(pur0 pur0Var, rjr0 rjr0Var, String str, int i) {
        if ((i & 1) != 0) {
            rjr0Var = pur0Var.f27632a;
        }
        if ((i & 2) != 0) {
            str = pur0Var.b;
        }
        pur0Var.getClass();
        return new pur0(rjr0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pur0)) {
            return false;
        }
        pur0 pur0Var = (pur0) obj;
        return this.f27632a.equals(pur0Var.f27632a) && this.b.equals(pur0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27632a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoSimpleBetPageState(betFieldState=" + this.f27632a + ", taxDescriptionText=" + this.b + Separators.RPAREN;
    }
}
