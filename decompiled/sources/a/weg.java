package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class weg extends xeg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f39017a;

    public weg(mdm mdmVar) {
        this.f39017a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof weg) && this.f39017a.equals(((weg) obj).f39017a);
    }

    public final int hashCode() {
        return this.f39017a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f39017a, Separators.RPAREN);
    }
}
