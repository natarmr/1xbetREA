package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dew extends jwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f5971a;

    public dew(l7m0 l7m0Var) {
        this.f5971a = l7m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dew) && this.f5971a == ((dew) obj).f5971a;
    }

    public final int hashCode() {
        return this.f5971a.hashCode();
    }

    public final String toString() {
        return "Content(itemList=" + this.f5971a + Separators.RPAREN;
    }
}
