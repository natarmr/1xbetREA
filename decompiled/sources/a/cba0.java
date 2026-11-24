package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cba0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4053a;

    public final boolean equals(Object obj) {
        if (obj instanceof cba0) {
            return this.f4053a.equals(((cba0) obj).f4053a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4053a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeroName(value=", this.f4053a, Separators.RPAREN);
    }
}
