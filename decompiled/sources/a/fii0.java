package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9590a;
    public final long b;

    public fii0(Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        obj.getClass();
        this.f9590a = obj;
        this.b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fii0)) {
            return false;
        }
        fii0 fii0Var = (fii0) obj;
        return Intrinsics.d(this.f9590a, fii0Var.f9590a) && this.b == fii0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f9590a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedService(service=" + this.f9590a + ", createTime=" + this.b + Separators.RPAREN;
    }
}
