package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class doz implements foz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6435a;

    public final boolean equals(Object obj) {
        if (obj instanceof doz) {
            return this.f6435a == ((doz) obj).f6435a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6435a);
    }

    public final String toString() {
        return axq.h(this.f6435a, "StartAt(value=", Separators.RPAREN);
    }
}
