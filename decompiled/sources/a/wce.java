package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wce implements mde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38920a;

    public wce(mdm mdmVar) {
        this.f38920a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wce) && this.f38920a.equals(((wce) obj).f38920a);
    }

    public final int hashCode() {
        return this.f38920a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f38920a, Separators.RPAREN);
    }
}
