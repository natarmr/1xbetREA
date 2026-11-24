package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zjf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb f44479a;

    public final boolean equals(Object obj) {
        if (obj instanceof zjf) {
            return this.f44479a.equals(((zjf) obj).f44479a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44479a.hashCode();
    }

    public final String toString() {
        return "OnChampInfoAction(value=" + this.f44479a + Separators.RPAREN;
    }
}
