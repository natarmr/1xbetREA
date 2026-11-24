package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class erw implements hrw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbd f8301a = dbd.f5798a;
    public final mdm b;

    public erw(mdm mdmVar) {
        this.b = mdmVar;
    }

    @Override // a.hrw
    public final dbd a() {
        return this.f8301a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erw)) {
            return false;
        }
        erw erwVar = (erw) obj;
        return this.f8301a == erwVar.f8301a && this.b.equals(erwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8301a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(compactIconState=" + this.f8301a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
