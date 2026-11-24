package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rv60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvy f31157a;
    public final mo60 b;

    public rv60(rvy rvyVar, mo60 mo60Var) {
        this.f31157a = rvyVar;
        this.b = mo60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv60)) {
            return false;
        }
        rv60 rv60Var = (rv60) obj;
        return this.f31157a.equals(rv60Var.f31157a) && this.b.equals(rv60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31157a.hashCode() * 31);
    }

    public final String toString() {
        return "LargeBannerGamesUiModelWrapper(uiModel=" + this.f31157a + ", oneXGameWithCategoryUiModel=" + this.b + Separators.RPAREN;
    }
}
