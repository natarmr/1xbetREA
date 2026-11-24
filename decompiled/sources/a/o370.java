package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o370 extends q370 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn60 f24569a;

    public o370(tn60 tn60Var) {
        this.f24569a = tn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o370) && this.f24569a.equals(((o370) obj).f24569a);
    }

    public final int hashCode() {
        return this.f24569a.hashCode();
    }

    public final String toString() {
        return "SendOneXGamesSideEffect(internalEffect=" + this.f24569a + Separators.RPAREN;
    }
}
