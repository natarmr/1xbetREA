package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class crv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4863a;
    public final b8m b;
    public final yx80 c;

    public crv(String str, b8m b8mVar, yx80 yx80Var) {
        this.f4863a = str;
        this.b = b8mVar;
        this.c = yx80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crv)) {
            return false;
        }
        crv crvVar = (crv) obj;
        return this.f4863a.equals(crvVar.f4863a) && this.b.equals(crvVar.b) && this.c.equals(crvVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f4863a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4863a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HeaderFocusPartnersCardCollectionUiModel(key=" + this.f4863a + ", header=" + this.b + ", partnerCardCollection=" + this.c + Separators.RPAREN;
    }
}
