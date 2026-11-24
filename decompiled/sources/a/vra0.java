package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vra0 implements zra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f37891a;

    public vra0(xgl0 xgl0Var) {
        this.f37891a = xgl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vra0) && this.f37891a.equals(((vra0) obj).f37891a);
    }

    public final int hashCode() {
        return this.f37891a.hashCode();
    }

    public final String toString() {
        return "OnMarketLongClick(coefParams=" + this.f37891a + Separators.RPAREN;
    }
}
