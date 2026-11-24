package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class u0i0 implements w0i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f34855a;

    public u0i0(mdm mdmVar) {
        this.f34855a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0i0) && this.f34855a.equals(((u0i0) obj).f34855a);
    }

    public final int hashCode() {
        return this.f34855a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f34855a, Separators.RPAREN);
    }
}
