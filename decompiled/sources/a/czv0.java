package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class czv0 implements hzv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f5243a;

    public czv0(mdm mdmVar) {
        this.f5243a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czv0) && this.f5243a.equals(((czv0) obj).f5243a);
    }

    public final int hashCode() {
        return this.f5243a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f5243a, Separators.RPAREN);
    }
}
