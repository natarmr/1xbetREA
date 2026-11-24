package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rwr implements uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f31229a;

    public final boolean equals(Object obj) {
        if (obj instanceof rwr) {
            return this.f31229a.equals(((rwr) obj).f31229a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31229a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f31229a, Separators.RPAREN);
    }
}
