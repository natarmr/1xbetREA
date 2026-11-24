package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class li5 implements mi5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f20087a;

    public li5(mdm mdmVar) {
        this.f20087a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li5) && this.f20087a.equals(((li5) obj).f20087a);
    }

    public final int hashCode() {
        return this.f20087a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f20087a, Separators.RPAREN);
    }
}
