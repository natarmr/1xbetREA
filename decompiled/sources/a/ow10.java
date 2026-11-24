package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ow10 implements qw10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25950a;

    public final boolean equals(Object obj) {
        if (obj instanceof ow10) {
            return this.f25950a == ((ow10) obj).f25950a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25950a);
    }

    public final String toString() {
        return ua80.e(this.f25950a, "LocalRes(value=", Separators.RPAREN);
    }
}
