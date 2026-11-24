package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ns9 implements ts9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f24042a;

    public ns9(mdm mdmVar) {
        this.f24042a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns9) && this.f24042a.equals(((ns9) obj).f24042a);
    }

    public final int hashCode() {
        return this.f24042a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyContent(emptyConfig=", this.f24042a, Separators.RPAREN);
    }
}
