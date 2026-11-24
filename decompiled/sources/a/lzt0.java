package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lzt0 implements nzt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f20921a;

    public lzt0(mdm mdmVar) {
        this.f20921a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lzt0) && this.f20921a.equals(((lzt0) obj).f20921a);
    }

    public final int hashCode() {
        return this.f20921a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f20921a, Separators.RPAREN);
    }
}
