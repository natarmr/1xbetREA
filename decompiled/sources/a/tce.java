package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tce implements nde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4s0 f33716a;

    public tce(m4s0 m4s0Var) {
        this.f33716a = m4s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tce) && this.f33716a.equals(((tce) obj).f33716a);
    }

    public final int hashCode() {
        return this.f33716a.hashCode();
    }

    public final String toString() {
        return "Empty(item=" + this.f33716a + Separators.RPAREN;
    }
}
