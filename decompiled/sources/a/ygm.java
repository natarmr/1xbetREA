package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ygm implements ahm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hgm f42592a;

    public ygm(hgm hgmVar) {
        hgmVar.getClass();
        this.f42592a = hgmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygm) && this.f42592a == ((ygm) obj).f42592a;
    }

    public final int hashCode() {
        return this.f42592a.hashCode();
    }

    public final String toString() {
        return "Single(colorType=" + this.f42592a + Separators.RPAREN;
    }
}
