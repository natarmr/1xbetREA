package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18147a;
    public final mtl b;

    public kec(boolean z, mtl mtlVar) {
        this.f18147a = z;
        this.b = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kec)) {
            return false;
        }
        kec kecVar = (kec) obj;
        return this.f18147a == kecVar.f18147a && this.b.equals(kecVar.b);
    }

    public final int hashCode() {
        return this.b.f22376a.hashCode() + (Boolean.hashCode(this.f18147a) * 31);
    }

    public final String toString() {
        return "ChooseCountryBottomBarStateUiModel(showSelectionButton=" + this.f18147a + ", bottomBarModel=" + this.b + Separators.RPAREN;
    }
}
