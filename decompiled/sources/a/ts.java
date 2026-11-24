package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ts implements xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34439a;

    public final boolean equals(Object obj) {
        if (obj instanceof ts) {
            return this.f34439a == ((ts) obj).f34439a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34439a);
    }

    public final String toString() {
        return defpackage.c.d("FingerPrintStateUpdated(value=", Separators.RPAREN, this.f34439a);
    }
}
