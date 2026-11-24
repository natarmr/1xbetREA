package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yyv0 implements azv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn60 f43488a;

    public yyv0(tn60 tn60Var) {
        this.f43488a = tn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyv0) && this.f43488a.equals(((yyv0) obj).f43488a);
    }

    public final int hashCode() {
        return this.f43488a.hashCode();
    }

    public final String toString() {
        return "SendOneXGamesSideEffect(internalEffect=" + this.f43488a + Separators.RPAREN;
    }
}
