package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class men0 implements pen0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f21655a;

    public men0(mdm mdmVar) {
        mdmVar.getClass();
        this.f21655a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof men0) && this.f21655a.equals(((men0) obj).f21655a);
    }

    public final int hashCode() {
        return this.f21655a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return b1j.j("Error(isRefreshing=false, lottieConfig=", this.f21655a, Separators.RPAREN);
    }
}
