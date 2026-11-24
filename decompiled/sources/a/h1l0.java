package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h1l0 implements i1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f12289a;

    public h1l0(pzu pzuVar) {
        this.f12289a = pzuVar;
    }

    @Override // a.i1l0
    public final pzu e() {
        return this.f12289a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1l0) && this.f12289a == ((h1l0) obj).f12289a;
    }

    public final int hashCode() {
        return this.f12289a.hashCode();
    }

    public final String toString() {
        return "Loading(strings=" + this.f12289a + Separators.RPAREN;
    }
}
