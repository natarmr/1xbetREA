package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class jm4 implements mm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f16747a;
    public final uu4 b;

    public jm4(Throwable th, uu4 uu4Var) {
        this.f16747a = th;
        this.b = uu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm4)) {
            return false;
        }
        jm4 jm4Var = (jm4) obj;
        return this.f16747a.equals(jm4Var.f16747a) && this.b.equals(jm4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16747a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(throwable=" + this.f16747a + ", authorizationData=" + this.b + Separators.RPAREN;
    }
}
