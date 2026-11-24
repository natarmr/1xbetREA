package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eha0 implements hha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f7798a;

    public eha0(mdm mdmVar) {
        this.f7798a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eha0) && this.f7798a.equals(((eha0) obj).f7798a);
    }

    public final int hashCode() {
        return this.f7798a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieEmptyConfig=", this.f7798a, Separators.RPAREN);
    }
}
