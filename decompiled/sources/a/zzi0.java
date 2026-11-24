package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zzi0 implements b0j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvn f45255a;

    public zzi0(jvn jvnVar) {
        this.f45255a = jvnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzi0) && this.f45255a == ((zzi0) obj).f45255a;
    }

    public final int hashCode() {
        return this.f45255a.hashCode();
    }

    public final String toString() {
        return "OnCoefTypeClick(coefType=" + this.f45255a + Separators.RPAREN;
    }
}
