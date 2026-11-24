package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rqd0 implements vqd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xsd0 f30927a;

    public rqd0(xsd0 xsd0Var) {
        this.f30927a = xsd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqd0) && this.f30927a.equals(((rqd0) obj).f30927a);
    }

    public final int hashCode() {
        return this.f30927a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(menuType=" + this.f30927a + Separators.RPAREN;
    }
}
