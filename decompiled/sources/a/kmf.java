package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kmf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final orf f18536a;

    public final boolean equals(Object obj) {
        if (obj instanceof kmf) {
            return this.f18536a.equals(((kmf) obj).f18536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18536a.hashCode();
    }

    public final String toString() {
        return "ThirdPlayer(value=" + this.f18536a + Separators.RPAREN;
    }
}
