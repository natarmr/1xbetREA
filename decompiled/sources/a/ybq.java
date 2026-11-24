package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ybq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42350a;
    public final long b;

    public ybq(float f, long j) {
        this.f42350a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybq)) {
            return false;
        }
        ybq ybqVar = (ybq) obj;
        return Float.compare(this.f42350a, ybqVar.f42350a) == 0 && znq0.e(this.b, ybqVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Float.hashCode(this.f42350a) * 31);
    }

    public final String toString() {
        return "FinanceGraphPointModel(height=" + this.f42350a + ", timeStamp=" + znq0.h(this.b) + Separators.RPAREN;
    }
}
