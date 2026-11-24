package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ira0 implements kra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f15247a;

    public ira0(mdm mdmVar) {
        this.f15247a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ira0) && this.f15247a.equals(((ira0) obj).f15247a);
    }

    public final int hashCode() {
        return this.f15247a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyViewWithTimer(lottieConfig=", this.f15247a, Separators.RPAREN);
    }
}
