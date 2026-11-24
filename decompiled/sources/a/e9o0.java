package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e9o0 implements j9o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7431a;
    public final int b;
    public final bp3 c;
    public final bp3 d;

    public e9o0(int i, int i2, bp3 bp3Var, bp3 bp3Var2) {
        bp3Var.getClass();
        this.f7431a = i;
        this.b = i2;
        this.c = bp3Var;
        this.d = bp3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9o0)) {
            return false;
        }
        e9o0 e9o0Var = (e9o0) obj;
        return this.f7431a == e9o0Var.f7431a && this.b == e9o0Var.b && this.c == e9o0Var.c && this.d == e9o0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f7431a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("Custom(statusBarColorAttr=", this.f7431a, ", navigationBarColorAttr=", ", lightStatusBar=", this.b);
        sbT.append(this.c);
        sbT.append(", lightNavigationBar=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }

    public /* synthetic */ e9o0(int i, int i2, int i3) {
        this(i, i2, (i3 & 4) != 0 ? bp3.c : bp3.b, bp3.c);
    }
}
