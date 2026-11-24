package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fws implements hws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f10274a;

    public fws(mdm mdmVar) {
        this.f10274a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fws) && this.f10274a.equals(((fws) obj).f10274a);
    }

    public final int hashCode() {
        return this.f10274a.hashCode();
    }

    public final String toString() {
        return b1j.j("Lottie(lottie=", this.f10274a, Separators.RPAREN);
    }
}
