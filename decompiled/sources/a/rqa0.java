package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30923a;

    public rqa0(long j) {
        this.f30923a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqa0) && this.f30923a == ((rqa0) obj).f30923a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30923a);
    }

    public final String toString() {
        return axq.h(this.f30923a, "SelectionChanged(champId=", Separators.RPAREN);
    }
}
