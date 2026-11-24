package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zlf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bpf f44578a;

    public final boolean equals(Object obj) {
        if (obj instanceof zlf) {
            return this.f44578a.equals(((zlf) obj).f44578a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44578a.hashCode();
    }

    public final String toString() {
        return "MapMovement(value=" + this.f44578a + Separators.RPAREN;
    }
}
