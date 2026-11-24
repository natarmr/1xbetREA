package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uyt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36508a;

    public final boolean equals(Object obj) {
        if (obj instanceof uyt0) {
            return this.f36508a == ((uyt0) obj).f36508a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36508a);
    }

    public final String toString() {
        return axq.h(this.f36508a, "TabClick(value=", Separators.RPAREN);
    }
}
