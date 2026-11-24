package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nlh0 implements plh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f23728a;

    public nlh0(mdm mdmVar) {
        this.f23728a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlh0) && this.f23728a.equals(((nlh0) obj).f23728a);
    }

    public final int hashCode() {
        return this.f23728a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f23728a, Separators.RPAREN);
    }
}
