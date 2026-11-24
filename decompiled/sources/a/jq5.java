package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jq5 implements lq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp5 f16933a;

    public /* synthetic */ jq5() {
        this(cp5.f4728a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq5) && this.f16933a == ((jq5) obj).f16933a;
    }

    public final int hashCode() {
        return this.f16933a.hashCode();
    }

    public final String toString() {
        return "SquareS(cardType=" + this.f16933a + Separators.RPAREN;
    }

    public jq5(cp5 cp5Var) {
        this.f16933a = cp5Var;
    }
}
