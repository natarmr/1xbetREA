package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class raf implements bbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30131a;

    public raf(int i) {
        this.f30131a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof raf) && this.f30131a == ((raf) obj).f30131a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30131a);
    }

    public final String toString() {
        return ua80.e(this.f30131a, "ErrorInputPassword(message=", Separators.RPAREN);
    }
}
