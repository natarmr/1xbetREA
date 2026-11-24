package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gyh0 implements hyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12130a;
    public final Long b;

    public gyh0(Long l, long j) {
        this.f12130a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyh0)) {
            return false;
        }
        gyh0 gyh0Var = (gyh0) obj;
        return this.f12130a == gyh0Var.f12130a && Intrinsics.d(this.b, gyh0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f12130a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Timer(value=" + this.f12130a + ", stageTime=" + this.b + Separators.RPAREN;
    }
}
