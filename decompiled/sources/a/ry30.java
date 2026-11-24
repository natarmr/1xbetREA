package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ry30 implements wy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f31293a;

    public final boolean equals(Object obj) {
        if (obj instanceof ry30) {
            return this.f31293a == ((ry30) obj).f31293a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31293a.hashCode();
    }

    @Override // a.wy30
    public final iz30 m() {
        return this.f31293a;
    }

    public final String toString() {
        return "Simple(menuItemModel=" + this.f31293a + Separators.RPAREN;
    }
}
