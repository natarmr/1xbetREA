package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pxh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27754a;
    public final int b;

    public pxh0(String str, int i) {
        this.f27754a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxh0)) {
            return false;
        }
        pxh0 pxh0Var = (pxh0) obj;
        return this.f27754a.equals(pxh0Var.f27754a) && this.b == pxh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f27754a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "SekaCardsSumUiModel(cardsSum=", this.f27754a, ", background=", Separators.RPAREN);
    }
}
