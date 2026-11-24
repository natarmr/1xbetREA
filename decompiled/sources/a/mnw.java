package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mnw implements onw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f22110a;
    public final xmw b;
    public final j9m0 c;

    public mnw(mdm mdmVar, xmw xmwVar, j9m0 j9m0Var) {
        this.f22110a = mdmVar;
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
        if (!(obj instanceof mnw)) {
            return false;
        }
        mnw mnwVar = (mnw) obj;
        return this.f22110a.equals(mnwVar.f22110a) && this.b.equals(mnwVar.b) && this.c.equals(mnwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f22110a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f22110a + ", horseMenuHeaderUiModel=" + this.b + ", statisticBackgroundUiModel=" + this.c + Separators.RPAREN;
    }
}
