package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class asd0 implements csd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f1387a;

    public asd0(mdm mdmVar) {
        this.f1387a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asd0) && this.f1387a.equals(((asd0) obj).f1387a);
    }

    public final int hashCode() {
        return this.f1387a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f1387a, Separators.RPAREN);
    }
}
