package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t3i0 implements v3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk9 f33269a;

    public t3i0(xk9 xk9Var) {
        this.f33269a = xk9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3i0) && this.f33269a.equals(((t3i0) obj).f33269a);
    }

    public final int hashCode() {
        return this.f33269a.hashCode();
    }

    public final String toString() {
        return "OnApplyClick(range=" + this.f33269a + Separators.RPAREN;
    }
}
