package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nx60 extends px60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn60 f24268a;

    public nx60(tn60 tn60Var) {
        this.f24268a = tn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx60) && this.f24268a.equals(((nx60) obj).f24268a);
    }

    public final int hashCode() {
        return this.f24268a.hashCode();
    }

    public final String toString() {
        return "SendOneXGamesSideEffect(internalEffect=" + this.f24268a + Separators.RPAREN;
    }
}
