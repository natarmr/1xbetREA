package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class km6 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc9 f18523a;

    public final boolean equals(Object obj) {
        if (obj instanceof km6) {
            return this.f18523a.equals(((km6) obj).f18523a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18523a.hashCode();
    }

    public final String toString() {
        return "BetBuilder(value=" + this.f18523a + Separators.RPAREN;
    }
}
