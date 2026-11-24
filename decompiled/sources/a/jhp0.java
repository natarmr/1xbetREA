package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jhp0 implements lhp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f16539a;

    public jhp0(mdm mdmVar) {
        this.f16539a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhp0) && this.f16539a.equals(((jhp0) obj).f16539a);
    }

    public final int hashCode() {
        return this.f16539a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieEmptyConfig=", this.f16539a, Separators.RPAREN);
    }
}
