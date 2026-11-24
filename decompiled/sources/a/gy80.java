package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gy80 implements ly80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ow80 f12116a;

    public gy80(ow80 ow80Var) {
        this.f12116a = ow80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy80) && this.f12116a.equals(((gy80) obj).f12116a);
    }

    public final int hashCode() {
        return this.f12116a.hashCode();
    }

    public final String toString() {
        return "OnAnnounceMatchClick(announceParams=" + this.f12116a + Separators.RPAREN;
    }
}
