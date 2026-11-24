package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gy70 implements hy70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f12114a;

    public gy70(p7m0 p7m0Var) {
        this.f12114a = p7m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy70) && this.f12114a == ((gy70) obj).f12114a;
    }

    public final int hashCode() {
        return this.f12114a.hashCode();
    }

    public final String toString() {
        return "Ready(sourceFlow=" + this.f12114a + Separators.RPAREN;
    }
}
