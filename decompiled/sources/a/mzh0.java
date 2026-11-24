package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mzh0 extends ozh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f22656a;

    public mzh0(mdm mdmVar) {
        this.f22656a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mzh0) && this.f22656a.equals(((mzh0) obj).f22656a);
    }

    public final int hashCode() {
        return this.f22656a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f22656a, Separators.RPAREN);
    }
}
