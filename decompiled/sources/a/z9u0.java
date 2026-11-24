package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z9u0 implements bau0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f44039a;

    public z9u0(mdm mdmVar) {
        this.f44039a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9u0) && this.f44039a.equals(((z9u0) obj).f44039a);
    }

    public final int hashCode() {
        return this.f44039a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f44039a, Separators.RPAREN);
    }
}
