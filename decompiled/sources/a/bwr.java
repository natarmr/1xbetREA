package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bwr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f3339a;

    public final boolean equals(Object obj) {
        if (obj instanceof bwr) {
            return this.f3339a.equals(((bwr) obj).f3339a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3339a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f3339a, Separators.RPAREN);
    }
}
