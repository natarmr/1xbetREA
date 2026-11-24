package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wxr implements yxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f39943a;

    public final boolean equals(Object obj) {
        if (obj instanceof wxr) {
            return this.f39943a.equals(((wxr) obj).f39943a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39943a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f39943a, Separators.RPAREN);
    }
}
