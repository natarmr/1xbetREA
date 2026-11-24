package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kua0 extends mua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f18903a;

    public kua0(mdm mdmVar) {
        this.f18903a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kua0) && this.f18903a.equals(((kua0) obj).f18903a);
    }

    public final int hashCode() {
        return this.f18903a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f18903a, Separators.RPAREN);
    }
}
