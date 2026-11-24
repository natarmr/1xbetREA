package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s2n0 implements t2n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6q0 f31510a;
    public final e1n0 b;
    public final g0n0 c;
    public final wul d;

    public s2n0(c6q0 c6q0Var, e1n0 e1n0Var, g0n0 g0n0Var, wul wulVar) {
        this.f31510a = c6q0Var;
        this.b = e1n0Var;
        this.c = g0n0Var;
        this.d = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2n0)) {
            return false;
        }
        s2n0 s2n0Var = (s2n0) obj;
        return this.f31510a.equals(s2n0Var.f31510a) && this.b.equals(s2n0Var.b) && this.c.equals(s2n0Var.c) && this.d.equals(s2n0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f31510a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MenuCellTextFieldWithButtonItem(textFieldBasicUiModel=" + this.f31510a + ", subSectionTextFieldItem=" + this.b + ", buttonItem=" + this.c + ", buttonUiModel=" + this.d + Separators.RPAREN;
    }
}
