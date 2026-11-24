package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qg2 implements tg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2g0 f28662a;

    public qg2(j2g0 j2g0Var) {
        this.f28662a = j2g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg2) && this.f28662a.equals(((qg2) obj).f28662a);
    }

    public final int hashCode() {
        return this.f28662a.hashCode();
    }

    public final String toString() {
        return "SendResultGameCardSideEffect(internalEffect=" + this.f28662a + Separators.RPAREN;
    }
}
