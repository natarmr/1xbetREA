package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kts0 implements mts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f18882a;

    public kts0(mdm mdmVar) {
        this.f18882a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kts0) && this.f18882a.equals(((kts0) obj).f18882a);
    }

    public final int hashCode() {
        return this.f18882a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyConfig=", this.f18882a, Separators.RPAREN);
    }
}
