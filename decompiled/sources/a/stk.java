package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class stk implements vtk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f32776a;
    public final long b;

    public stk(jkm jkmVar, long j) {
        this.f32776a = jkmVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stk)) {
            return false;
        }
        stk stkVar = (stk) obj;
        return this.f32776a.equals(stkVar.f32776a) && this.b == stkVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f32776a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(config=" + this.f32776a + ", countDownTimeMillis=" + this.b + Separators.RPAREN;
    }
}
