package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class idn0 implements mdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f14595a;

    public idn0(mdm mdmVar) {
        this.f14595a = mdmVar;
    }

    @Override // a.mdn0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idn0) && this.f14595a.equals(((idn0) obj).f14595a);
    }

    public final int hashCode() {
        return this.f14595a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return b1j.j("Error(isRefreshing=false, lottieConfig=", this.f14595a, Separators.RPAREN);
    }
}
