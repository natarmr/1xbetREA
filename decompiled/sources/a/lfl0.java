package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lfl0 implements pfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f19963a;

    public lfl0(mdm mdmVar) {
        this.f19963a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfl0) && this.f19963a.equals(((lfl0) obj).f19963a);
    }

    public final int hashCode() {
        return this.f19963a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyView(lottieConfig=", this.f19963a, Separators.RPAREN);
    }
}
