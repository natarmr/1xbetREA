package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pur implements tur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f27631a;

    public pur(p5h0 p5h0Var) {
        this.f27631a = p5h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pur) && this.f27631a.equals(((pur) obj).f27631a);
    }

    public final int hashCode() {
        return this.f27631a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f27631a, Separators.RPAREN);
    }
}
