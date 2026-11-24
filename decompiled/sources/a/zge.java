package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zge implements cie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f44342a;

    public zge(mdm mdmVar) {
        this.f44342a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zge) && this.f44342a.equals(((zge) obj).f44342a);
    }

    public final int hashCode() {
        return this.f44342a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(lottieConfig=", this.f44342a, Separators.RPAREN);
    }
}
