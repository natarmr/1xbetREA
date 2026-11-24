package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class om4 implements qm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f25486a;

    public om4(uu4 uu4Var) {
        this.f25486a = uu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om4) && this.f25486a.equals(((om4) obj).f25486a);
    }

    public final int hashCode() {
        return this.f25486a.hashCode();
    }

    public final String toString() {
        return "NeedCaptcha(authorizationData=" + this.f25486a + Separators.RPAREN;
    }
}
