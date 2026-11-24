package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vvr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38116a;
    public final mtr0 b;
    public final erq0 c;

    public vvr0(String str, mtr0 mtr0Var, erq0 erq0Var) {
        this.f38116a = str;
        this.b = mtr0Var;
        this.c = erq0Var;
    }

    public static vvr0 a(vvr0 vvr0Var, String str, mtr0 mtr0Var, erq0 erq0Var, int i) {
        if ((i & 1) != 0) {
            str = vvr0Var.f38116a;
        }
        if ((i & 2) != 0) {
            mtr0Var = vvr0Var.b;
        }
        if ((i & 4) != 0) {
            erq0Var = vvr0Var.c;
        }
        return new vvr0(str, mtr0Var, erq0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvr0)) {
            return false;
        }
        vvr0 vvr0Var = (vvr0) obj;
        return this.f38116a.equals(vvr0Var.f38116a) && this.b.equals(vvr0Var.b) && this.c.equals(vvr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f38116a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TotoTirageTopBarState(backgroundImageUrl=" + this.f38116a + ", navigationBarState=" + this.b + ", tirageTopBarContentState=" + this.c + Separators.RPAREN;
    }
}
