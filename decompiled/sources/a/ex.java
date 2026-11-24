package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8551a;
    public final x00 b;
    public final j00 c;
    public final String d;

    public ex(int i, x00 x00Var, j00 j00Var, String str) {
        this.f8551a = i;
        this.b = x00Var;
        this.c = j00Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        return this.f8551a == exVar.f8551a && this.b.equals(exVar.b) && this.c.equals(exVar.c) && this.d.equals(exVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f8551a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdditionalCardUiModel(id=" + this.f8551a + ", additionalTopUiModel=" + this.b + ", additionalMiddleUiModel=" + this.c + ", score=" + this.d + Separators.RPAREN;
    }
}
