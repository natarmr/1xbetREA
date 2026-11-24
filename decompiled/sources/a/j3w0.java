package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j3w0 implements l3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15855a;

    public final boolean equals(Object obj) {
        if (obj instanceof j3w0) {
            return this.f15855a.equals(((j3w0) obj).f15855a);
        }
        return false;
    }

    @Override // a.l3w0
    public final String getValue() {
        return this.f15855a;
    }

    public final int hashCode() {
        return this.f15855a.hashCode();
    }

    public final String toString() {
        return kng0.l("Max(value=", this.f15855a, Separators.RPAREN);
    }
}
