package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ms40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22300a;

    public /* synthetic */ ms40(long j) {
        this.f22300a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ms40) {
            return this.f22300a == ((ms40) obj).f22300a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22300a);
    }

    public final String toString() {
        return axq.h(this.f22300a, "IndirectPointerEventData(packedValue=", Separators.RPAREN);
    }
}
