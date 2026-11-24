package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vor0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f37780a;
    public final String b;

    public vor0(n3w n3wVar, String str) {
        this.f37780a = n3wVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vor0)) {
            return false;
        }
        vor0 vor0Var = (vor0) obj;
        return this.f37780a.equals(vor0Var.f37780a) && this.b.equals(vor0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37780a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoItemWithCurrencyCodeModel(historyItemModel=" + this.f37780a + ", currencyCode=" + this.b + Separators.RPAREN;
    }
}
