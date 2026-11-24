package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h4o implements s4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f12442a;

    public final boolean equals(Object obj) {
        if (obj instanceof h4o) {
            return this.f12442a.equals(((h4o) obj).f12442a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12442a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f12442a + Separators.RPAREN;
    }
}
