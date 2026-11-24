package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ta2 implements va2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2g0 f33594a;

    public ta2(j2g0 j2g0Var) {
        this.f33594a = j2g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta2) && this.f33594a.equals(((ta2) obj).f33594a);
    }

    public final int hashCode() {
        return this.f33594a.hashCode();
    }

    public final String toString() {
        return "ResultGameCardSideEffect(internalEffect=" + this.f33594a + Separators.RPAREN;
    }
}
