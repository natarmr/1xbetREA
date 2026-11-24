package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i8s0 implements k8s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14355a;

    public final boolean equals(Object obj) {
        if (obj instanceof i8s0) {
            return this.f14355a.equals(((i8s0) obj).f14355a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14355a.hashCode();
    }

    public final String toString() {
        return kng0.l("Name(value=", this.f14355a, Separators.RPAREN);
    }
}
