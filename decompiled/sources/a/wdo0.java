package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wdo0 implements zdo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38984a;

    public wdo0(mdm mdmVar) {
        this.f38984a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdo0) && this.f38984a.equals(((wdo0) obj).f38984a);
    }

    public final int hashCode() {
        return this.f38984a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f38984a, Separators.RPAREN);
    }
}
