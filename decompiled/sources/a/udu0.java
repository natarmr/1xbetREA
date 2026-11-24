package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class udu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35497a;
    public final Long b;

    public udu0(Long l, long j) {
        this.f35497a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udu0)) {
            return false;
        }
        udu0 udu0Var = (udu0) obj;
        return this.f35497a == udu0Var.f35497a && Intrinsics.d(this.b, udu0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f35497a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Timer(value=" + this.f35497a + ", stageTime=" + this.b + Separators.RPAREN;
    }
}
