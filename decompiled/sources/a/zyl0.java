package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zyl0 implements czl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f45212a;

    public zyl0(mdm mdmVar) {
        this.f45212a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyl0) && this.f45212a.equals(((zyl0) obj).f45212a);
    }

    public final int hashCode() {
        return this.f45212a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f45212a, Separators.RPAREN);
    }
}
