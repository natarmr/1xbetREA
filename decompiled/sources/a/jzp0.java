package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jzp0 implements lzp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f17428a;

    public jzp0(mdm mdmVar) {
        this.f17428a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzp0) && this.f17428a.equals(((jzp0) obj).f17428a);
    }

    public final int hashCode() {
        return this.f17428a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorLottie=", this.f17428a, Separators.RPAREN);
    }
}
