package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r2n0 implements t2n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6q0 f29745a;
    public final e1n0 b;
    public final wui0 c;
    public final tvi0 d = qvi0.f29388a;

    public r2n0(c6q0 c6q0Var, e1n0 e1n0Var, wui0 wui0Var) {
        this.f29745a = c6q0Var;
        this.b = e1n0Var;
        this.c = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2n0)) {
            return false;
        }
        r2n0 r2n0Var = (r2n0) obj;
        return this.f29745a.equals(r2n0Var.f29745a) && this.b.equals(r2n0Var.b) && this.c == r2n0Var.c && this.d.equals(r2n0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.c(this.c, (this.b.hashCode() + (this.f29745a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "MenuCellTextFieldItem(textFieldBasicUiModel=" + this.f29745a + ", subSectionTextFieldItem=" + this.b + ", position=" + this.c + ", shape=" + this.d + Separators.RPAREN;
    }
}
