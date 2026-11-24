package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q0j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27902a;

    public q0j0(String str) {
        this.f27902a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0j0) && this.f27902a.equals(((q0j0) obj).f27902a);
    }

    public final int hashCode() {
        return this.f27902a.hashCode();
    }

    public final String toString() {
        return kng0.l("CopyTextInBuffer(text=", this.f27902a, Separators.RPAREN);
    }
}
