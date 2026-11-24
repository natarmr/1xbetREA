package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l6a0 implements q6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g130 f19497a;

    public l6a0(g130 g130Var) {
        this.f19497a = g130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6a0) && this.f19497a.equals(((l6a0) obj).f19497a);
    }

    public final int hashCode() {
        return this.f19497a.hashCode();
    }

    public final String toString() {
        return "Markets(delegateAction=" + this.f19497a + Separators.RPAREN;
    }
}
