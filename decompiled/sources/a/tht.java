package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f33976a;
    public final wul b;

    public tht(imm immVar, wul wulVar) {
        this.f33976a = immVar;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tht)) {
            return false;
        }
        tht thtVar = (tht) obj;
        return this.f33976a.equals(thtVar.f33976a) && this.b.equals(thtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33976a.hashCode() * 31);
    }

    public final String toString() {
        return "GenerateCouponResource(generateNavigationBarUiModel=" + this.f33976a + ", generateButtonUiModel=" + this.b + Separators.RPAREN;
    }
}
