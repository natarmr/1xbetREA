package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srf f9834a;

    public final boolean equals(Object obj) {
        if (obj instanceof fnf) {
            return this.f9834a.equals(((fnf) obj).f9834a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9834a.hashCode();
    }

    public final String toString() {
        return "ThirdPlayer(value=" + this.f9834a + Separators.RPAREN;
    }
}
