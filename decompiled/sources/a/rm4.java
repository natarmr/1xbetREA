package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rm4 implements tm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f30728a;
    public final uu4 b;

    public rm4(Throwable th, uu4 uu4Var) {
        this.f30728a = th;
        this.b = uu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm4)) {
            return false;
        }
        rm4 rm4Var = (rm4) obj;
        return this.f30728a.equals(rm4Var.f30728a) && this.b.equals(rm4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30728a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(throwable=" + this.f30728a + ", authorizationData=" + this.b + Separators.RPAREN;
    }
}
