package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g060 implements i060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f10443a;

    public g060(mdm mdmVar) {
        this.f10443a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g060) && this.f10443a.equals(((g060) obj).f10443a);
    }

    public final int hashCode() {
        return this.f10443a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f10443a, Separators.RPAREN);
    }
}
