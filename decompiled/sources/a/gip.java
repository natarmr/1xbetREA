package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f11359a;

    public gip(mdm mdmVar) {
        this.f11359a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gip) && this.f11359a.equals(((gip) obj).f11359a);
    }

    public final int hashCode() {
        return this.f11359a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f11359a, Separators.RPAREN);
    }
}
