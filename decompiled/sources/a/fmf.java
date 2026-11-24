package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fmf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final orf f9777a;

    public final boolean equals(Object obj) {
        if (obj instanceof fmf) {
            return this.f9777a.equals(((fmf) obj).f9777a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9777a.hashCode();
    }

    public final String toString() {
        return "FivePlayer(value=" + this.f9777a + Separators.RPAREN;
    }
}
