package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mzr implements qzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f22667a;

    public mzr(p5h0 p5h0Var) {
        this.f22667a = p5h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mzr) && this.f22667a.equals(((mzr) obj).f22667a);
    }

    public final int hashCode() {
        return this.f22667a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f22667a, Separators.RPAREN);
    }
}
