package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class leb0 implements oeb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mvy f19894a;
    public final jjm b;
    public final String c;

    public leb0(mvy mvyVar, jjm jjmVar) {
        String str;
        this.f19894a = mvyVar;
        this.b = jjmVar;
        if (jjmVar instanceof hjm) {
            str = "LargeBannerGamesCollection" + ((Object) ((hjm) jjmVar).f13167a);
        } else {
            if (!(jjmVar instanceof ijm)) {
                t9f.b();
                throw null;
            }
            str = "LargeBannerGamesCollectionShimmer";
        }
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof leb0)) {
            return false;
        }
        leb0 leb0Var = (leb0) obj;
        return this.f19894a.equals(leb0Var.f19894a) && this.b.equals(leb0Var.b);
    }

    @Override // a.oeb0
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19894a.hashCode() * 31);
    }

    public final String toString() {
        return "LargeBannerGamesCollection(uiModel=" + this.f19894a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
