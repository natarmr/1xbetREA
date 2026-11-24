package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ymf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srf f42885a;

    public final boolean equals(Object obj) {
        if (obj instanceof ymf) {
            return this.f42885a.equals(((ymf) obj).f42885a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42885a.hashCode();
    }

    public final String toString() {
        return "FirstPlayer(value=" + this.f42885a + Separators.RPAREN;
    }
}
