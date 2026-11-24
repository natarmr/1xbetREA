package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s5x implements x5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5x f31676a;

    public final boolean equals(Object obj) {
        if (obj instanceof s5x) {
            return this.f31676a.equals(((s5x) obj).f31676a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31676a.hashCode();
    }

    public final String toString() {
        return "FirstPlayerCombination(value=" + this.f31676a + Separators.RPAREN;
    }
}
