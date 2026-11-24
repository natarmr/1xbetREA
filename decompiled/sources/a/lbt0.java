package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lbt0 implements mbt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f19767a;

    public lbt0(mdm mdmVar) {
        this.f19767a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbt0) && this.f19767a.equals(((lbt0) obj).f19767a);
    }

    public final int hashCode() {
        return this.f19767a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f19767a, Separators.RPAREN);
    }
}
