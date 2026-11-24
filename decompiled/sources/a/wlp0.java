package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wlp0 implements xlp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnp0 f39367a;

    public final boolean equals(Object obj) {
        if (obj instanceof wlp0) {
            return this.f39367a.equals(((wlp0) obj).f39367a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39367a.hashCode();
    }

    public final String toString() {
        return "Team(value=" + this.f39367a + Separators.RPAREN;
    }
}
