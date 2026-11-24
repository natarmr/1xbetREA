package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class dmn implements gmn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6329a;

    public dmn(mdm mdmVar) {
        this.f6329a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmn) && this.f6329a.equals(((dmn) obj).f6329a);
    }

    public final int hashCode() {
        return this.f6329a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f6329a, Separators.RPAREN);
    }
}
