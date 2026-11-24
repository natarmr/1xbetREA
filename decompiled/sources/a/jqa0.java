package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16941a;

    public jqa0(long j) {
        this.f16941a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqa0) && this.f16941a == ((jqa0) obj).f16941a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16941a);
    }

    public final String toString() {
        return axq.h(this.f16941a, "OnLongClickMultiselect(champId=", Separators.RPAREN);
    }
}
