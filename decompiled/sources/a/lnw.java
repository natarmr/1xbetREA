package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lnw implements onw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f20366a;
    public final xmw b;
    public final j9m0 c;

    public lnw(mdm mdmVar, xmw xmwVar, j9m0 j9m0Var) {
        this.f20366a = mdmVar;
        this.b = xmwVar;
        this.c = j9m0Var;
    }

    @Override // a.onw
    public final xmw a() {
        return this.b;
    }

    @Override // a.onw
    public final j9m0 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnw)) {
            return false;
        }
        lnw lnwVar = (lnw) obj;
        return this.f20366a.equals(lnwVar.f20366a) && this.b.equals(lnwVar.b) && this.c.equals(lnwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f20366a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Empty(lottieConfig=" + this.f20366a + ", horseMenuHeaderUiModel=" + this.b + ", statisticBackgroundUiModel=" + this.c + Separators.RPAREN;
    }
}
