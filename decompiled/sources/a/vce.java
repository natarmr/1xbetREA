package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vce implements lde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xfe0 f37183a;

    public vce(xfe0 xfe0Var) {
        this.f37183a = xfe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vce) && this.f37183a.equals(((vce) obj).f37183a);
    }

    public final int hashCode() {
        return this.f37183a.hashCode();
    }

    public final String toString() {
        return "Empty(item=" + this.f37183a + Separators.RPAREN;
    }
}
