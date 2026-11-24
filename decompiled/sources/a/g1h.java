package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g1h implements h1h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10511a;
    public final Long b;

    public g1h(Long l, long j) {
        this.f10511a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1h)) {
            return false;
        }
        g1h g1hVar = (g1h) obj;
        return this.f10511a == g1hVar.f10511a && Intrinsics.d(this.b, g1hVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f10511a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TimeDescription(milliseconds=" + this.f10511a + ", stageTime=" + this.b + Separators.RPAREN;
    }
}
