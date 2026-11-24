package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xiw extends yiw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40967a;

    public xiw(mdm mdmVar) {
        this.f40967a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xiw) && this.f40967a.equals(((xiw) obj).f40967a);
    }

    public final int hashCode() {
        return this.f40967a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f40967a, Separators.RPAREN);
    }
}
