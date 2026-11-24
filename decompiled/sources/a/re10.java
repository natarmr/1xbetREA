package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class re10 implements se10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f30314a;

    public re10(mdm mdmVar) {
        this.f30314a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re10) && this.f30314a.equals(((re10) obj).f30314a);
    }

    public final int hashCode() {
        return this.f30314a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f30314a, Separators.RPAREN);
    }
}
