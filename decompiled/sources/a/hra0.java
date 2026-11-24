package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hra0 implements kra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f13521a;

    public hra0(mdm mdmVar) {
        this.f13521a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hra0) && this.f13521a.equals(((hra0) obj).f13521a);
    }

    public final int hashCode() {
        return this.f13521a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyView(lottieConfig=", this.f13521a, Separators.RPAREN);
    }
}
