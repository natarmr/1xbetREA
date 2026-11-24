package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yw30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43352a;

    public yw30(String str) {
        this.f43352a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw30) && this.f43352a.equals(((yw30) obj).f43352a);
    }

    public final int hashCode() {
        return this.f43352a.hashCode();
    }

    public final String toString() {
        return kng0.l("Cancel(betId=", this.f43352a, Separators.RPAREN);
    }
}
