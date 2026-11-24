package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xzk implements b0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0l f41758a;

    public xzk(n0l n0lVar) {
        this.f41758a = n0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzk) && this.f41758a.equals(((xzk) obj).f41758a);
    }

    public final int hashCode() {
        return this.f41758a.hashCode();
    }

    public final String toString() {
        return "SetStateAfterAction(dominoModel=" + this.f41758a + Separators.RPAREN;
    }
}
