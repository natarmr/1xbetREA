package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yof implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jof f42982a;

    public final boolean equals(Object obj) {
        if (obj instanceof yof) {
            return this.f42982a.equals(((yof) obj).f42982a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42982a.hashCode();
    }

    public final String toString() {
        return "Bomb(value=" + this.f42982a + Separators.RPAREN;
    }
}
