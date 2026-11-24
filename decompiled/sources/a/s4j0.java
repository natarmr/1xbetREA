package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s4j0 implements a5j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f31609a;

    public s4j0(double d) {
        this.f31609a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4j0) && Double.compare(this.f31609a, ((s4j0) obj).f31609a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f31609a);
    }

    public final String toString() {
        return "DefaultBetSumChanged(defaultSum=" + this.f31609a + Separators.RPAREN;
    }
}
