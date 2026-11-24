package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v9k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37040a;
    public final Long b;

    public v9k0(Long l, long j) {
        this.f37040a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9k0)) {
            return false;
        }
        v9k0 v9k0Var = (v9k0) obj;
        return this.f37040a == v9k0Var.f37040a && Intrinsics.d(this.b, v9k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f37040a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "SlowModeModel(slowModeDelayMs=" + this.f37040a + ", lastSendMessageMs=" + this.b + Separators.RPAREN;
    }
}
