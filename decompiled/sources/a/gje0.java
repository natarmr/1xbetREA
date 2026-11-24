package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gje0 implements ije0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f11392a;

    public gje0(mdm mdmVar) {
        this.f11392a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gje0) && this.f11392a.equals(((gje0) obj).f11392a);
    }

    public final int hashCode() {
        return this.f11392a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f11392a, Separators.RPAREN);
    }
}
