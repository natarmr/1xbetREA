package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class emf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final orf f8043a;

    public final boolean equals(Object obj) {
        if (obj instanceof emf) {
            return this.f8043a.equals(((emf) obj).f8043a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8043a.hashCode();
    }

    public final String toString() {
        return "FirstPlayer(value=" + this.f8043a + Separators.RPAREN;
    }
}
