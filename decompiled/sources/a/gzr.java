package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gzr implements hzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f12194a;

    public final boolean equals(Object obj) {
        if (obj instanceof gzr) {
            return this.f12194a.equals(((gzr) obj).f12194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12194a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f12194a, Separators.RPAREN);
    }
}
