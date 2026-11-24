package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cef0 implements def0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4209a;

    public final boolean equals(Object obj) {
        if (obj instanceof cef0) {
            return this.f4209a.equals(((cef0) obj).f4209a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4209a.hashCode();
    }

    public final String toString() {
        return b1j.j("Lottie(config=", this.f4209a, Separators.RPAREN);
    }
}
