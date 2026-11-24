package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ahr0 implements ghr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f887a;
    public final md80 b;

    public ahr0(int i, md80 md80Var) {
        this.f887a = i;
        this.b = md80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahr0)) {
            return false;
        }
        ahr0 ahr0Var = (ahr0) obj;
        return this.f887a == ahr0Var.f887a && this.b == ahr0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f887a) * 31);
    }

    public final String toString() {
        return "OnOutcomeClick(id=" + this.f887a + ", outcome=" + this.b + Separators.RPAREN;
    }
}
