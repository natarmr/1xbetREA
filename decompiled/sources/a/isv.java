package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class isv implements ksv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15324a;

    public final boolean equals(Object obj) {
        if (obj instanceof isv) {
            return this.f15324a.equals(((isv) obj).f15324a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15324a.hashCode();
    }

    public final String toString() {
        return kng0.l("Name(value=", this.f15324a, Separators.RPAREN);
    }
}
