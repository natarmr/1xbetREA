package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wa40 implements ab40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38811a;

    public wa40(long j) {
        this.f38811a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa40) && this.f38811a == ((wa40) obj).f38811a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38811a);
    }

    public final String toString() {
        return axq.h(this.f38811a, "OnChipClick(id=", Separators.RPAREN);
    }
}
