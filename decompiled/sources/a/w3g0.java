package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w3g0 implements x3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2g0 f38501a;

    public w3g0(j2g0 j2g0Var) {
        this.f38501a = j2g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3g0) && this.f38501a.equals(((w3g0) obj).f38501a);
    }

    public final int hashCode() {
        return this.f38501a.hashCode();
    }

    public final String toString() {
        return "SendResultGameCardSideEffect(internalEffect=" + this.f38501a + Separators.RPAREN;
    }
}
