package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iqm0 implements lqm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f15217a;
    public final long b;

    public iqm0(jkm jkmVar, long j) {
        this.f15217a = jkmVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqm0)) {
            return false;
        }
        iqm0 iqm0Var = (iqm0) obj;
        return this.f15217a.equals(iqm0Var.f15217a) && this.b == iqm0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f15217a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f15217a + ", countDownTimeMillis=" + this.b + Separators.RPAREN;
    }
}
