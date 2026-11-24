package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i4o implements s4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f14155a;

    public final boolean equals(Object obj) {
        if (obj instanceof i4o) {
            return this.f14155a.equals(((i4o) obj).f14155a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14155a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f14155a + Separators.RPAREN;
    }
}
