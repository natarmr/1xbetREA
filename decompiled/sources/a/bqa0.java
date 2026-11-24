package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3019a;

    public bqa0(long j) {
        this.f3019a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqa0) && this.f3019a == ((bqa0) obj).f3019a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3019a);
    }

    public final String toString() {
        return axq.h(this.f3019a, "ItemClicked(selectedId=", Separators.RPAREN);
    }
}
