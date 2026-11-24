package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class axd0 implements cxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f1620a;

    public axd0(mdm mdmVar) {
        this.f1620a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axd0) && this.f1620a.equals(((axd0) obj).f1620a);
    }

    public final int hashCode() {
        return this.f1620a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f1620a, Separators.RPAREN);
    }
}
