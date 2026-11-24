package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g980 implements j980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10902a;
    public final String b;
    public final f980 c;
    public final e980 d;
    public final boolean e;

    public g980(boolean z, String str, f980 f980Var, e980 e980Var, boolean z2) {
        this.f10902a = z;
        this.b = str;
        this.c = f980Var;
        this.d = e980Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g980)) {
            return false;
        }
        g980 g980Var = (g980) obj;
        return this.f10902a == g980Var.f10902a && this.b.equals(g980Var.b) && this.c.equals(g980Var.c) && this.d.equals(g980Var.d) && this.e == g980Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(Boolean.hashCode(this.f10902a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("Content(isLoading=", ", message=", this.b, this.f10902a, ", phoneFieldUiModel=");
        sbQ.append(this.c);
        sbQ.append(", languageFieldUiModel=");
        sbQ.append(this.d);
        sbQ.append(", isBtnEnabled=");
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
