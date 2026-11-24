package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kpg0 implements mpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18674a;
    public final Long b;

    public kpg0(Long l, long j) {
        this.f18674a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpg0)) {
            return false;
        }
        kpg0 kpg0Var = (kpg0) obj;
        return this.f18674a == kpg0Var.f18674a && Intrinsics.d(this.b, kpg0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f18674a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TimeBeforeStart(value=" + this.f18674a + ", stageTime=" + this.b + Separators.RPAREN;
    }
}
