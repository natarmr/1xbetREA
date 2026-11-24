package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/tiz;", "La/um40;", "La/uiz;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class tiz extends um40 {
    public final e03 b;
    public final djz c;
    public final k7q0 d;

    public tiz(e03 e03Var, djz djzVar, k7q0 k7q0Var) {
        this.b = e03Var;
        this.c = djzVar;
        this.d = k7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tiz) {
            tiz tizVar = (tiz) obj;
            return Intrinsics.d(this.b, tizVar.b) && this.c == tizVar.c && this.d == tizVar.d;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new uiz(this.b, this.c, this.d);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        uiz uizVar = (uiz) lm40Var;
        if (uizVar.n) {
            uizVar.o.b();
            uizVar.o.k(uizVar);
        }
        e03 e03Var = this.b;
        uizVar.o = e03Var;
        if (uizVar.n) {
            if (e03Var.f6971a != null) {
                adx.c("Expected textInputModifierNode to be null");
            }
            e03Var.f6971a = uizVar;
        }
        uizVar.p = this.c;
        uizVar.q = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + Separators.RPAREN;
    }
}
