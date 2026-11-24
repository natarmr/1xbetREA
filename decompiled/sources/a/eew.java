package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eew extends jwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f7693a;

    public eew(mdm mdmVar) {
        this.f7693a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eew) && this.f7693a.equals(((eew) obj).f7693a);
    }

    public final int hashCode() {
        return this.f7693a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f7693a, Separators.RPAREN);
    }
}
