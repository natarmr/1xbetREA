package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zzk implements b0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0l f45258a;

    public zzk(n0l n0lVar) {
        this.f45258a = n0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzk) && this.f45258a.equals(((zzk) obj).f45258a);
    }

    public final int hashCode() {
        return this.f45258a.hashCode();
    }

    public final String toString() {
        return "SetStateAfterTakeFormMarket(dominoModel=" + this.f45258a + Separators.RPAREN;
    }
}
