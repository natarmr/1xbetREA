package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f9o0 implements j9o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9164a;
    public final bp3 b;

    public f9o0(int i) {
        bp3 bp3Var = bp3.c;
        this.f9164a = i;
        this.b = bp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9o0)) {
            return false;
        }
        f9o0 f9o0Var = (f9o0) obj;
        return this.f9164a == f9o0Var.f9164a && this.b == f9o0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f9164a) * 31);
    }

    public final String toString() {
        return "CustomNavBar(navigationBarColorAttr=" + this.f9164a + ", lightNavigationBar=" + this.b + Separators.RPAREN;
    }
}
