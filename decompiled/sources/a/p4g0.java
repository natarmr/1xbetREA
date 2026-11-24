package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p4g0 implements y4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26351a;

    public p4g0(mdm mdmVar) {
        this.f26351a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4g0) && this.f26351a.equals(((p4g0) obj).f26351a);
    }

    public final int hashCode() {
        return this.f26351a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f26351a, Separators.RPAREN);
    }
}
