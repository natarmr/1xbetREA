package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1 f1765a;
    public final rh1 b;

    public b0i(sh1 sh1Var, rh1 rh1Var) {
        rh1Var.getClass();
        this.f1765a = sh1Var;
        this.b = rh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0i)) {
            return false;
        }
        b0i b0iVar = (b0i) obj;
        return this.f1765a == b0iVar.f1765a && this.b == b0iVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1765a.hashCode() * 31);
    }

    public final String toString() {
        return "DSAggregatorProviderCardCollectionAppearanceModel(type=" + this.f1765a + ", style=" + this.b + Separators.RPAREN;
    }
}
