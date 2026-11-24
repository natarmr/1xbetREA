package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yie implements jje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f42684a;

    public yie(mdm mdmVar) {
        this.f42684a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yie) && this.f42684a.equals(((yie) obj).f42684a);
    }

    public final int hashCode() {
        return this.f42684a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f42684a, Separators.RPAREN);
    }
}
