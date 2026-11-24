package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m9r0 implements n9r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21425a;

    public m9r0(long j) {
        this.f21425a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9r0) && this.f21425a == ((m9r0) obj).f21425a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21425a);
    }

    public final String toString() {
        return axq.h(this.f21425a, "OnTabSwitch(position=", Separators.RPAREN);
    }
}
