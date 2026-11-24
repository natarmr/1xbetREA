package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ell0 implements jll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8005a;

    public ell0(String str) {
        this.f8005a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ell0) && this.f8005a.equals(((ell0) obj).f8005a);
    }

    public final int hashCode() {
        return this.f8005a.hashCode();
    }

    public final String toString() {
        return kng0.l("Initialize(screen=", this.f8005a, Separators.RPAREN);
    }
}
