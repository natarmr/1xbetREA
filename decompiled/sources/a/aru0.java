package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aru0 extends bru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f1362a;

    public aru0(mdm mdmVar) {
        this.f1362a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aru0) && this.f1362a.equals(((aru0) obj).f1362a);
    }

    public final int hashCode() {
        return this.f1362a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f1362a, Separators.RPAREN);
    }
}
