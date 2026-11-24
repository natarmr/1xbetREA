package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class agl0 implements dgl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f829a;

    public agl0(long j) {
        this.f829a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agl0) && this.f829a == ((agl0) obj).f829a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f829a);
    }

    public final String toString() {
        return axq.h(this.f829a, "SportClicked(sportId=", Separators.RPAREN);
    }
}
