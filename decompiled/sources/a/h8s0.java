package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h8s0 implements k8s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12643a;

    public final boolean equals(Object obj) {
        if (obj instanceof h8s0) {
            return this.f12643a.equals(((h8s0) obj).f12643a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12643a.hashCode();
    }

    public final String toString() {
        return kng0.l("Image(value=", this.f12643a, Separators.RPAREN);
    }
}
