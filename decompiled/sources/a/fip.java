package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f9599a;

    public fip(mdm mdmVar) {
        this.f9599a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fip) && this.f9599a.equals(((fip) obj).f9599a);
    }

    public final int hashCode() {
        return this.f9599a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(lottieConfig=", this.f9599a, Separators.RPAREN);
    }
}
