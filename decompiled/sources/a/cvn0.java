package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cvn0 implements fvn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f5039a;

    public cvn0(mdm mdmVar) {
        this.f5039a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvn0) && this.f5039a.equals(((cvn0) obj).f5039a);
    }

    public final int hashCode() {
        return this.f5039a.hashCode();
    }

    public final String toString() {
        return b1j.j("ErrorGetData(lottieConfig=", this.f5039a, Separators.RPAREN);
    }
}
