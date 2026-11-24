package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g10 implements i10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f10485a;

    public g10(mdm mdmVar) {
        this.f10485a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g10) && this.f10485a.equals(((g10) obj).f10485a);
    }

    public final int hashCode() {
        return this.f10485a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f10485a, Separators.RPAREN);
    }
}
