package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ajg0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkg0 f975a;
    public final dkg0 b;

    public ajg0(mkg0 mkg0Var, dkg0 dkg0Var) {
        this.f975a = mkg0Var;
        this.b = dkg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajg0)) {
            return false;
        }
        ajg0 ajg0Var = (ajg0) obj;
        return this.f975a.equals(ajg0Var.f975a) && this.b.equals(ajg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f975a.hashCode() * 31);
    }

    public final String toString() {
        return "RpsGameUiModel(table=" + this.f975a + ", result=" + this.b + Separators.RPAREN;
    }
}
