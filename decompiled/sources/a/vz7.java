package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vz7 implements yz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz7 f38286a;
    public final int b;

    public vz7(zz7 zz7Var, int i) {
        this.f38286a = zz7Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz7)) {
            return false;
        }
        vz7 vz7Var = (vz7) obj;
        return this.f38286a.equals(vz7Var.f38286a) && this.b == vz7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f38286a.hashCode() * 31);
    }

    public final String toString() {
        return "Current(item=" + this.f38286a + ", throwNumber=" + this.b + Separators.RPAREN;
    }
}
