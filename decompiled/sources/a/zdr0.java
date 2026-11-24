package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zdr0 implements eer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk0 f44221a;

    public zdr0(tk0 tk0Var) {
        this.f44221a = tk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdr0) && this.f44221a.equals(((zdr0) obj).f44221a);
    }

    public final int hashCode() {
        return this.f44221a.hashCode();
    }

    public final String toString() {
        return "SendAggregatorSideEffect(internalEffect=" + this.f44221a + Separators.RPAREN;
    }
}
