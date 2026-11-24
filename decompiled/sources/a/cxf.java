package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cxf extends dtb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf5 f5120a = new pf5(3, null);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxf) && this.f5120a.equals(((cxf) obj).f5120a);
    }

    public final int hashCode() {
        return this.f5120a.hashCode();
    }

    public final String toString() {
        return "Content(style=" + this.f5120a + Separators.RPAREN;
    }
}
