package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jmh0 implements lmh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16765a;

    public jmh0(String str) {
        this.f16765a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmh0) && this.f16765a.equals(((jmh0) obj).f16765a);
    }

    public final int hashCode() {
        return this.f16765a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendError(errorMessage=", this.f16765a, Separators.RPAREN);
    }
}
