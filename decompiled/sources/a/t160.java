package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t160 implements b260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn60 f33155a;

    public t160(tn60 tn60Var) {
        this.f33155a = tn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t160) && this.f33155a.equals(((t160) obj).f33155a);
    }

    public final int hashCode() {
        return this.f33155a.hashCode();
    }

    public final String toString() {
        return "SendOneXGamesSideEffect(internalEffect=" + this.f33155a + Separators.RPAREN;
    }
}
