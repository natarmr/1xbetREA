package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class pmj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul f27238a;
    public final wul b;

    public pmj0(wul wulVar, wul wulVar2) {
        this.f27238a = wulVar;
        this.b = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmj0)) {
            return false;
        }
        pmj0 pmj0Var = (pmj0) obj;
        return this.f27238a.equals(pmj0Var.f27238a) && this.b.equals(pmj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27238a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareCouponButtonsUiModel(saveButton=" + this.f27238a + ", shareButton=" + this.b + Separators.RPAREN;
    }
}
