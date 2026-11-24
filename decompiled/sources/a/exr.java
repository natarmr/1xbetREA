package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class exr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f8592a;

    public final boolean equals(Object obj) {
        if (obj instanceof exr) {
            return this.f8592a.equals(((exr) obj).f8592a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8592a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f8592a, Separators.RPAREN);
    }
}
