package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srf f6365a;

    public final boolean equals(Object obj) {
        if (obj instanceof dnf) {
            return this.f6365a.equals(((dnf) obj).f6365a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6365a.hashCode();
    }

    public final String toString() {
        return "SecondPlayer(value=" + this.f6365a + Separators.RPAREN;
    }
}
