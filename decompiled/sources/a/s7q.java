package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0d f31762a;

    public s7q(p0d p0dVar) {
        this.f31762a = p0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7q) && this.f31762a.equals(((s7q) obj).f31762a);
    }

    public final int hashCode() {
        return this.f31762a.hashCode();
    }

    public final String toString() {
        return "ChosenCoefficientState(coefficientsCarriageUiModel=" + this.f31762a + Separators.RPAREN;
    }
}
