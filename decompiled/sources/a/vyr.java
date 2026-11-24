package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vyr implements zyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f38262a;

    public vyr(p5h0 p5h0Var) {
        this.f38262a = p5h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyr) && this.f38262a.equals(((vyr) obj).f38262a);
    }

    public final int hashCode() {
        return this.f38262a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f38262a, Separators.RPAREN);
    }
}
