package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ok40 implements qk40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f25388a;

    public ok40(mdm mdmVar) {
        this.f25388a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok40) && this.f25388a.equals(((ok40) obj).f25388a);
    }

    public final int hashCode() {
        return this.f25388a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f25388a, Separators.RPAREN);
    }
}
