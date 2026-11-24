package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lec0 implements nec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f19896a;

    public lec0(mdm mdmVar) {
        this.f19896a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lec0) && this.f19896a.equals(((lec0) obj).f19896a);
    }

    public final int hashCode() {
        return this.f19896a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f19896a, Separators.RPAREN);
    }
}
