package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fzo0 implements hzo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f10417a;

    public fzo0(mdm mdmVar) {
        this.f10417a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzo0) && this.f10417a.equals(((fzo0) obj).f10417a);
    }

    public final int hashCode() {
        return this.f10417a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f10417a, Separators.RPAREN);
    }
}
