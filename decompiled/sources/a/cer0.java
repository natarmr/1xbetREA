package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cer0 implements eer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m470 f4226a;

    public cer0(m470 m470Var) {
        this.f4226a = m470Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cer0) && this.f4226a.equals(((cer0) obj).f4226a);
    }

    public final int hashCode() {
        return -1089742149;
    }

    public final String toString() {
        return "SendOneXGamesTapeSideEffect(internalEffect=" + this.f4226a + Separators.RPAREN;
    }
}
