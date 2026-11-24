package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nnw implements onw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmw f23844a;
    public final j9m0 b;

    public nnw(xmw xmwVar, j9m0 j9m0Var) {
        this.f23844a = xmwVar;
        this.b = j9m0Var;
    }

    @Override // a.onw
    public final xmw a() {
        return this.f23844a;
    }

    @Override // a.onw
    public final j9m0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnw)) {
            return false;
        }
        nnw nnwVar = (nnw) obj;
        return this.f23844a.equals(nnwVar.f23844a) && this.b.equals(nnwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23844a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(horseMenuHeaderUiModel=" + this.f23844a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
