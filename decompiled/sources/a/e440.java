package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz1 f7165a;

    public e440(xz1 xz1Var) {
        this.f7165a = xz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e440) && this.f7165a == ((e440) obj).f7165a;
    }

    public final int hashCode() {
        return this.f7165a.hashCode();
    }

    public final String toString() {
        return "AggregatorSection(type=" + this.f7165a + Separators.RPAREN;
    }
}
