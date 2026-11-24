package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pgv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26968a;

    public final boolean equals(Object obj) {
        if (obj instanceof pgv) {
            return this.f26968a == ((pgv) obj).f26968a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26968a);
    }

    public final String toString() {
        return axq.h(this.f26968a, "GridItemSpan(packedValue=", Separators.RPAREN);
    }
}
