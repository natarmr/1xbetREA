package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pa50 implements sa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf5 f26638a;

    public pa50(uf5 uf5Var) {
        this.f26638a = uf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa50) && this.f26638a.equals(((pa50) obj).f26638a);
    }

    public final int hashCode() {
        return this.f26638a.hashCode();
    }

    public final String toString() {
        return "Badge(badgeStyle=" + this.f26638a + Separators.RPAREN;
    }
}
