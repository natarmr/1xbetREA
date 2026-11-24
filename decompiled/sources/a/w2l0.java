package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ope f38455a;
    public final int b;

    public w2l0(int i, ope opeVar) {
        this.f38455a = opeVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2l0)) {
            return false;
        }
        w2l0 w2l0Var = (w2l0) obj;
        return this.f38455a.equals(w2l0Var.f38455a) && this.b == w2l0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f38455a.hashCode() * 31);
    }

    public final String toString() {
        return "Counter(counterStyle=" + this.f38455a + ", counterValue=" + this.b + Separators.RPAREN;
    }
}
